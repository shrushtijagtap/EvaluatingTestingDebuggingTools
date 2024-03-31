import json
import logging
import subprocess
import os
from enum import Enum
from pathlib import Path

# ----  Set up logging ----
logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)

# ---- Configuration variables ----
# repo path = current directory
REPO_PATH: Path = Path.cwd()
EVOSUITE_JAR = "/Users/shrushtijagtap/uiuc/Spring2024/CS527/evosuite-1.2.0.jar"
#RANDOOP_JAR = os.path.join(os.path.expanduser("~"), "Downloads", "randoop-4.3.2", "randoop-all-4.3.2.jar")
FAILED_PROJECTS_compile = []
failed_evosuite_project = []
passed_evosuite_project = []
nonmvnprojects = []

class Dataset(Enum):
    DEFECTS4J = "Defects4J"
    QUIXBUGS = "QuixBugs"
    BEARS = "Bears"
    BUGSWARM = "BugSwarm"


def validPath(pathpassed, filename, bugorfixVersion = ""):
    path = str(pathpassed)
    full_path = os.path.join(path, bugorfixVersion, filename)
    
    if not Path(full_path).is_file() and "Gson" in path:
        full_path = os.path.join(path, bugorfixVersion, "gson", filename)
        return full_path

    if not Path(full_path).is_file():
        full_path = os.path.join(path, bugorfixVersion, "src", filename)
        if not Path(full_path).is_file():
            full_path = os.path.join(path, bugorfixVersion, "source", filename)

    #print("valid path: ", full_path)
    return full_path


def extract_class_name(test_name, version_path):
    res_line = ""
    diffPath = version_path.parent / "Diff"
    with open(diffPath, "r") as file:
        lines = file.readlines()
        for line in lines:
            if test_name in line:
                res_line = line.strip()
                break
    # a/Math_3/Buggy-Version/src/main/java/org/apache/commons/math3/util/MathArrays.java
    
    if "Buggy-Version" in res_line:
        buggy_version_index = res_line.find("Buggy-Version")
    else:
        buggy_version_index = res_line.find("Patched-Version")

    # print(res_line)
    testclass_index = res_line.find(testclass)
    resultt = res_line[buggy_version_index+len("Buggy-Version"):testclass_index]

    # print("resultt: ", resultt)
    return str(resultt).strip()
            

def initialize_jenv():
    """
    Using this at the moment to ensure that my Java environment is set up correctly
    """
    subprocess.check_output(['jenv', 'init', '-'], universal_newlines=True)
    # Set the JAVA_HOME environment variable to /Library/Java/JavaVirtualMachines/temurin-8.jdk/Contents/Home
    os.environ['JAVA_HOME'] = '/Library/Java/JavaVirtualMachines/temurin-8.jdk/Contents/Home'


def compile_project_maven(project_dir):
    """
    Compile a single project using Maven. If compilation fails, continue with the next project and
    add the project to the list of failed projects to check manually later.
    """
    # if mvn: 
    command = ['mvn', 'clean', 'compile']
    try:
        subprocess.run(command, check=True, cwd=project_dir, capture_output=True)
        return True, ""
    except subprocess.CalledProcessError as e:
        logger.error(f"Failed to compile {e.output}")
        return False, e.stderr.decode()
    

def compile_project_javac(bug, class_names, version, version_path):
    """
    Compile a single project using Maven. If compilation fails, continue with the next project and
    add the project to the list of failed projects to check manually later.
    """
    #     javac
    command = ['defects4j', 'compile', '-w', version_path]
    try:
        subprocess.run(command, check=True, cwd=version_path, capture_output=True)
        return True, ""
    except subprocess.CalledProcessError as e:
        logger.error(f"Failed to compile {e.output}")
        return False, e.stderr.decode()
    # for class_name in class_names:
    #     classpath = validPath(bug, class_name, version)
    #     command = ['javac', classpath]
    #     # command = ['javac', '-cp', classpath, classpath]
    #     try:
    #         subprocess.run(command, check=True, capture_output=True)
    #     except subprocess.CalledProcessError as e:
    #         logger.error(f"Failed to compile {e.output}")
    #         return False, e.stderr.decode()
    

def run_maven_classpath(project_dir):
    print("running maven classpath")
    command = ['mvn', 'dependency:build-classpath', '-Dmdep.outputFile=cp.txt']
    subprocess.run(command, check=True, cwd=project_dir)
    # classpath_file = os.path.join(project_dir, 'cp.txt')
    # with open(classpath_file, 'r') as file:
    #     return file.read().strip()


def generate_randoop_test(classpath: str, testclass: str, version: str, output_dir: str):
    """
    Generate tests for a single test class using Randoop
    """
    # TODO: Use the version to determine what test to generate and where to place it

    # java -classpath ${RANDOOP_JAR} randoop.main.Main gentests --classlist=myclasses.txt --time-limit=60
    command = [
        'java', '-classpath', f"{classpath}:{RANDOOP_JAR}", 'randoop.main.Main', 'gentests',
        '--testclass=' + testclass, '--time-limit=60', '--junit-output-dir=' + output_dir
    ]

    subprocess.run(command, check=True)


def generate_evosuite_test(classpath: str, testclass: str, version_path: str, isMaven: bool):
    """
    Generate tests for a single test class using EvoSuite
    """
     # $(echo $EVOSUITE) -class className -projectCP pathToClassFiles
    testclass = testclass.replace(".java", "")
    testclass = testclass.replace("/", ".")
    # classpath = str(version_path) + "/build"
    # if isMaven:
    #     classpath = str(version_path) + "/target/classes" + extract_class_name(testclass, version_path)
    # else:
    #     classpath = str(version_path) + extract_class_name(testclass, version_path)
    # [:-1] to remove the last character which is a newline
    # if "Closure" in str(version_path):
    #     classpath += "/classes"
    # elif "Mockito" in str(version_path):
    #     classpath += "/classes/main"
    # elif "Mockito" in str(version_path):
    #     classpath = classpath.replace("/build", "")
    classpath += "/target/classes"
        
    print("classpath: ", classpath, " *** testclass:", testclass)

    command = [
       'java', '-jar', EVOSUITE_JAR, '-class', testclass, '-projectCP', classpath, '-base_dir', version_path
    ]

    try:
        subprocess.run(command, check=True)
        print("generated evosuite_test for", testclass)
        passed_evosuite_project.append([testclass, classpath])
    except subprocess.CalledProcessError as e:
        failed_evosuite_project.append([testclass, classpath])
        print("generated evosuite_test failed for", testclass)


if __name__ == '__main__':
    # For each dataset:
    # For each bug:
    # For both buggy and patched versions:
    # 1. Compile the project
    # 2. Run Randoop to generate tests
    # 3. Store generated tests under the projects test folder
    # 4. Rename the generated tests to be prefixed with "Randoop"

    # NOTE: You can remove this is your JAVA_HOME is already set or modify it to point to the correct path
    # initialize_jenv()
    breakornot = False
    for dataset in Dataset:
        # NOTE: Temporarily only testing the BEARS dataset
        if dataset is not Dataset.DEFECTS4J:
            continue

        # Root path for the dataset
        dataset_path = REPO_PATH / dataset.value

        # Iterate over each bug in the dataset
        for bug in dataset_path.iterdir():
            print("*******************", bug.name,"***********************")

            # Just look at project directories
            if not bug.is_dir() or bug.name == "results":
                continue

            # Compile and generate tests for both buggy and patched versions
            for version in ["Buggy-Version", "Patched-Version"]:
                version_path = bug / version
                logger.info(f"Processing {dataset.value}-{bug.name}-{version}")
                logger.debug(f"Path: {version_path}")


                # Get the list of failed tests for the bug to check the class we need to generate tests for
                failed_test_file = version_path.parent / 'modified_classes.txt'
                class_names = set()
                with open(failed_test_file, 'r') as file:
                    failed_tests = file.read().splitlines()
                    for test in failed_tests:
                        class_names.add(test)

                logger.debug(f"Failed class: {class_names}")

                pom_file = os.path.join(version_path, 'pom.xml')
                # if os.path.exists(pom_file):
                #     breakornot = True
                #     continue
                # else:
                #     nonmvnprojects.append([dataset.value, bug.name, version])
                #     breakornot = False

                # Compile the project if it has not been compiled yet
                # NOTE: Remove this check if you want to recompile the project every time
                if True:
                # not (version_path / 'target').exists():
                    # if os.path.exists(pom_file):
                    #     success, error_message = compile_project_maven(version_path)
                    # else:
                    print("hii")
                    success, error_message = compile_project_javac(bug, class_names, version, version_path)
                    
                    # If project was not compiled successfully, add it to the list of failed projects
                    # and continue with the next project.
                    if not success:
                        FAILED_PROJECTS_compile.append({
                            "dataset": dataset.value,
                            "bug": bug.name,
                            "version": version,
                            "error": error_message
                        })
                        logger.error(f" **** Failed to compile {dataset.value}-{bug.name}-{version} **** ")
                        continue
                else:
                    logger.info(f"Project already compiled: {dataset.value}-{bug.name}-{version}")

                # if os.path.exists(pom_file):
                #     # breakornot = False
                #     run_maven_classpath(version_path)
                # else:
                #     breakornot = True
                #     continue

                for testclass in class_names:
                    classpath = validPath(bug, testclass, version)
                    logger.info(f"Generating tests for {testclass} in {version}...")
                    #generate_randoop_test(classpath, testclass, version, str(output_dir))
                    generate_evosuite_test(classpath, testclass, version_path, os.path.exists(pom_file))
                    logger.info(f"Test generation completed for {dataset.value}-{bug.name}-{version}")

        # if breakornot:
        #     continue

    
    # Save the failed project data to a JSON file
    with open('failed_projects_compile.json', 'w') as file:
        json.dump(FAILED_PROJECTS_compile, file, indent=4)

    with open('failed_projects_evosuite.json', 'w') as file:
        json.dump(failed_evosuite_project, file, indent=4)

    with open('non-mvnprojects.json', 'w') as file:
        json.dump(nonmvnprojects, file, indent=4)

