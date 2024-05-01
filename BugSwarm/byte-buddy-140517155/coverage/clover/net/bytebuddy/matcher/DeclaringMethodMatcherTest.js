var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":51,"id":51235,"methods":[{"el":26,"sc":5,"sl":23},{"el":38,"sc":5,"sl":28},{"el":50,"sc":5,"sl":40}],"name":"DeclaringMethodMatcherTest","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_5181":{"methods":[{"sl":28}],"name":"testMatch","pass":true,"statements":[{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":37}]},"test_5414":{"methods":[{"sl":40}],"name":"testNoMatch","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":48},{"sl":49}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [5181], [], [], [5181], [5181], [5181], [5181], [5181], [5181], [5181], [], [], [5414], [], [], [5414], [5414], [5414], [5414], [5414], [5414], [5414], [], []]
