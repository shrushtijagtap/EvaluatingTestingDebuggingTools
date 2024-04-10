var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":60,"id":42010,"methods":[{"el":24,"sc":5,"sl":11}],"name":"AnnotationTest2","sl":9},{"el":59,"id":42020,"methods":[{"el":35,"sc":9,"sl":33},{"el":39,"sc":9,"sl":37},{"el":43,"sc":9,"sl":41},{"el":47,"sc":9,"sl":45},{"el":52,"sc":9,"sl":49},{"el":57,"sc":9,"sl":54}],"name":"AnnotationTest2.User","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1883":{"methods":[{"sl":11},{"sl":33},{"sl":37},{"sl":41},{"sl":45},{"sl":49},{"sl":54}],"name":"test_codec","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14},{"sl":15},{"sl":17},{"sl":18},{"sl":20},{"sl":22},{"sl":23},{"sl":34},{"sl":38},{"sl":42},{"sl":46},{"sl":51},{"sl":56}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [1883], [1883], [1883], [1883], [1883], [], [1883], [1883], [], [1883], [], [1883], [1883], [], [], [], [], [], [], [], [], [], [1883], [1883], [], [], [1883], [1883], [], [], [1883], [1883], [], [], [1883], [1883], [], [], [1883], [], [1883], [], [], [1883], [], [1883], [], [], [], []]
