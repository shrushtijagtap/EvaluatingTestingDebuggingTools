# BugSwarm Dataset
## Explanation
This dataset conists of a collection of **software bugs and information about them from different open source software projects**. <br>
It consisits of bugs, code lines changed, commits made and more github related information like commit id etc. It is usually collected using a tool <br>
that crawls the repositories of the project and extract bugs and information like the time, what the bug is about, how the code was changed and <br>
fixed, details about what ither files were affected etc. Automated scripts are used to extract data about bugs from the repositories.
**There are a total of 223 projects, 70 are in python whereas, 150 are in Java**.<br>
The whole dataset is available on bugswarm.org<br> We explored the website and the dataset given on the website.The website describes the bug data like which repo it belongs to , job id, build id, no. of tests passed, no. of tests failed and a link to the difference between the buggy and correct code etc.<br>
The website provides us with a .json file that has all the bugs listed with all the details.<br>
We wrote a script that refers to the SHA's in the jason file<br>
```json
{
  "failed_job": {
    "trigger_sha": "eb7b4f991d67017538569e02b25f962af42aecac"
  },
  "passed_job": {
    "trigger_sha": "41d93b14bf4c8ba2ae75d561ad3a640319e5a4ce"
  }
}
<br>
and the diff urls to extract the files that <br>

[Diff URL](https://github.com/gwtbootstrap3/gwtbootstrap3/compare/eb7b4f991d67017538569e02b25f962af42aecac..41d93b14bf4c8ba2ae75d561ad3a640319e5a4ce)
<br>
We then extrated the fixed and buggy files and generated a diff file. <br>
Due to time constraint we were able to extract the files for 64 repositories and  extract all the buggy and fixed file as well as the difference between them.<br>

## Number of Bugs Collected
2919 bugs collected<br>
Number of buggy commits in Python projects: 934<br>
Number of buggy commits in Java PROJECTS: 1983<br>

## Tests per Bug
| Repository                                    | Number of Bugs | Tests Passed | Tests Failed |
|-----------------------------------------------|----------------|--------------|--------------|
| gwtbootstrap3/gwtbootstrap3                   | 6              | 0            | 4            |
| ontop/ontop                                   | 6              | 0            | 38           |
| ocpsoft/rewrite                               | 7              | 0            | 11           |
| bwhmather/verktyg                             | 18             | 0            | 37           |
| wavesoft/CCLib                                | 8              | 0            | 15           |
| marshallward/f90nml                           | 65             | 0            | 89           |
| brettwooldridge/HikariCP                      | 3              | 0            | 6            |
| swagger-api/swagger-core                      | 10             | 0            | 125          |
| jprante/elasticsearch-jdbc                    | 1              | 0            | 0            |
| NanoHttpd/nanohttpd                           | 1              | 0            | 0            |
| chewiebug/GCViewer                            | 5              | 0            | 4            |
| mybatis/mybatis-3                             | 9              | 0            | 162          |
| byteweaver/django-coupons                     | 4              | 0            | 4            |
| zxing/zxing                                   | 6              | 0            | 0            |
| sannies/mp4parser                             | 9              | 0            | 17           |
| square/okhttp                                 | 74             | 0            | 337          |
| galenframework/galen                          | 3              | 0            | 6            |
| traccar/traccar                               | 56             | 0            | 439          |
| apache/commons-lang                           | 9              | 0            | 2            |
| puniverse/capsule                             | 4              | 0            | 40           |
| kairosdb/kairosdb                             | 17             | 0            | 0            |
| HotswapProjects/HotswapAgent                  | 2              | 0            | 0            |
| huanghongxun/HMCL                             | 3              | 0            | 0            |
| apilayer/restcountries                        | 7              | 0            | 33           |
| spring-projects/spring-hateoas                | 17             | 0            | 45           |
| haraldk/TwelveMonkeys                         | 6              | 0            | 24           |
| cbeust/testng                                 | 13             | 0            | 131          |
| apache/struts                                 | 6              | 0            | 2            |
| winder/Universal-G-Code-Sender                | 8              | 0            | 23           |
| konsoletyper/teavm                            | 1              | 0            | 0            |
| davidmoten/rxjava-jdbc                        | 16             | 0            | 165          |
| FluentLenium/FluentLenium                     | 5              | 0            | 178          |
| Nukkit/Nukkit                                 | 16             | 0            | 0            |
| ansible/ansible                               | 4              | 0            | 0            |
| stagemonitor/stagemonitor                     | 11             | 0            | 46           |
| puniverse/quasar                              | 8              | 0            | 13           |
| SonarSource/sonarlint-intellij                | 3              | 0            | 5            |
| scikit-learn/scikit-learn                     | 26             | 0            | 120          |
| owlcs/owlapi                                  | 33             | 0            | 225          |
| SpigotMC/BungeeCord                           | 6              | 0            | 7            |
| apache/commons-lang                           | 9              | 0            | 2            |
| puniverse/capsule                             | 4              | 0            | 40           |
| kairosdb/kairosdb                             | 17             | 0            | 0            |
| HotswapProjects/HotswapAgent                  | 2              | 0            | 0            |
| huanghongxun/HMCL                             | 3              | 0            | 0            |
| apilayer/restcountries                        | 7              | 0            | 33           |
| spring-projects/spring


##5 Test Samples
1.
Bug ID: 49364896

Tests : 6 Total, 2 failed

![alt text](https://github.com/ShreyaChaudhary1211/CS527-Project/blob/main/images/Bugswarmbug1-1.png)

![alt text](https://github.com/ShreyaChaudhary1211/CS527-Project/blob/main/images/Bugswarmbug1-2.png)

https://github.com/gwtbootstrap3/gwtbootstrap3/compare/f659445d789c63a25b68e79d373b6affc18d1877..8c620e18b05c2da3c1b8d2bfa8e0611ab74db726


2.
Bug ID: 76305782

Tests :4075 Total, 36 failed

![alt text](https://github.com/ShreyaChaudhary1211/CS527-Project/blob/main/images/Bugswarmbug2.png)

https://github.com/ontop/ontop/compare/87ed6c57918e3978f3825388b82bae15bbb5250b..b1f2de252c2d547e3f851f9395ed94b975d40475


3.
Bug ID: 64439039

Tests : 0 Total, 0 failed

![alt text](https://github.com/ShreyaChaudhary1211/CS527-Project/blob/main/images/Bugswarmbug3.png)
https://github.com/ocpsoft/rewrite/compare/11209e514bf823eb4038ba1fde3bb3f801fb0b11..453d4ccb0bb54172bc14be83a7d3f09d8c8cba87


4.
Bug ID: 102468155

Tests : 247 Total, 0 failed

![alt text](https://github.com/ShreyaChaudhary1211/CS527-Project/blob/main/images/Bugswarmbug4-1.png)
![alt text](https://github.com/ShreyaChaudhary1211/CS527-Project/blob/main/images/Bugswarmbug4-2.png)
https://github.com/bwhmather/verktyg/compare/31b32c88bfc71d2dc2b719abcf7a98e96768b567..33c11eab656f0e50841d28071b68c3d3c4c21ae0


5.
Bug ID: 109227527

Tests : 247 Total, 5 failed

![alt text](https://github.com/ShreyaChaudhary1211/CS527-Project/blob/main/images/Bugswarmbug5.png)
https://github.com/bwhmather/verktyg/compare/71dc420c22fadbae064c46b426e093bec7b86f32..2c50fdf92f285a98badbdfa2d72ccc27f34d4b11




