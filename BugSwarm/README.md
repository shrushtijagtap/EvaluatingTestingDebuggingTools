# BugSwarm Dataset
## Explanation
This dataset consits of a collection of **software bugs and information about them from different open source software projects**. <br>
It consisits of bugs, code lines changed, commits made and more github related information like commit id etc. It is usually collected using a tool that crawls the repositories of the project and extract bugs and information like the time, what the bug is about, how the code was changed and fixed, details about what ither files were affected etc. Automated scripts are used to extract data about bugs from the repositories.
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
```
and the diff urls to extract the files that <br>

"diff_url": "https://github.com/gwtbootstrap3/gwtbootstrap3/compare/eb7b4f991d67017538569e02b25f962af42aecac..41d93b14bf4c8ba2ae75d561ad3a640319e5a4ce"

<br>
We then extrated the fixed and buggy files and generated a diff file. <br>
Due to time constraint we were able to extract the files for 64 repositories and  extract all the buggy and fixed file as well as the difference between them.<br>
We have extracted bugs per repositories and these bugs are stored with all buggy, fixed and diff code files in each folder with name of the repository.<br>
eg: Folder: ontop_ <br>
consists of all the bugs,<br>
bug files: contains buggy code for all bugs <br>
fixed files: contains fixed code for all bugs <br>
diff files: contains diff for all bugs <br>

## Number of Bugs Collected
2919 bugs collected<br>
Number of buggy commits in Java projects: 1983<br>

## Tests per Bug
<br>Java Repositories<br>
Number of buggy commits in Java projects: 1983<br>
| Repository | Number of Bugs | Tests Passed | Tests Failed |
|-------------|----------------|--------------|--------------|
| gwtbootstrap3/gwtbootstrap3 | 6 | 40 | 4 |
| ontop/ontop | 6 | 6145 | 38 |
| ocpsoft/rewrite | 7 | 2542 | 11 |
| brettwooldridge/HikariCP | 3 | 403 | 6 |
| swagger-api/swagger-core | 10 | 2965 | 125 |
| jprante/elasticsearch-jdbc | 1 | 0 | 0 |
| NanoHttpd/nanohttpd | 1 | 0 | 0 |
| chewiebug/GCViewer | 5 | 1363 | 4 |
| mybatis/mybatis-3 | 9 | 2316 | 162 |
| zxing/zxing | 6 | 0 | 0 |
| sannies/mp4parser | 9 | 832 | 17 |
| square/okhttp | 74 | 99782 | 337 |
| galenframework/galen | 3 | 2649 | 6 |
| traccar/traccar | 56 | 4107 | 439 |
| apache/commons-lang | 9 | 28108 | 2 |
| puniverse/capsule | 4 | 115 | 40 |
| kairosdb/kairosdb | 17 | 0 | 0 |
| HotswapProjects/HotswapAgent | 2 | 0 | 0 |
| huanghongxun/HMCL | 3 | 0 | 0 |
| apilayer/restcountries | 7 | 178 | 33 |
| spring-projects/spring-hateoas | 17 | 4920 | 45 |
| haraldk/TwelveMonkeys | 6 | 20142 | 24 |
| cbeust/testng | 13 | 5928 | 131 |
| apache/struts | 6 | 5530 | 2 |
| winder/Universal-G-Code-Sender | 8 | 1229 | 23 |
| konsoletyper/teavm | 1 | 0 | 0 |
| davidmoten/rxjava-jdbc | 16 | 2507 | 165 |
| FluentLenium/FluentLenium | 5 | 3302 | 178 |
| Nukkit/Nukkit | 16 | 0 | 0 |
| stagemonitor/stagemonitor | 11 | 764 | 46 |
| puniverse/quasar | 8 | 1986 | 13 |
| SonarSource/sonarlint-intellij | 3 | 274 | 5 |
| owlcs/owlapi | 33 | 107217 | 225 |
| SpigotMC/BungeeCord | 6 | 141 | 7 |
| NitorCreations/nflow | 36 | 8799 | 54 |
| square/retrofit | 26 | 4580 | 45 |
| uwescience/myria | 5 | 845 | 51 |
| Azure/azure-sdk-for-java | 8 | 0 | 0 |
| SonarSource/sonar-php | 21 | 6786 | 436 |
| raphw/byte-buddy | 355 | 1152493 | 907 |
| SonarSource/sonar-xml | 2 | 82 | 0 |
| ProjectKorra/ProjectKorra | 9 | 0 | 0 |
| ImmobilienScout24/deadcode4j | 7 | 1935 | 117 |
| Whiley/WhileyCompiler | 24 | 3359 | 29 |
| terasolunaorg/terasoluna-tourreservation | 1 | 108 | 1 |
| twilio/twilio-java | 16 | 2308 | 12 |
| joel-costigliola/assertj-core | 7 | 37197 | 8 |
| wmixvideo/nfe | 12 | 18242 | 15 |
| Bammerbom/UltimateCore | 1 | 0 | 0 |
| charite/jannovar | 9 | 0 | 0 |
| google/auto | 10 | 2507 | 5 |
| rinde/RinSim | 36 | 6244 | 31 |
| square/okio | 13 | 4264 | 56 |
| joyent/java-manta | 56 | 61 | 0 |
| junkdog/artemis-odb | 9 | 899 | 7 |
| spring-projects/spring-amqp | 3 | 1713 | 4 |
| yamcs/yamcs | 12 | 2068 | 71 |
| HubTurbo/HubTurbo | 6 | 103 | 5 |
| SonarSource/sonar-java | 57 | 100469 | 41 |
| checkstyle/checkstyle | 176 | 115707 | 63 |
| HubSpot/Baragon | 91 | 0 | 0 |
| keeps/roda | 1 | 0 | 0 |
| otavanopisto/muikku | 1 | 0 | 0 |
| GoClipse/goclipse | 7 | 286 | 5 |
| ethereum/ethereumj | 2 | 0 | 0 |
| google/closure-compiler | 1 | 0 | 0 |
| square/wire | 14 | 224 | 4 |
| Flipkart/foxtrot | 2 | 0 | 0 |
| jcabi/jcabi-s3 | 3 | 0 | 0 |
| jcabi/jcabi-parent | 2 | 0 | 0 |
| lviggiano/owner | 3 | 576 | 0 |
| petergeneric/stdlib | 9 | 1005 | 66 |
| pmlopes/yoke | 1 | 0 | 0 |
| vkostyukov/la4j | 8 | 0 | 0 |
| ninjaframework/ninja | 6 | 0 | 0 |
| orbit/orbit | 2 | 182 | 2 |
| UniversalMediaServer/UniversalMediaServer | 23 | 7248 | 83 |
| ome/bioformats | 2 | 3290 | 2 |
| pgjdbc/pgjdbc | 18 | 58016 | 5490 |
| belluccifranco/sic | 11 | 679 | 19 |
| square/javapoet | 12 | 1354 | 24 |
| spring-projects/spring-data-jpa | 31 | 22358 | 119 |
| openpnp/openpnp | 6 | 40 | 9 |
| cryptomator/cryptomator | 1 | 23 | 3 |
| crate/crate-jdbc | 3 | 248 | 3 |
| terasolunaorg/terasoluna-gfw-functionaltest | 1 | 282 | 2 |
| TNG/JGiven | 1 | 680 | 60 |
| Adobe-Consulting-Services/acs-aem-commons | 109 | 121912 | 233 |
| UNC-Libraries/Carolina-Digital-Repository | 3 | 1626 | 11 |
| brianfrankcooper/YCSB | 2 | 85 | 5 |
| igniterealtime/Openfire | 8 | 5050 | 160 |
| languagetool-org/languagetool | 4 | 1904 | 57 |
| thm-projects/arsnova-backend | 9 | 374 | 70 |
| SynBioDex/libSBOLj | 2 | 458 | 5 |
| keycloak/keycloak | 2 | 368 | 1 |
| apache/jackrabbit-oak | 5 | 2365 | 299 |
| graphhopper/graphhopper | 2 | 2743 | 20 |
| apache/dubbo | 3 | 4130 | 3 |
| apache/incubator-shardingsphere | 6 | 4536 | 3516 |
| speedment/speedment | 3 | 47470 | 6 |
| mitreid-connect/OpenID-Connect-Java-Spring-Server | 1 | 40 | 2 |
| IQSS/dataverse | 2 | 1093 | 2 |
| Scout24/deadcode4j | 12 | 2844 | 1296 |
| dita-ot/dita-ot | 1 | 436 | 1 |
| eclipse/golo-lang | 1 | 627 | 1 |
| rackerlabs/blueflood | 4 | 1164 | 8 |
| spring-projects/spring-data-commons | 1 | 1144 | 9 |
| yasserg/crawler4j | 1 | 0 | 0 |
| Wikidata/Wikidata-Toolkit | 6 | 3916 | 8 |
| alibaba/fastjson | 4 | 19037 | 6 |
| ibissource/iaf | 4 | 8398 | 13 |
| OpenTSDB/opentsdb | 1 | 3362 | 7 |
| geotools/geotools | 1 | 0 | 0 |
| perwendel/spark | 1 | 0 | 0 |
| google/guava | 3 | 4714472 | 3 |
| square/moshi | 4 | 1952 | 2 |
| alibaba/canal | 23 | 913 | 11 |
| spring-projects/spring-security-oauth | 14 | 2878 | 16 |
| alibaba/spring-cloud-alibaba | 4 | 164 | 10 |
| apache/shardingsphere | 28 | 37368 | 3 |
| qupath/qupath | 1 | 4 | 1 |
| apache/iceberg | 1 | 1092 | 443 |
| apache/maven | 10 | 6741 | 21 |
| broadinstitute/picard | 3 | 10685 | 2 |
| JSQLParser/JSqlParser | 1 | 4282 | 2 |
| JabRef/jabref | 2 | 55 | 2 |
| OpenAPITools/openapi-generator | 8 | 0 | 0 |
| ReactiveX/RxJava | 1 | 13128 | 6 |
| TheAlgorithms/Java | 8 | 31787 | 12 |
| alibaba/COLA | 9 | 276 | 39 |
| alibaba/fastjson2 | 18 | 100605 | 26 |
| alibaba/nacos | 5 | 29 | 416 |
| apache/servicecomb-java-chassis | 1 | 593 | 1 |
| apolloconfig/apollo | 2 | 219 | 56 |
| bobocode-projects/java-fundamentals-exercises | 1 | 179 | 1 |
| dromara/hertzbeat | 15 | 2948 | 87 |
| embulk/embulk | 1 | 47 | 2 |
| halo-dev/halo | 3 | 1596 | 11 |
| hashgraph/hedera-mirror-node | 1 | 286 | 1 |
| jitsi/jicofo | 2 | 36 | 40 |
| marcwrobel/jbanking | 6 | 7874 | 8 |
| GIScience/openrouteservice | 1 | 1694 | 6 |
| graphql-java/graphql-java | 1 | 2965 | 1 |
| pxb1988/dex2jar | 3 | 8 | 5 |
| apache/shiro | 1 | 651 | 1 |
| debezium/debezium | 1 | 764 | 4 |
| google/error-prone | 5 | 0 | 0 |
| javaparser/javaparser | 8 | 15528 | 16 |
| crate/crate | 14 | 0 | 0 |
| JanusGraph/janusgraph | 1 | 306 | 1 |
| flowable/flowable-engine | 2 | 3706 | 2 |
| psi-probe/psi-probe | 8 | 1620 | 36 |
| sofastack/sofa-ark | 1 | 0 | 0 |

<br>Python Repositories:<br>
Number of buggy commits in Python projects: 934<br>
| Repository | Number of Bugs | Tests Passed | Tests Failed |
|-------------|----------------|--------------|--------------|
| bwhmather/verktyg | 18 | 3976 | 37 |
| wavesoft/CCLib | 8 | 1 | 15 |
| marshallward/f90nml | 65 | 3456 | 89 |
| byteweaver/django-coupons | 4 | 96 | 4 |
| ansible/ansible | 4 | 0 | 0 |
| scikit-learn/scikit-learn | 26 | 150995 | 120 |
| dnanexus/dx-toolkit | 8 | 80 | 8 |
| web2py/web2py | 14 | 2077 | 51 |
| hivesolutions/appier | 60 | 1937 | 94 |
| Charcoal-SE/SmokeDetector | 7 | 216 | 41 |
| biolab/orange3 | 2 | 0 | 0 |
| cloudify-cosmo/cloudify-system-tests | 3 | 0 | 0 |
| getnikola/nikola | 4 | 730 | 38 |
| terasolunaorg/guideline | 170 | 0 | 0 |
| okpy/ok | 4 | 1091 | 43 |
| python/mypy | 65 | 94907 | 10 |
| jacebrowning/doorstop | 3 | 1815 | 5 |
| wbond/package_control_channel | 61 | 478611 | 62 |
| zimmerman-zimmerman/OIPA | 6 | 971 | 15 |
| ccnmtl/dmt | 9 | 1141 | 12 |
| Theano/Theano | 1 | 0 | 1 |
| jkenlooper/chill | 1 | 20 | 13 |
| joblib/joblib | 3 | 2914 | 4 |
| Unidata/netcdf4-python | 35 | 3092 | 92 |
| nicolargo/glances | 3 | 69 | 3 |
| pydanny/cookiecutter-django | 11 | 17 | 17 |
| numpy/numpy | 112 | 724063 | 182 |
| spesmilo/electrum | 6 | 853 | 73 |
| paramiko/paramiko | 13 | 1581 | 119 |
| hylang/hy | 5 | 2646 | 78 |
| EducationalTestingService/skll | 5 | 84 | 5 |
| ProgVal/Limnoria | 4 | 3266 | 4 |
| QInfer/python-qinfer | 1 | 297 | 2 |
| LASY-org/lasy | 11 | 20 | 9 |
| IHVH/OEMIB_PI01_19_TBOT | 4 | 20 | 4 |
| jaraco/jaraco.functools | 2 | 0 | 0 |
| linux-system-roles/auto-maintenance | 11 | 77 | 0 |
| FelixSchwarz/mjml-python | 1 | 0 | 1 |
| fundakol/pytest-jira-xray | 2 | 54 | 2 |
| kevin218/Eureka | 5 | 46 | 17 |
| psf/requests | 4 | 577 | 2 |
| httpie/httpie | 9 | 8124 | 8 |
| pytest-dev/pytest | 1 | 0 | 0 |
| yt-dlp/yt-dlp | 13 | 4026 | 153 |
| vanvalenlab/deepcell-tf | 1 | 399 | 1 |
| wenkokke/talondoc | 4 | 0 | 0 |
| progressivis/progressivis | 1 | 0 | 0 |
| OxWearables/actipy | 2 | 0 | 0 |
| JRC-COMBINE/DEA | 1 | 0 | 6 |
| CERT-Polska/karton-classifier | 13 | 543 | 16 |
| precice/python-bindings | 1 | 53 | 1 |
| AntonLydike/riscemu | 2 | 0 | 6 |
| pynucastro/pynucastro | 1 | 220 | 2 |
| jerryjliu/llama_index | 6 | 0 | 0 |
| huggingface/diffusers | 41 | 3 | 3 |
| Delgan/loguru | 9 | 2929 | 13 |
| SigmaHQ/sigma | 6 | 212 | 6 |
| falconry/falcon | 9 | 6868 | 48 |
| joke2k/django-environ | 7 | 16873 | 141 |
| aws/aws-sam-cli | 3 | 16353 | 3 |
| pypa/pipenv | 1 | 0 | 0 |
| EstrellaXD/Auto_Bangumi | 1 | 13 | 2 |
| saulpw/visidata | 5 | 0 | 0 |
| TheAlgorithms/Python | 1 | 0 | 1 |
| kellyjonbrazil/jc | 1 | 1349 | 6 |
| Pythagora-io/gpt-pilot | 1 | 105 | 2 |
| mkdocs/mkdocs | 8 | 7660 | 176 |
| nedbat/coveragepy | 3 | 0 | 0 |
| simonw/datasette | 1 | 1375 | 12 |
| vitalik/django-ninja | 1 | 0 | 0 |

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




