#!/bin/bash

# Define directories
java_programs_dir="/Users/sejalpekam/MCS/Spring 24/CS 527 Topics in SE/Project/Milestone 1/QuixBugs/java_programs"
correct_java_programs_dir="/Users/sejalpekam/MCS/Spring 24/CS 527 Topics in SE/Project/Milestone 1/QuixBugs/correct_java_programs"

# Loop through each file in java_programs directory
for file in "$java_programs_dir"/*; do
    if [ -f "$file" ]; then
        filename=$(basename "$file")
        dirname="${filename%.*}"
        
        # Create necessary directories if not exist
        mkdir -p "$dirname/Java/buggy"
        mkdir -p "$dirname/Java/fixed"

        # Copy file from java_programs to buggy folder
        cp "$file" "$dirname/Java/buggy/$filename"
    fi
done

# Loop through each file in correct_java_programs directory
for file in "$correct_java_programs_dir"/*; do
    if [ -f "$file" ]; then
        filename=$(basename "$file")
        dirname="${filename%.*}"
        
        # Copy file from correct_java_programs to fixed folder
        cp "$file" "$dirname/Java/fixed/$filename"
    fi
done
