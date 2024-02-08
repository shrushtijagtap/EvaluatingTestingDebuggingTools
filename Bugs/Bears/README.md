# Bears Dataset

## Explanation

Bears provides a collection of bugs aimed to serve as a resource for 
researchers to evaluate and develop program repair tools. 

The dataset itself contains 118 bugs, collected from open source java projects found
on GitHub. While manual verification is still needed, automation is leveraged to identify bugs
through various methods such as scanning commit messages and issues.

Once bugs are identified, Travis CI builds are gathered for the pre and post bug fix code states.
When all data for a bug is gathered, a branch is created for it and each commit is mapped to the different
states of the bug (pre-fix, failed-tests, post-fix, post-fix-eith-metadad).

Users can checkout the branch for a bug, navigate hrough the commits and run the tests.

### Sample Commands:

```sh

python3 scripts/checkout_bug.py --bugId <bug ID>
python3 scripts/run_tests_bug.py --bugId <bug ID>

```

## Number of Bugs Collected

118 bugs collected

| Project                                       | Number of bugs |
|-----------------------------------------------|----------------|
| FasterXML-jackson-databind                    | 24             |
| INRIA-spoon                                   | 1              |
| traccar-traccar                               | 42             |
| 2018swecapstone-h2ms                          | 3              |
| Activiti-Activiti                             | 1              |
| aicis-fresco                                  | 2              |
| apache-incubator-dubbo                        | 3              |
| apache-incubator-servicecomb-java-chassis     | 2              |
| Blazebit-blaze-persistence                    | 1              |
| cpesch-RouteConverter                         | 2              |
| debezium-debezium                             | 4              |
| EnMasseProject-enmasse                        | 2              |
| linkedin-pinot                                | 1              |
| spring-cloud-spring-cloud-gcp                 | 2              |
| SzFMV2018-Tavasz-AutomatedCar                 | 1              |
| thelastpickle-cassandra-reaper                | 3              |
| albfernandez-GDS-PMD-Security-Rules           | 1              |
| apereo-java-cas-client                        | 1              |
| aws-aws-encryption-sdk-java                   | 1              |
| brettwooldridge-HikariCP                      | 1              |
| classgraph-classgraph                         | 1              |
| CSU-CS414-WareWolves-cs414-f18-001-WareWolves | 1              |
| DmitriiSerikov-money-transfer-service         | 1              |
| FasterXML-jackson-dataformats-binary          | 1              |
| jenkinsci-ansicolor-plugin                    | 1              |
| jgrapht-jgrapht                               | 1              |
| lettuce-io-lettuce-core                       | 1              |
| milaboratory-milib                            | 1              |
| OpenFeign-feign                               | 1              |
| openmrs-openmrs-module-htmlformentry          | 1              |
| openmrs-openmrs-module-webservices.rest       | 1              |
| opentracing-contrib-java-p6spy                | 1              |
| paritytrading-foundation                      | 1              |
| rafonsecad-cash-count                         | 2              |
| rkonovalov-jsonignore                         | 1              |
| societe-generale-ci-droid-tasks-consumer      | 1              |
| SonarOpenCommunity-sonar-cxx                  | 1              |
| square-javapoet                               | 1              |
| thelinmichael-spotify-web-api-java            | 1              |

## Tests per Bug

| Bug       | Test Passed | Tests Failed |
|-----------|------------:|--------------|
| Bears-1   |        1569 | 0            |
| Bears-2   |        1570 | 0            |
| Bears-3   |        1680 | 0            |
| Bears-4   |        1571 | 0            |
| Bears-5   |        1571 | 0            |
| Bears-6   |        1686 | 0            |
| Bears-7   |        1690 | 1            |
| Bears-8   |        1693 | 0            |
| Bears-9   |        1695 | 0            |
| Bears-11  |        1705 | 1            |
| Bears-12  |        1708 | 4            |
| Bears-14  |        1573 | 1            |
| Bears-15  |        1574 | 1            |
| Bears-16  |        1974 | 0            |
| Bears-17  |        1975 | 0            |
| Bears-18  |        1976 | 0            |
| Bears-19  |        1720 | 1            |
| Bears-20  |        1721 | 0            |
| Bears-21  |        1722 | 1            |
| Bears-22  |        1723 | 2            |
| Bears-23  |        1725 | 1            |
| Bears-24  |        1736 | 0            |
| Bears-25  |        1737 | 0            |
| Bears-26  |        1754 | 1            |
| Bears-83  |        1167 | 0            |
| Bears-98  |         222 | 0            |
| Bears-99  |         224 | 1            |
| Bears-100 |         225 | 1            |
| Bears-101 |         226 | 0            |
| Bears-102 |         229 | 0            |
| Bears-103 |         227 | 3            |
| Bears-104 |         232 | 0            |
| Bears-105 |         232 | 1            |
| Bears-106 |         232 | 1            |
| Bears-107 |         232 | 0            |
| Bears-108 |         232 | 1            |
| Bears-109 |         232 | 0            |
| Bears-110 |         232 | 1            |
| Bears-111 |         232 | 1            |
| Bears-112 |         232 | 1            |
| Bears-113 |         233 | 1            |
| Bears-114 |         236 | 0            |
| Bears-115 |         240 | 0            |
| Bears-116 |         241 | 1            |
| Bears-117 |         242 | 1            |
| Bears-118 |         248 | 1            |
| Bears-119 |         250 | 0            |
| Bears-120 |         260 | 1            |
| Bears-121 |         119 | 0            |
| Bears-122 |         266 | 1            |
| Bears-123 |         269 | 3            |
| Bears-124 |         273 | 1            |
| Bears-125 |         273 | 0            |
| Bears-126 |         273 | 1            |
| Bears-127 |         274 | 0            |
| Bears-128 |         274 | 1            |
| Bears-129 |         275 | 1            |
| Bears-130 |         275 | 1            |
| Bears-131 |         275 | 0            |
| Bears-132 |         281 | 1            |
| Bears-133 |         282 | 1            |
| Bears-134 |         283 | 1            |
| Bears-135 |         283 | 1            |
| Bears-136 |         283 | 1            |
| Bears-137 |         295 | 1            |
| Bears-138 |         297 | 0            |
| Bears-139 |         298 | 0            |
| Bears-140 |          80 | 0            |
| Bears-141 |         102 | 1            |
| Bears-142 |        1949 | 3            |
| Bears-143 |         111 | 0            |
| Bears-144 |         383 | 1            |
| Bears-146 |         753 | 0            |
| Bears-149 |        1158 | 1            |
| Bears-150 |          31 | 2            |
| Bears-152 |         753 | 1            |
| Bears-153 |         631 | 0            |
| Bears-154 |         143 | 1            |
| Bears-156 |        1787 | 0            |
| Bears-158 |         429 | 0            |
| Bears-159 |         484 | 0            |
| Bears-160 |         477 | 0            |
| Bears-161 |         478 | 0            |
| Bears-164 |         496 | 0            |
| Bears-166 |          17 | 1            |
| Bears-168 |          18 | 0            |
| Bears-169 |         620 | 1            |
| Bears-180 |          36 | 0            |
| Bears-181 |         158 | 1            |
| Bears-189 |          85 | 0            |
| Bears-190 |          84 | 0            |
| Bears-191 |         104 | 6            |
| Bears-192 |         112 | 2            |
| Bears-194 |          57 | 1            |
| Bears-197 |         153 | 1            |
| Bears-198 |        5725 | 0            |
| Bears-201 |         144 | 0            |
| Bears-202 |         115 | 0            |
| Bears-203 |         417 | 0            |
| Bears-204 |         192 | 10           |
| Bears-209 |         104 | 2            |
| Bears-211 |          99 | 2            |
| Bears-221 |          52 | 1            |
| Bears-222 |        2972 | 0            |
| Bears-225 |        2013 | 2            |
| Bears-226 |         425 | 0            |
| Bears-227 |         286 | 2            |
| Bears-228 |         533 | 2            |
| Bears-229 |        1167 | 0            |
| Bears-230 |          18 | 0            |
| Bears-232 |          77 | 3            |
| Bears-234 |          14 | 1            |
| Bears-235 |          16 | 1            |
| Bears-238 |           7 | 2            |
| Bears-241 |          41 | 4            |
| Bears-242 |         615 | 1            |
| Bears-245 |         333 | 1            |
| Bears-246 |         228 | 1            |


## Samples


Bug ID: Bears-109

Tests : 233 Total, 232 Passing, 1 Error

![alt text](https://github.com/ShreyaChaudhary1211/CS527-Project/blob/main/images/Bears-109.png)


Bug ID: Bears-121

Tests : 264 Total, 119 Passing, 145 Error

![alt text](https://github.com/ShreyaChaudhary1211/CS527-Project/blob/main/images/Bears-121.png)


Bug ID: Bears-145

Tests : 646 Total, 645 Passing, 1 Error

![alt text](https://github.com/ShreyaChaudhary1211/CS527-Project/blob/main/images/Bears-145.png)



Bug ID: Bears-169

Tests : 621 Total, 620 Passing, 1 Error

![alt text](https://github.com/ShreyaChaudhary1211/CS527-Project/blob/main/images/Bears-169.png)




Bug ID: Bears-245

Tests : 334 Total, 333 Passing, 1 Error

![alt text](https://github.com/ShreyaChaudhary1211/CS527-Project/blob/main/images/Bears-245.png)


