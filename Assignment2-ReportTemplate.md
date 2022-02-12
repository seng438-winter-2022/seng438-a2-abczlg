**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report \#2 – Requirements-Based Test Generation**

| Group \#:      |  8   |
| -------------- | --- |
| Student Names: |  Kaitlin Culligan   |
|                |  Kunal Dhawan   |
|                |  Chloe Bouchard   |
|                |  Jacob Lansang   |

# 1 Introduction

In this lab, we are testing a software using automated unit testing based on the requirements of each unit. The challenge given to us was that two classes (Range.class &
DataUtilities.class) needed to have five (each) of their methods tested. Using JUnit, we developed automated test code for different subsystems of a software called JFreeChart. 
Testing of this software will include the use of mock objects. The objective of this lab is to familiarize ourselves with automated unit testing using JUnit, which includes the creation of mock objects.

# 2 Detailed description of unit test strategy

We utilized black-box testing for our unit tests. Primarily, using boundary value analysis as well as equivalence classes. As part of designing our unit tests, we had to establish the domain for each input variable for the methods under test. After establishing each variable's domain, we determined equivalence classes using this information. Knowing the reaches of each equivalence class allowed us to determine the boundaries of the domains of each input variable and as such, determine the values which should be selected for unit testing. There is some overlap with these techniques but we felt that the combination of these two covered the requirements of each function but in reality its been more equivalence class

# 3 Test cases developed

// write down the name of the test methods and classes. Organize the based on
the source code method // they test. identify which tests cover which partitions
you have explained in the test strategy section //above


| Class          | Method   | Test Name | Strategy |
| -------------- | ---------------------------- | ---------------------------- | ---------------------------- |
| Range Class    |  getCentralValue()  |  centralValueShouldBeZero()   |  Tests basic functionality of getCentralValue by inputing 1 and -1. Expects 0.   | 
|  Range Class              | getCentralValue()  | centralValueShouldBeZeroZero()    | Tests basic functionality of getCentralValue by using larger values (-2, 2).   | 
|  Range Class              |  getCentralValue() | centralValueShouldBeFour()   | Tests getCentralValue() in order to get a central value of more greater than 0 by using input of 2 and 6. Expect to get 4.     | 
|   Range Class             |  getCentralValue()   | centralValueShouldBeOne()    |  Tests if the central value can be determined if the lower and upper boundary of the range are the same.   | 
|   Range Class             |  getLowerBound()    |  getLowerBoundTest()     |  Tests basic functionality of getLowerBound by using a range of two small double values (1.5/7.6). Expect to get 1.5.
|   Range Class             | getLowerBound()     |  getLowerBoundTestWithEqualBoundaries()     |   Tests getLowerBound by inputting two equal values for the lower and upper boundary (2, 2).Expect to get 2.0.
|   Range Class             |  getLowerBound()    |  getLowerBoundTestWithNegativeLowerBoundary()     |   Tests to see if a negative lower boundary can be used in the Range (-2.015, 2.0) to get the correct lower boundary. Expect to get -2.015.
|   Range Class             |  getLowerBound()    |  getLowerBoundTestWithNegativeBoundaries()     |     Tests to see if negative boundaries can be used in the Range (-96, -10) to get the correct lower boundary. Expect to get -96     |
|   Range Class             |  getUpperBound()    |  getUpperBoundTest()     |     Tests basic functionality of getUpperBound by using a range of two small double values (1.5/7.6). Expect to get 7.6.     |
|   Range Class             |  getUpperBound()    |  getUpperBoundTestWithEqualBoundaries()     |     Tests getUpperBound by inputting two equal values for the lower and upper boundary (2.0, 2.0). Expect to get 2.0.     |
|   Range Class             |  getUpperBound()    |  getUpperBoundTestWithNegativeLowerBoundary()     |     Tests to see if a negative lower boundary can be used in the Range (-2.015, 2.0) to get the correct upper boundary. Expect to get 2.0.    |
|   Range Class             |  getUpperBound()    |  getUpperBoundTestWithNegativeBoundaries()      |     Tests to see if negative boundaries in the Range (-2.015, -2.0) can be used to get the correct upper boundary. Expect to get -2.0.     |
|   Range Class             |  getLength()    |  getLengthShouldBeSeventyTwo()     |     Tests basic functionality to see if getLength will work with the Range (24, 69). Expect to get 72.     |
|   Range Class             |  getLength()    |  getLengthShouldBeZero()     |     Tests to see if a Range (0, 0) will return the correct length. Expect to get 0.     |
|   Range Class             |  getLength()    |  getLengthNegativeLowerBoundary()     |     Tests if getLength works with a negative lower boundary in the Range (-24.5, 96). Expect to get 120.5.     |
|   Range Class             |  getLength()    |  getLengthNegativeBoundaries()     |     Tests if getLength works with negative boundaries in the Range (-96, -10). Expect to get 86.     |
|   Range Class             |  contains(double value)    |  containsTestLowerBoundary()     |     Tests that countains can detect a lower boundary with Range (-96, -10). Expect to get true.     |
|   Range Class             |  contains(double value)    |  containsTestUpperBoundary()     |    Tests that countains can detect an upper boundary with Range (-96, -10). Expect to get true.      |
|   Range Class             |  contains(double value)    |  containsTestAboveUpperBoundary()     |    Tests that contains will not detect a value above the upper boundary with Range (-96, -10) with a check for -9. Expect to get false.      |
|   Range Class             |  contains(double value)    |  containsTestBelowLowerBoundary()     |     Tests that contains will not detect a value below the lower boundary with Range (-96, -10) with a check for -97. Expect to get false.     |
|   Range Class             |  contains(double value)    |  containsTestMiddleValue()     |     Tests to see if contains will detect a value in the middle of a Range (-50, 23) with a check for 10. Expect to get true.     |
|   Range Class             |  contains(double value)    |  containsTestWithDouble()     |     Tests to see if contains will detect a double value in a Range (-50.25, 23) with a check for -50.23). Expect to get true.     |
|   Range Class             |  contains(double value)    |  containsTestBelowLowerBoundaryWithDoubles()     |     Tests to see if contains will detect a double below the lower boundaries of a Range (-50.25, 23) with a check for -50.26. Expect to get true.     |
| DataUtilities Class |  calculateColumnTotal(Values2D data, int column)  |  calculateColumnTotalForTwoValues()   | Test basic functionality by creating two rows with small values (7.5, 2.5). Add the values of each column. Expecting 10.0.    | 
|  DataUtilities Class               | calculateColumnTotal(Values2D data, int column)  |  calculateNullColumn()   |  Try to calculate the total sum of a non-existing column. Should not work and a NullPointerException should be thrown.    | 
|  DataUtilities Class               | calculateRowTotal(Values2D data, int row)  |  calculateRowForTwoValues()  | Test basic functionality by creating two columns with small values (5.5, 4.5) and sum up each column. Expecting 10.0.    | 
|  DataUtilities Class              |   calculateRowTotal(Values2D data, int row)   | calculateNullRowTotal()    | Try to calculate the total sum of a non-existing row. Should result in a NullPointerException.    |
|  DataUtilities Class              |  createNumberArray(double[] data)   |  createNumberArrayTest()   | Test basic functionality by constructing a number array using createNumberArray(double[] data) and integer values (1, 2, 3). A Number array should be created that is equal to {1.0, 2.0, 3.0}.    |
|  DataUtilities Class              |  createNumberArray(double[] data)   |  createNumberArrayWithDoubles()   |  Test that function accepts doubles to create a Number array by using values of {1.45, 2.84, 3.35}. Expect to create a Number array equal to this array.   |
|  DataUtilities Class              |  createNumberArray(double[] data)   |  createNumberArrayWithNull()   |  Test that the function will not create an array and instead return an IllegalArgumentException.  |
|  DataUtilities Class              |  createNumberArray2D(double[][] data)   |  createNumberArray2D()   |  Test basic functionality by inputting a small 2D array with basic int values ({{1, 1}, {2, 2}, {3, 3}}). Expecting to get a 2D Number array with the same values as the input array.  |
|  DataUtilities Class              |  createNumberArray2D(double[][] data)   |  createEmptyNumberArray2D()   |  Test that the function will ne able to construct an empty array. Expecting an empty 2D Number array.  |
|  DataUtilities Class              |  createNumberArray2D(double[][] data)   |  createNullNumberArray2D()   |  Test that the function will not create a 2D array and instead return an IllegalArgumentException.  |
|  DataUtilities Class              | getCumulativePercentages(KeyedValues data)    |  getCumulativePercentagesTest()   |  Test basic functionality of this function by creating a mock object of 2 (2, 1) KeyedValues values and call getCumulativePercentages(values). Expected value is 1.0. |
|  DataUtilities Class              | getCumulativePercentages(KeyedValues data)    | getCumulativePercentagesTestWithLotsOfValues()    | Test basic functionality of this function using a larger amount of KeyedValues values.    |
|  DataUtilities Class              | getCumulativePercentages(KeyedValues data)    | getCumulativePercentagesTestWithTwoValues()    | Test functionality of function using a mock object of KeyedValues and checking individual elements of the created table.   |
|  DataUtilities Class              |  getCumulativePercentages(KeyedValues data)   |  getCumulativePercentagesTestNullItems()   |  Try to create a mock object of KeyedValues that is null, and input this Null KeyedValues list int getCumulativePercentages()  |
|  DataUtilities Class              |  equal(double[][] a, double[][] b)   |  equalsTest()   |  Test basic functionality of this function by constructing two equal 2D arrays and calling equals() using the two equal arrays as input. We are expecting the function to return true. |
|  DataUtilities Class              |  equal(double[][] a, double[][] b)   |  equalsTestNotEqual()   | Test basic functionality of this function by constructing two different 2D arrays and calling equals() using the two different arrays as input. We are expecting the function to return false.  |
|  DataUtilities Class              |  equal(double[][] a, double[][] b)   |  equalsTestEmptyArrays()   |  Try to test that two arrays are equal even when they are empty. We are expecting the function to return true.  |
|  DataUtilities Class              |  equal(double[][] a, double[][] b)   |  equalsTestNullArrays()   | Try to see if two null 2D arrays are considered to be equal. Expected to return true.   |



# 4 How the team work/effort was divided and managed

All work was produced as a team. We collaborated together and completed the writing of all tests synchronously. As a team, meetings were decided based on availability of all members. Given a date and time that worked for everyone, we met on our Discord Server. Our team work was mainly done through pair programming, to ensure higher quality of code. While one team member worked on writing everything down, the rest of the team determined which tests needed to be performed. This practice ensured that we caught typos and bugs faster. We were also able to develop test cases quickly and efficiently. 

# 5 Difficulties encountered, challenges overcome, and lessons learned

We had some difficulties getting JUnit to work on Eclipse. The main difficulty faced during this project was the abundance of failure traces. Our team spent a lot of time trying to fix this issue, which initially slowed down our process. However, this problem was fixed after adding the hamrest-1.3.jar file. Additionally, there was some difficulty coming up with correct test cases for certain methods, specifically methods in DataUtilities. Certain methods had ambiguous Javadoc documentation, which caused confusion among the team. Because of this, it was difficult to establish the expected output for these methods. After some research and problem solving, our team was able to calculate and predict the expected values. We also had to spend a considerable about of time figuring out how to properly make mock Values2D objects. Finally, there was a bit of a challenge trying to make non-redundant test methods, but this problem was solved by using the boundary testing methods taught in class.   

# 6 Comments/feedback on the lab itself

This lab was a good introduction to writing automated tests using JUnit. We were able to apply our knowledge by making test cases that used elements of black box testing and boundary value testing. The use of mock objects was somewhat simple and the classes we tested helped us learn how to create and use mock objects. A jar file that was required for the assignment was not included and we were expected to find that file on the internet and source it from there. This delayed the learning experience as we spent more time initially on finding the file instead of working with it. The lab presentation was very useful as we were given some necessary feedback.
