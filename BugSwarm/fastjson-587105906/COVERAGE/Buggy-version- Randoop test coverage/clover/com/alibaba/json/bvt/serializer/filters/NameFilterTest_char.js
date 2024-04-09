var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":88,"id":87344,"methods":[{"el":26,"sc":13,"sl":18},{"el":39,"sc":5,"sl":15},{"el":50,"sc":13,"sl":44},{"el":64,"sc":5,"sl":41}],"name":"NameFilterTest_char","sl":13},{"el":87,"id":87376,"methods":[{"el":73,"sc":9,"sl":71},{"el":77,"sc":9,"sl":75},{"el":81,"sc":9,"sl":79},{"el":85,"sc":9,"sl":83}],"name":"NameFilterTest_char.Bean","sl":66}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1006":{"methods":[{"sl":15},{"sl":18},{"sl":71},{"sl":79}],"name":"test_namefilter","pass":true,"statements":[{"sl":16},{"sl":20},{"sl":21},{"sl":22},{"sl":25},{"sl":30},{"sl":31},{"sl":32},{"sl":34},{"sl":35},{"sl":37},{"sl":38},{"sl":72},{"sl":80}]},"test_3424":{"methods":[{"sl":41},{"sl":44}],"name":"test_namefilter_1","pass":true,"statements":[{"sl":42},{"sl":45},{"sl":46},{"sl":54},{"sl":55},{"sl":56},{"sl":58},{"sl":59},{"sl":60},{"sl":62},{"sl":63}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1006], [1006], [], [1006], [], [1006], [1006], [1006], [], [], [1006], [], [], [], [], [1006], [1006], [1006], [], [1006], [1006], [], [1006], [1006], [], [], [3424], [3424], [], [3424], [3424], [3424], [], [], [], [], [], [], [], [3424], [3424], [3424], [], [3424], [3424], [3424], [], [3424], [3424], [], [], [], [], [], [], [], [1006], [1006], [], [], [], [], [], [], [1006], [1006], [], [], [], [], [], [], [], []]
