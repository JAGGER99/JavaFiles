/* 
Class Name: Computer Science II Section I
Assignment Number: Assign 3
Program author: Program written by Joshua Greene
Date of last modification: Last Modified on 2/20/2020
OS used: Windows 10
IDE used: jGRASP
*/

/*
Program Discription:
This program determines how well a user knows the value of the squareroot of a number entered by the user.
The program calculates uses 2 methods: the main method & the method for calculating the squareroot approximation.
Then the program determines how many tries it took for the user to get the correct value of the squareroot. 
The output contains the actual squareroot of the value the user gave and how well the user did in guessing the number.
*/

import java.util.Scanner;

public class SquareRootApprox {

     //main method:
     public static void main(String[] args) {
   
          //variables:
          double number;
          double guess;
          double result;
          int counter = 0;
          String output = null;
    
          Scanner input = new Scanner(System.in);
      
          //getting input for "number":
          System.out.println("What value do you want the squareroot of? (number must be >= 0): ");
          number = input.nextDouble();  
      
          //if number you want to find the squareroot of is negative:
          if(number < 0) {
         
               System.out.println("There are no Real solutions for the root of this value.");
               System.exit(0); //ends the program.
          }

      
          //getting input for "guess":
          System.out.println("What is your guess for " + number + "? (guess must be > 0): ");
          guess = input.nextDouble();
      
                  
          //if initial guess is less than or equal to 0: 
          if(guess <= 0) {
      
              System.out.println("I am sorry but you will blow up the world if you guess that!!!");
              System.exit(0); //ends the program.
          }
               
          //setting "guess" value to result variable:     
          result = guess;
               
          //runs until the approximation is exact to 15 decimals:
          while(result != Math.sqrt(number)) {
         
               //calling the sqr method:
               result = sqr(number,guess);
               //setting new guess value to previous result:
               guess = result;
               //incrementing counter by 1:
               counter++;
               
               //checks to see if it is taking 11+ calls of the method to find exact value & breaking:
               if(counter > 10) {
                  break;
               }
          }  
                  
      
          //determines what the output will be:
          switch(counter) {
            
               case 0: //dont need a break statement because case 0 output is same as case 1 output.
               
               case 1: output = "you understand square roots or you picked a number really easy like 4";
                                 break;          
               case 2: output = "you are pretty good with square roots";
                                 break;                           
               case 3: output = "you are not too bad but not real good with square roots";
                                 break;                           
               case 4: output = "you are not that good with square roots";
                                 break;                           
               case 5: output = "you need more practice with square roots";
                                 break;                          
               case 6: //dont need statements for cases 6-9 because they are the same as case 10.                       
               case 7:                                    
               case 8:                                                 
               case 9:                                                      
               case 10: output = "you really don't have an understanding of square roots";
                                 break;
                           
               default: System.out.println("The program took too long to retrieve the exact value!");
                        System.exit(0);
         
          }
         
          //output statements:
          System.out.printf("\nThe actual squareroot of %f is %.15f ", number, Math.sqrt(number));
          System.out.printf("\nIt took " + counter + " times to find it so, " + output + "."); 

     } // end of main.
  
   
     // method for finding the approximation:
     public static double sqr(double x, double n) {
      
          double function;    
          function = (Math.pow(n,2) + x) / (2 * n);     
          return function;
     }
  
}