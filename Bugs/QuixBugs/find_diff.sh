#!/bin/bash

# Define QuixBugs directory
quixbugs_dir="/Users/sejalpekam/MCS/Spring 24/CS 527 Topics in SE/Final/CS527-Project/Bugs/QuixBugs"

# Function to generate diff file
generate_diff() {
    local buggy_file="$1"
    local fixed_file="$2"
    local diff_file="$3"
    
    diff --color -ur "$buggy_file" "$fixed_file" > "$diff_file"
}

# Loop through each program directory in QuixBugs directory
for program_dir in "$quixbugs_dir"/*/; do
    if [ -d "$program_dir" ]; then
        program_name_upper=$(basename "$program_dir")
        program_name=$(echo "$program_name_upper" | tr '[:upper:]' '[:lower:]')
        buggy_file="$program_dir/Python/buggy/$program_name.py"
        fixed_file="$program_dir/Python/fixed/$program_name.py"
        
        # Check if both buggy and fixed files exist
        if [ -f "$buggy_file" ] && [ -f "$fixed_file" ]; then
            # Generate diff file
            diff_file="$program_dir/Python/src.patch"
            generate_diff "$buggy_file" "$fixed_file" "$diff_file"
        else
            echo "Error: Buggy or fixed file missing for program $program_name"
        fi
    fi
done
