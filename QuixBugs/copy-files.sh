#!/bin/bash

# Define directories
java_programs_dir="/Users/sejalpekam/MCS/Spring 24/CS 527 Topics in SE/Project/Milestone 1/QuixBugs/java_programs"
correct_java_programs_dir="/Users/sejalpekam/MCS/Spring 24/CS 527 Topics in SE/Project/Milestone 1/QuixBugs/correct_java_programs"
java_testcases_dir="/Users/sejalpekam/MCS/Spring 24/CS 527 Topics in SE/Project/Milestone 1/QuixBugs/java_testcases/junit"

# Loop through each file in java_programs directory
for file in "$java_programs_dir"/*; do
    if [ -f "$file" ]; then
        filename=$(basename "$file")
        dirname="${filename%.*}"
        
        # Create necessary directories if not exist
        mkdir -p "$dirname/Buggy-Version"
        mkdir -p "$dirname/Patched-Version"
        mkdir -p "$dirname/Buggy-Version/java_programs"
        mkdir -p "$dirname/Patched-Version/correct_java_programs"
        mkdir -p "$dirname/Buggy-Version/java_testcases"
        mkdir -p "$dirname/Buggy-Version/java_testcases/junit"
        mkdir -p "$dirname/Patched-Version/java_testcases"
        mkdir -p "$dirname/Patched-Version/java_testcases/junit"
        mkdir -p "$dirname/Patched-Version/java_testcases/junit/crt_program"

        # Copy file from java_programs to buggy folder
        cp "$file" "$dirname/Buggy-Version/java_programs/$filename"
    fi
done

# Loop through each file in correct_java_programs directory
for file in "$correct_java_programs_dir"/*; do
    if [ -f "$file" ]; then
        filename=$(basename "$file")
        dirname="${filename%.*}"
        
        # Copy file from correct_java_programs to fixed folder
        cp "$file" "$dirname/Patched-Version/correct_java_programs/$filename"
    fi
done


for file in "$java_testcases_dir"/*_TEST.java; do
    if [ -f "$file" ]; then
        # Extract directory name from the filename
        filename=$(basename "$file" .java)
        dirname="${filename/_TEST/}"

        cp "$file" "$dirname/Buggy-Version/java_testcases/junit/$filename"
    fi
done


for file in "$java_testcases_dir/crt_program"/*_TEST.java; do
    if [ -f "$file" ]; then
        filename=$(basename "$file" .java)
        dirname="${filename/_TEST/}"
  
        cp "$file" "$dirname/Patched-Version/java_testcases/junit/crt_program/$filename"
    fi
done

quixbugs_dir="/Users/sejalpekam/MCS/Spring 24/CS 527 Topics in SE/Final Milestone 3/CS527-Project/QuixBugs"


build_file="/Users/sejalpekam/MCS/Spring 24/CS 527 Topics in SE/Project/Milestone 1/QuixBugs/build.gradle"
helper_buggy="/Users/sejalpekam/MCS/Spring 24/CS 527 Topics in SE/Project/Milestone 1/QuixBugs/java_testcases/junit/QuixFixOracleHelper.java"
helper_patched="/Users/sejalpekam/MCS/Spring 24/CS 527 Topics in SE/Project/Milestone 1/QuixBugs/java_testcases/junit/crt_program/QuixFixOracleHelper.java"

# Loop through each folder in the directory
for folder in "$quixbugs_dir"/*; do
    if [ -d "$folder" ]; then  # Check if it's a directory
        cp "$build_file" "$folder/Buggy-Version/"
        cp "$build_file" "$folder/Patched-Version"
        cp "$helper_buggy" "$folder/Buggy-Version/java_testcases/junit"
        cp "$helper_patched" "$folder/Patched-Version/java_testcases/junit/crt_program"
    fi
done

echo "Copying completed."