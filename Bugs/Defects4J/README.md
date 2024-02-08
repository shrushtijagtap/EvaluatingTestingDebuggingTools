# Defects4J Dataset

## Explanation

Defects4J is a collection of bugs characterized for being reproducible, isolated and
relevant to current software design and development best practices. Bugs are collected
in large by repo contributors manually proposing and verifying them. While this
makes the process slower, each bug is compatible and testable, as well as allowing for the 
collection of granular data for each bug such as trigger tests, fix commits, reports etc.

Once the repo is cloned, the user runs a script to download all dependencies
and external libraries needed to run the tests and helper scripts.

### Sample Commands:

```sh
// Get info about a specific bug
defects4j info -p Csv -b 1

// Checkout a specific bug
defects4j checkout -p Csv -v 1b -w /tmp/csv_1_buggy

// Run all tests for a specific bug
cd /tmp/csv_1_buggy && defects4j compile && defects4j test
```

## Number of Bugs Collected

835 bugs collected (29 additional deprecated bugs)

| Project         | Number of active bugs | Active bug ids    | Deprecated bug ids |
|-----------------|----------------------:|-------------------|--------------------|
| Chart           |           26          | 1-26              | None               |
| Cli             |           39          | 1-5,7-40          | 6                  |
| Closure         |          174          | 1-62,64-92,94-176 | 63,93              |
| Codec           |           18          | 1-18              | None               |
| Collections     |            4          | 25-28             | 1-24               |
| Compress        |           47          | 1-47              | None               |
| Csv             |           16          | 1-16              | None               |
| Gson            |           18          | 1-18              | None               |
| JacksonCore     |           26          | 1-26              | None               |
| JacksonDatabind |          112          | 1-112             | None               |
| JacksonXml      |            6          | 1-6               | None               |
| Jsoup           |           93          | 1-93              | None               |
| JxPath          |           22          | 1-22              | None               |
| Lang            |           64          | 1,3-65            | 2                  |
| Math            |          106          | 1-106             | None               |
| Mockito         |           38          | 1-38              | None               |
| Time            |           26          | 1-20,22-27        | 21                 |


## Tests per Bug

Project: jfreechart
Bug ID: 1

Tests : 64 Total, 63 Passing, 1 Error

![alt text](https://github.com/ShreyaChaudhary1211/CS527-Project/blob/main/images/Defects4J-1.png)


Project: jfreechart
Bug ID: 5

Tests : 36 Total, 35 Passing, 1 Error

![alt text](https://github.com/ShreyaChaudhary1211/CS527-Project/blob/main/images/Defects4J-5.png)


Project: jfreechart
Bug ID: 9

Tests : 5 Total, 4 Passing, 1 Error

![alt text](https://github.com/ShreyaChaudhary1211/CS527-Project/blob/main/images/Defects4J-9.png)



Project: commons-math
Bug ID: 2

Tests : 1 Total, 0 Passing, 1 Error

![alt text](https://github.com/ShreyaChaudhary1211/CS527-Project/blob/main/images/Defects4J-Math-2.png)




Project: commons-math
Bug ID: 3

Tests : 1 Total, 0 Passing, 1 Error

![alt text](https://github.com/ShreyaChaudhary1211/CS527-Project/blob/main/images/Defects4J-Math-3.png)
