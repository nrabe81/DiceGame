You are given a class called Die, which has a default constructor (makes it 6-sided) and has a parameterized constructor that accepts a number of 
sides (minimum 4 sides or else it will throw an exception).   It also has a method called roll() which rolls itself and returns the (int) result;
it also has a method called getNumSides() which returns the (int) number of sides it has.   You will write a program called DiceGame.java that 
simulates running the game over and over by doing the following:

 	Ask the user how many sides the second die should have; store the response.
 	Ask the user how many times to roll the dice; store the response.
 	Ask the user how often to print the results; store the response.
 	Ask the user to enter their name and store the response.  Their name can have spaces in it.
 	Create a 6-sided die to use.
 	Create a die with as many sides as the user entered (using its parameterized constructor) to use.
 	Skip a line (use \n in your next output to do this) and then print “Experiment by: “ and then their name.   But…if their name has more than 5 characters, then just print first 5 characters of the name; otherwise print the whole name.
 	Tell both dice to roll themselves as many times as the user said to.  As this is happening,
  
•	At every roll, add up the dice results, calculate the “winnings,” and keep track of how much money you have won or lost since the game began.  The money should look like money (see below for how to do this).
•	Every n rolls, print the number of rolls that have occurred so far and the average money won/lost (total divided by number of rolls so far).  n here is how often the user said to print the results.  See the example below for the exact format.
 	After all the rolls are finished, print the final number of rolls and the average money won/lost (total divided by number of rolls).  
