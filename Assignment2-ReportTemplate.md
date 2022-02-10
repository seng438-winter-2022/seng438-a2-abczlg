**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report \#2 – Requirements-Based Test Generation**

| Group \#:      |  8   |
| -------------- | --- |
| Student Names: |  Kaitlin Culligan   |
|                |  Kunal Dhawan   |
|                |  Chloe Bouchard   |
|                |  Jacob Lansang   |

# 1 Introduction

In this lab, we are testing a software using automated unit testing based on the requirements of each unit. Using JUnit, we will develop automated test code for different subsystems of a software called JFreeChart. Testing of this software will include the use of mock objects. The objective of this lab is to familiarize ourselves with automated unit testing using JUnit, which includes the creation of mock objects.

# 2 Detailed description of unit test strategy

We utilized black-box testing for our unit tests. Primarily, using boundary value analysis as well as equivalence classes. As part of designing our unit tests, we had to establish the domain for each input variable for the methods under test. After establishing each variable's domain, we determined equivalence classes using this information. Knowing the reaches of each equivalence class allowed us to determine the boundaries of the domains of each input variable and as such, determine the values which should be selected for unit testing. 

# 3 Test cases developed

Text…

// write down the name of the test methods and classes. Organize the based on
the source code method // they test. identify which tests cover which partitions
you have explained in the test strategy section //above

# 4 How the team work/effort was divided and managed

All work was produced as a team. We collaborated together and completed the writing of all tests synchronously. As a team, meetings were decided based on availability of all members. Given a date and time that worked for everyone, we met on our Discord Server. Our team work was mainly done through pair programming, to ensure higher quality of code. While one team member worked on writing everything down, the rest of the team determined which tests needed to be performed. This practice ensured that we caught typos and bugs faster. We were also able to develop test cases quickly and efficiently. 

# 5 Difficulties encountered, challenges overcome, and lessons learned

We had some difficulties getting JUnit to work on Eclipse. The main difficulty faced during this project was the abundance of failure traces. Our team spent a lot of time trying to fix this issue, which initially slowed down our process. However, this problem was fixed after adding the hamrest-1.3.jar file. Additionally, there was some difficulty coming up with correct test cases for certain methods, specifically methods in DataUtilities. Certain methods had ambiguous Javadoc documentation, which caused confusion among the team. Because of this, it was difficult to establish the expected output for these methods. After some research and problem solving, our team was able to calculate and predict the expected values. We also had to spend a considerable about of time figuring out how to properly make mock Values2D objects. Finally, there was a bit of a challenge trying to make non-redundant test methods, but this problem was solved by using the boundary testing methods taught in class.   

# 6 Comments/feedback on the lab itself

Text…

This lab was a good introduction to writing automated tests using JUnit. We were able to apply our knowledge by making test cases that used elements of black box testing and boundary value testing. The use of mock objects was somewhat simple and the classes we tested helped us learn how to create and use mock objects. 
