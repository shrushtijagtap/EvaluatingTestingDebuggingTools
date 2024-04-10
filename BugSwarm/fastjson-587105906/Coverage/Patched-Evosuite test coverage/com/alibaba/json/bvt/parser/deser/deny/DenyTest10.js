var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":45,"id":75642,"methods":[{"el":23,"sc":5,"sl":16},{"el":28,"sc":5,"sl":25},{"el":33,"sc":5,"sl":30},{"el":38,"sc":5,"sl":35},{"el":44,"sc":5,"sl":40}],"name":"DenyTest10","sl":13}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3381":{"methods":[{"sl":35}],"name":"test_hashMap_concurrentHashMap","pass":true,"statements":[{"sl":36},{"sl":37}]},"test_4030":{"methods":[{"sl":40}],"name":"test_uuid","pass":true,"statements":[{"sl":41},{"sl":42},{"sl":43}]},"test_4500":{"methods":[{"sl":30}],"name":"test_hashMap_weekHashMap","pass":true,"statements":[{"sl":31},{"sl":32}]},"test_666":{"methods":[{"sl":25}],"name":"test_hashMap","pass":true,"statements":[{"sl":26},{"sl":27}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [666], [666], [666], [], [], [4500], [4500], [4500], [], [], [3381], [3381], [3381], [], [], [4030], [4030], [4030], [4030], [], []]
