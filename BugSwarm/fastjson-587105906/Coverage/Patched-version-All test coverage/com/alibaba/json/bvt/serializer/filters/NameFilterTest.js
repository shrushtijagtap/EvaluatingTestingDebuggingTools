var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":105,"id":87239,"methods":[{"el":27,"sc":13,"sl":21},{"el":40,"sc":5,"sl":18},{"el":51,"sc":13,"sl":45},{"el":65,"sc":5,"sl":42},{"el":76,"sc":13,"sl":70},{"el":81,"sc":5,"sl":67}],"name":"NameFilterTest","sl":16},{"el":104,"id":87279,"methods":[{"el":90,"sc":9,"sl":88},{"el":94,"sc":9,"sl":92},{"el":98,"sc":9,"sl":96},{"el":102,"sc":9,"sl":100}],"name":"NameFilterTest.Bean","sl":83}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_138":{"methods":[{"sl":18},{"sl":21},{"sl":88},{"sl":96}],"name":"test_namefilter","pass":true,"statements":[{"sl":19},{"sl":22},{"sl":23},{"sl":26},{"sl":31},{"sl":32},{"sl":33},{"sl":35},{"sl":36},{"sl":38},{"sl":39},{"sl":89},{"sl":97}]},"test_2233":{"methods":[{"sl":67},{"sl":70}],"name":"test_toJSONString","pass":true,"statements":[{"sl":68},{"sl":71},{"sl":72},{"sl":80}]},"test_3885":{"methods":[{"sl":42},{"sl":45}],"name":"test_namefilter_1","pass":true,"statements":[{"sl":43},{"sl":46},{"sl":47},{"sl":55},{"sl":56},{"sl":57},{"sl":59},{"sl":60},{"sl":61},{"sl":63},{"sl":64}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [138], [138], [], [138], [138], [138], [], [], [138], [], [], [], [], [138], [138], [138], [], [138], [138], [], [138], [138], [], [], [3885], [3885], [], [3885], [3885], [3885], [], [], [], [], [], [], [], [3885], [3885], [3885], [], [3885], [3885], [3885], [], [3885], [3885], [], [], [2233], [2233], [], [2233], [2233], [2233], [], [], [], [], [], [], [], [2233], [], [], [], [], [], [], [], [138], [138], [], [], [], [], [], [], [138], [138], [], [], [], [], [], [], [], []]
