/* 
Class Name: Computer Science II Section I
Assignment Number: Assign 2
Program author: Program written by Joshua Greene
Date of last modification: Last Modified on 2/5/2020
OS used: Windows 10
IDE used: jGRASP
*/

/*
Program Discription:
This program takes the user's name, major, and year in school when prompted.
The program only allows certain inputs by the user and returns a message to
the user if a wrong input is given.The output contains the user's initials,
the user's major, and their year in school.
*/

import java.util.Scanner;


public class MajorYear {
     
     // The method below is the main method.
     public static void main(String[] args) {
     
          //initializing variables
          String first;
          String last;
          char firstChar;
          char lastChar;
          String userInput;
          char major;
          char year;
          String majorStr;
          String yearStr;
          boolean valid = true;
          
          //creating Scanner object
          Scanner input = new Scanner(System.in);
          
          //asking for name and storing input in first and last
          System.out.println("What is your first and last name?:");
          first = input.next();
          last = input.next();
          
          //getting initials
          firstChar = first.charAt(0);
          lastChar = last.charAt(0);
          
          //providing list of majors to user & storing the input in major
          System.out.println("What is your major?:\n");
          System.out.println("M: Mathematics\n");
          System.out.println("C: Computer Science\n");      
          System.out.println("E: Engineering\n");
          
          System.out.println("What year in school are you?:\n");
          System.out.println("1: Freshman\n");
          System.out.println("2: Sophomore\n");      
          System.out.println("3: Junior\n");
          System.out.println("4: Senior\n");
          
          System.out.println("(NOTE: Please enter your major and year w/o a space between)");
          
          //storing user input in "userInput" variable
          userInput = input.next();
          
          //setting the first part of the input to "major"
          major = userInput.charAt(0);
          
          //setting the second part of the input to "year"
          year =  userInput.charAt(1);
          
          
          
          //converting "major" to a String type
          majorStr = String.valueOf(major);
          
          //converts "year" to a String type
          yearStr = String.valueOf(year);



          //if statements for determining Major:          
          if(major == 'M') {
          
               majorStr = "Mathematician";
          }
          
          else if(major == 'C') {
               
               majorStr = "Computer Science";
          }
          
          else if(major == 'E') {
               
               majorStr = "Engineering";
          }
          
          else {
          
               System.out.println("Invalid Major Input");
               valid = false;
          }

               
               
          //switch statement for determining Year in school:                 
          switch(year) {
                    
                    
               case '1': yearStr = "Freshman";
                                   break;
                    
               case '2': yearStr = "Sophomore";
                                   break;
                    
               case '3': yearStr = "Junior";
                                   break;
                    
               case '4': yearStr = "Senior";
                                   break;
                                   
               default: System.out.println("Invalid Year Input");
                        valid = false;  
          }
               
          //checking to see if both parts of the inputs were valid and if so, prints the output     
          if(valid) {   
           
               /*NOTE: Must put the "" at the beginning of the print statement so that you dont
                 get the ascii values for the characters!
               */ 
               System.out.println("" + firstChar + lastChar + " " + majorStr + " " + yearStr);
           }
           
     }
}