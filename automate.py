from os import path, listdir

import sys
from Bugs.Bears.scripts.bug_benchmarks import process_bug as bears_process_bug
from Bugs.QuixBugs.benchmarking_Quixbugs import process_bug as quixbugs_process_bug
from Bugs.Defects4J.defects4j_benchmarking import process_bug as defects4j_process_bug
from Bugs.BugSwarm.bugswarm_benchmarking import process_bug as bugswarm_process_bug

if __name__ == "__main__":

    BUG_DATASET = ['Defects4J', 'Bears', 'QuixBugs', 'BugSwarm']
    METRICS = ['CChange', 'MChange', 'LChange', 'LD', 'CB', 'CP', 'CC', 'CodeBLEU']
    bugDataset = None
    bugName = None
    metric = None

    if len(sys.argv) < 4:
        print("Invalid number of parameters given to the script")

    bugDataset = sys.argv[1]
    bugName = sys.argv[2]
    metric = sys.argv[3]
    
    if bugDataset == None or bugDataset not in BUG_DATASET:
        print("Invalid argument - Bug Dataset")
    else:
        BUG_NAMES = listdir(path.join(path.dirname(__file__), 'Bugs', bugDataset))

    if bugName == None or bugName not in BUG_NAMES:
        print("Invalid argument - Bug Name")

    if metric == None or metric not in METRICS:
        print("Invalid argument - Metric")
    
    bugPath = path.join(path.dirname(__file__), 'Bugs', bugDataset, bugName)
    
    # Assuming all the bug benchmarking files are similar to Bears benchamraking file

    options = {
        'Bears': bears_process_bug,
        'Defects4J': defects4j_process_bug,
        'QuixBugs': quixbugs_process_bug,
        'BugSwarm': bugswarm_process_bug
    }

    print(options[bugDataset](bugPath, metric))