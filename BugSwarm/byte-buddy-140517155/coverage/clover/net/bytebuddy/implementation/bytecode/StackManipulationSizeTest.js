var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":49400,"methods":[{"el":18,"sc":5,"sl":11},{"el":27,"sc":5,"sl":20},{"el":36,"sc":5,"sl":29},{"el":41,"sc":5,"sl":38}],"name":"StackManipulationSizeTest","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1181":{"methods":[{"sl":11}],"name":"testSizeGrowth","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":17}]},"test_1819":{"methods":[{"sl":38}],"name":"testObjectProperties","pass":true,"statements":[{"sl":40}]},"test_2216":{"methods":[{"sl":20}],"name":"testSizeReduction","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26}]},"test_972":{"methods":[{"sl":29}],"name":"testSizeGrowthAndReduction","pass":true,"statements":[{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":35}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [1181], [], [1181], [1181], [1181], [1181], [1181], [], [], [2216], [], [2216], [2216], [2216], [2216], [2216], [], [], [972], [], [972], [972], [972], [972], [972], [], [], [1819], [], [1819], [], []]
