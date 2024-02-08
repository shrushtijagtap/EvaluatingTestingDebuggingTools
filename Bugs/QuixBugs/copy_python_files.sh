#!/bin/bash

# Define QuixBugs directory
quixbugs_dir="/Users/sejalpekam/MCS/Spring 24/CS 527 Topics in SE/Final/CS527-Project/Bugs/QuixBugs"
python_programs_dir="/Users/sejalpekam/MCS/Spring 24/CS 527 Topics in SE/Project/Milestone 1/QuixBugs/python_programs"
correct_python_programs_dir="/Users/sejalpekam/MCS/Spring 24/CS 527 Topics in SE/Project/Milestone 1/QuixBugs/correct_python_programs"

# Function to copy Python files and create necessary directories
copy_python_files() {
    local program_dir="$1"
    local program_name=$(basename "$program_dir")
    local program_name_lower=$(echo "$program_name" | tr '[:upper:]' '[:lower:]')
    
    # Create Python directory and its subdirectories if not exist
    mkdir -p "$program_dir/Python/buggy"
    mkdir -p "$program_dir/Python/fixed"
    
    # Copy file from python_programs to buggy folder
    cp "$python_programs_dir/$program_name_lower.py" "$program_dir/Python/buggy/$program_name_lower.py"

    # Copy file from correct_python_programs to fixed folder
    cp "$correct_python_programs_dir/$program_name_lower.py" "$program_dir/Python/fixed/$program_name_lower.py"
}

# Loop through each program directory in QuixBugs directory
for program_dir in "$quixbugs_dir"/*/; do
    if [ -d "$program_dir" ]; then
        copy_python_files "$program_dir"
    fi
done
