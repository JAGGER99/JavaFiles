/* 
Class Name: Computer Science II Section I
Assignment Number: Assign 1
Program author: Program written by Joshua Greene
Date of last modification: Last Modified on 1/19/2020
OS used: Windows 10
IDE used: jGRASP
*/

/*
Program Discription:
This program calculates the US population after a time is specified by the user.
The program calculates how many births, deaths, and immagrations occur during that time.
Then the program adds these numbers (or subtracts) to the current population to find the total at the user's year. 
The output contains the year the user inputted along with the population at that time.
*/

import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;


public class USpopulation {

     // The method below is the main method.      
     public static void main(String[] args) {
      
          //creates variable(s) & constant.
          int years;
          double births;
          double deaths;
          double immigrants;
          final int INIT_POP = 329546610;
          double newPop;
          int intNewPop;
      

          //creates Scanner object from class Scanner.
          Scanner input = new Scanner(System.in);
          
          //asks for input from the user.
          System.out.println("Please type how many years in the future you would like to know the US population: ");
          
          //takes integer input from user and stores it in variable "years".
          years = input.nextInt();
          
        
          //calculates births, deaths, and immagrations after "years" amount of years.
          births = years * ((60 * 60 * 24 * 365) / 7.0);
          deaths = years * ((60 * 60 * 24 * 365) / 13.0);
          immigrants = years * ((60 * 60 * 24 * 365) / 45.0);
           
           
          //calculates the new population. 
          newPop = INIT_POP + births - deaths + immigrants;
          
          //truncates the decimal part of "newPop" by converting it to an int variable type.
          intNewPop = (int)(newPop);
          
          
          //These two lines convert the variable "newPop" to a String so that commas are placed every three digits.
          // I do this by creating an instance of classes "NumberFormat" and "String".   
          NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
          String numberAsString = numberFormat.format(intNewPop);
                 
          
          //prints the output.
          System.out.println("The population " + years + " year/s from now will be " + numberAsString + ".");


     }
   
}