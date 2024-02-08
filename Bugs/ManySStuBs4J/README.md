# ManySStuBs4J Dataset

## Explanation
**ManySStuBs4J has a collection of fixes for bugs found in the 100 Java Maven Projects and top 1000 Java Projects repositories**. In this framework, they have created a set of 16 syntactic templates (Stubs) which essentially are small bug fix changes. 

The creators went through the codes of these projects and scanned the commit messages with words **"bug"/"fix"/"fault"** and determined if the commits have bug fixes. All bugs and their fixes that they found are stored in json files along with type of the bug (one out of the 16 predefined stubs) and other metadata about the bug. I assume techniques like defined pattern matching/ regular expressions were used to map the bug to one of Stubs.
**Most of the bug fixes are just single statement fixes, to ensure that they are simple and manageable for analysis.** 
Every json contains the following fields about the bugs-
1. The "bugType" - one of the 16 stubs.
2. The "projectName", "commitSHA1", "fixCommitParentSHA1", "commitFile" which represent project which the bug belongs to, commit id of bug fix, commit id of where the bug is  and the file contining the bug/bug fix.
3. The "before", "after", "patch" contains information to understand the change.
4. The "bugLineNum", "bugNodeStartChar", "bugNodeLength", "fixLineNum", "fixNodeStartChar", and "fixNodeLength" give us exact details to pinpoint lines that contained the bug and related details.
   
We also can find statistics relate to the stubs in the dataset i.e For every stub, **which pattern the stub was** (i.e change modifier, less/ more specific if, missing throws exception, wrong function name, etc) and **how many times they occured in both the repositories** - 100 Java Maven Projects and top 1000 Java Projects repositories

To fetch the bug files, bug fixed files and the diff we wrote a python script. The script goes to every bug and fix sha, downloads the files from there and also gets the difference between those sha. Because there are 1000+ projects with each project containing around 50-500 bugs, we have uploaded the files for the first 10 projects. But, our script does return every single bug from all the projects. Due to time constraint we were not able to keep it running for longer hours. But, we have uploaded data related to each and every bug of the 10 selected projects, which are uploaded in the repository above.

## Number of Bugs Collected

99369 bugs collected in total <br>
Number of buggy commits in Project 100 Java Maven: 12598  <br>
Number of buggy commits in Project 1000 Java: 86771 <br>


The table below provides information about the number of mined single statement bugs 


## Tests per Bug

Bug 1 from 100 Java Maven: 

![alt text](https://github.com/ShreyaChaudhary1211/CS527-Project/blob/main/images/ManySStuBs4J_Bug1.png)


Bug 2 from 100 Java Maven: 

![alt text](https://github.com/ShreyaChaudhary1211/CS527-Project/blob/main/images/ManySStuBs4J_Bug2.png)


Bug 3 from 100 Java Maven: 

![alt text](https://github.com/ShreyaChaudhary1211/CS527-Project/blob/main/images/ManySStuBs4J_Bug3.png)



Bug 4 from 1000 Java Maven: 

![alt text](https://github.com/ShreyaChaudhary1211/CS527-Project/blob/main/images/ManySStuBs4J_Bug4.png)




Bug 5 from 1000 Java Maven: 

![alt text](https://github.com/ShreyaChaudhary1211/CS527-Project/blob/main/images/ManySStuBs4J_Bug5.png)


