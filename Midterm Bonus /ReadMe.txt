Welcome to the Function tester!   |
----------------------------------|
Kyle Bush
CSCI 2120
Midterm Bonus Assignment

To run the tester, do the following:

1. Open a new terminal at the "Code" folder.

2. In the terminal, type or paste the following: sh test.sh FunctionsTest 

This will run compile and run the tester file with the JUnit jar included in the lib folder.

NOTES: 
The program rounds the answer to 3 decimal places. This means the expected values within 
each test, since the function's answer is returned as Strings, are rounded up if needed.
To fix this, I could have changed the Function to type double so that I could return a
double value that then could have been compared properly in the test methods. I then could
have added a 0.001 tolerance to account for rounding. However, I did not know if you 
wanted the type changed.

I also did have to change things about how the function was written such as adding parenthesis
or spaces for it to be more pleasing to look at, but did not change the actual calculation of
the function.

Tests ran:
testFunction01For0:
Tests if any of the x, y ,z values are 0. Since each of these values are used to divide
At some point, none of them can be 0.

testFunction01Negative:
Tests negative integer inputs.

testfunction01Positive:
Tests positive integer inputs.