import java.util.Scanner;


public class Playingthelottery {


    public static void main(String[] args) {


        int guess;

        int initialAllowance = 10;
        
        boolean done = false;
        
        // creating a Scanner class object:
        Scanner input = new Scanner(System.in);
        
                

    while(!done) {
    
        //output statements:
        System.out.println("This is a lottery game. Please give me a number: ");

        System.out.println("Please enter a integer from 0-9");
                

        while (initialAllowance > 0) {
            
            //the variable "guess" needs to be inside the second while loop so the user can change it every iteration of the loop.
            guess = input.nextInt();
             
            
            //reduces the "initialAllowance" by 1.
            initialAllowance--;
            
            //converts "Math.random()*100" to an int data type.
            int winNumber = (int) (Math.random() * 10);

            System.out.println("your guess: " + guess);

            System.out.println("Winning number:" + winNumber);

 
            // if answer is right!
            if (guess == winNumber) {

 
                System.out.println("You WON!!!");
                 
                //adds 10 to allowance. 
                initialAllowance+= 10;
                
                System.out.println("Your current allowance: " + initialAllowance);
                
                System.out.println("Continue? {Y,N}");
                
                
                                
                input.nextLine(); // moves the scanner for the "input" to the next line.
                
                /* Have to add the above line because ".nextLine()" will just return the String
                  between the last guessed numeric value inputted and the invisible "/n" when the user
                  hits enter key. The problem is there is no String (a "zero length" String) between
                  them so the scanner returns nothing. 
               */

              
                //creates String data type variable "cont" and sets it to input from the user.
                String cont  = input.nextLine();
               
                if(cont.equals("Y")) {
                
                  System.out.println("Lets Go!");
                  
                  //breaks out of the second loop and starts at the first while "loop" again.
                  break; 
                }  
                
                else {
                
                  System.out.println("Thanks for playing!");
                  
                  done = true;
                  
                  // again breaking out of the second loop and starting at the first loop again (accept this time it will not run the first loop because "done = true").
                  break;
                }

            } 
            
            //if answer was wrong!
            else {

                System.out.println("Sorry! That wasn't the correct answer.");

                System.out.println("allowance remaining:" + initialAllowance);
                

            }

        }
      
         
        //if the user's tries run out than this "if" statement will run.
        if (initialAllowance == 0) {
        
            System.out.println("You lost all of your tries!");
            
            //exits the first loop out to the end of the program.
            break;
        }

         
    }
  }
}