
import java.util.Scanner;


public class Guessanumber {

 

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String response;

        int low = 1;

        int high = 1000000;

        int currentGuess = 500000;

        boolean done = false;

        System.out.println("This program will guess the integer number you are speaking of");

        System.out.println("Think of a number between 1 - 1,000,000.");

 

        while (!done) {

            System.out.println("Is the number " + currentGuess + "? {H,L,E}");

           
            response = input.nextLine();
            
            
         /* Does the same thing as what is inside the switch() just differently:

            String x = response.toUpperCase();
             char y = x.charAt(0);
         */
            
 
            //uses a switch for the different input types (works like an "if" statement)
            //uses String class methods ".toUpperCase()" and ".charAt()" to convert the input to uppercase and return the first element of the user's input String 
            switch(response.toUpperCase().charAt(0)) {

 

                case 'H':
                    //Higher!
                    low = currentGuess + 1;

                    break;

                case 'L':
                    //Lower!
                    high = currentGuess - 1;

                    break;

                case 'E':
                    //Equal!
                    done = true;

                    break;

 

                default:

                    System.out.println("please enter H/L/E.");

            }

           
            //averages the "low" and "high" to get the value in between.
            currentGuess = (high + low) / 2;

        }

        System.out.println("I guessed your number!!!");

 

    }

}