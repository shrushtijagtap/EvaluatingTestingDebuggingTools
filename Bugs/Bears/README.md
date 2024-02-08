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

## Tests per Bug

Bug ID: Bears-109

Tests : 233 Total, 232 Passing, 1 Error

![alt text](https://github.com/ShreyaChaudhary1211/CS527-Project/blob/main/images/Bears-109.png)
[alt text](https://github.com/ShreyaChaudhary1211/CS527-Project/blob/main/images/Bugswarmbug1-2.png)




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


