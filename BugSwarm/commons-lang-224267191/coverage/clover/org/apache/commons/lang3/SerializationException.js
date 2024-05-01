var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":77,"id":7119,"methods":[{"el":42,"sc":5,"sl":40},{"el":52,"sc":5,"sl":50},{"el":63,"sc":5,"sl":61},{"el":75,"sc":5,"sl":73}],"name":"SerializationException","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2192":{"methods":[{"sl":61}],"name":"testDeserializeStreamClassNotFound","pass":true,"statements":[{"sl":62}]},"test_3439":{"methods":[{"sl":61}],"name":"testSerializeBytesUnserializable","pass":true,"statements":[{"sl":62}]},"test_3511":{"methods":[{"sl":61}],"name":"testDeserializeBytesBadStream","pass":true,"statements":[{"sl":62}]},"test_3652":{"methods":[{"sl":61}],"name":"testDeserializeStreamBadStream","pass":true,"statements":[{"sl":62}]},"test_707":{"methods":[{"sl":61}],"name":"testSerializeIOException","pass":true,"statements":[{"sl":62}]},"test_767":{"methods":[{"sl":61}],"name":"testCloneUnserializable","pass":true,"statements":[{"sl":62}]},"test_778":{"methods":[{"sl":40},{"sl":50},{"sl":61},{"sl":73}],"name":"testException","pass":true,"statements":[{"sl":41},{"sl":51},{"sl":62},{"sl":74}]},"test_914":{"methods":[{"sl":61}],"name":"testSerializeStreamUnserializable","pass":true,"statements":[{"sl":62}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [778], [778], [], [], [], [], [], [], [], [], [778], [778], [], [], [], [], [], [], [], [], [], [3652, 707, 3439, 2192, 3511, 914, 778, 767], [3652, 707, 3439, 2192, 3511, 914, 778, 767], [], [], [], [], [], [], [], [], [], [], [778], [778], [], [], []]
