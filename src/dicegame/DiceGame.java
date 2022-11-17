/* Name: Nolan Rabe
 * Date: 9/04/20
 * Purpose: Simulate outcomes of rolling dice
 */

package dicegame;

import java.util.*;
import java.text.NumberFormat;

public class DiceGame {

    
    public static void main(String[] args) 
    {        
        //Constants
        
        final double LESSTHANFIVE = 3.0;
        final double EXACTLYFIVE = 8.0;
        final double MORETHANFIVE = -2.0;        
        
        //Variables
        
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        int secondDie;
        int diceRolls;
        int printResults;
        int totalRolls = 0;
        double winnings = 0.0;
        String name;        
        
        //Input
        
        System.out.println("How many sides should the second die have?"); //ask the user how many sides the second die should have
        secondDie = input.nextInt();        
        
        System.out.println("\nHow many times should we roll the dice?"); //ask the user how many times we should roll the dice
        diceRolls = input.nextInt();        
        
        System.out.println("\nHow often should we print results?");      //ask user how often to print the results
        printResults = input.nextInt();        
        
        input.nextLine();                                                //flushes the extra enter from input stream        
        
        System.out.println("\nWhat is your name?");                      //ask user for their name
        name = input.nextLine();        
        
        //Creating the dice
        
        Die sixSideDie = new Die();
        Die userDie = new Die(secondDie);        
        
        //Output
        
        if(name.length() > 5)                                                //check to see if name is longer than 5 characters
            System.out.println("\nExperiment by: " + name.substring(0, 5) + "\n");
        else
            System.out.println("\nExperiment by: " + name + "\n");            
        
        for(int x = 1; x <= diceRolls; x++)
        {
            int sixDieRoll = sixSideDie.roll();                              //rolling dice
            int userDieRoll = userDie.roll();
            totalRolls++;
            
            if(sixDieRoll + userDieRoll < 5)                                 //adds $3 to winnings for rolling less than 5
                winnings = winnings + LESSTHANFIVE;                          
            else if(sixDieRoll + userDieRoll == 5)                           //adds $8 to winnings for rolling exactly 5
                winnings = winnings + EXACTLYFIVE;
            else                                                             //subtracts $2 from winnings for rolling over 5
                winnings = winnings + MORETHANFIVE;
            
            if(totalRolls % printResults == 0)                               //prints results at user given intervals
                System.out.println("Rolls: " + totalRolls + "\tAverage winning "
                        + "per roll: " + money.format(winnings/totalRolls));                   
        }
        
        System.out.println("Rolls: " + totalRolls + "\tAverage winning "     //printing totals results
                        + "per roll: " + money.format(winnings/totalRolls));       
        
    }//end main()
}
