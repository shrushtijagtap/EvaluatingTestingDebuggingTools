var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":44,"id":21499,"methods":[{"el":43,"sc":5,"sl":35}],"name":"UnicodeUnpairedSurrogateRemover","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1181":{"methods":[{"sl":35}],"name":"testValidCharacters","pass":true,"statements":[{"sl":37},{"sl":42}]},"test_1397":{"methods":[{"sl":35}],"name":"testInvalidCharacters","pass":true,"statements":[{"sl":37},{"sl":39}]},"test_2039":{"methods":[{"sl":35}],"name":"testEscapeXml10","pass":true,"statements":[{"sl":37},{"sl":39},{"sl":42}]},"test_3450":{"methods":[{"sl":35}],"name":"testEscapeXml11","pass":true,"statements":[{"sl":37},{"sl":39},{"sl":42}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1397, 3450, 2039, 1181], [], [1397, 3450, 2039, 1181], [], [1397, 3450, 2039], [], [], [3450, 2039, 1181], [], [], []]
