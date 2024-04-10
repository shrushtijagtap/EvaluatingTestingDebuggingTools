var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":73,"id":48239,"methods":[{"el":23,"sc":5,"sl":13},{"el":35,"sc":5,"sl":25},{"el":48,"sc":5,"sl":37}],"name":"JsonSeeAlsoTest","sl":11},{"el":52,"id":48261,"methods":[],"name":"JsonSeeAlsoTest.Animal","sl":51},{"el":57,"id":48261,"methods":[],"name":"JsonSeeAlsoTest.Dog","sl":55},{"el":62,"id":48261,"methods":[],"name":"JsonSeeAlsoTest.Cat","sl":60},{"el":67,"id":48261,"methods":[],"name":"JsonSeeAlsoTest.Tidy","sl":65},{"el":72,"id":48261,"methods":[],"name":"JsonSeeAlsoTest.Labrador","sl":70}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2070":{"methods":[{"sl":25}],"name":"test_seeAlso_cat","pass":true,"statements":[{"sl":26},{"sl":27},{"sl":29},{"sl":30},{"sl":32},{"sl":34}]},"test_2115":{"methods":[{"sl":13}],"name":"test_seeAlso_dog","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":17},{"sl":18},{"sl":20},{"sl":22}]},"test_3161":{"methods":[{"sl":37}],"name":"test_seeAlso_tidy","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":40},{"sl":42},{"sl":43},{"sl":45},{"sl":47}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [2115], [2115], [2115], [], [2115], [2115], [], [2115], [], [2115], [], [], [2070], [2070], [2070], [], [2070], [2070], [], [2070], [], [2070], [], [], [3161], [3161], [3161], [3161], [], [3161], [3161], [], [3161], [], [3161], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
