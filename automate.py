import json

import re
import os

import sys
from andres_bug_benchmark_edit import process_bug

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
        BUG_NAMES = os.listdir(os.path.join(os.path.dirname(__file__), 'Bugs', bugDataset))

    if bugName == None or bugName not in BUG_NAMES:
        print("Invalid argument - Bug Name")

    if metric == None or metric not in METRICS:
        print("Invalid argument - Metric")
    