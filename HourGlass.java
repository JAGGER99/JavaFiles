/* 

Program author: Program written by Joshua Greene
Date of last modification: Last Modified on 2/10/2020
OS used: Windows 10
IDE used: jGRASP
*/

/*
Program Discription:

This program populates a multi-dimensional array with user input and looks at all the possible upright "hour glasses"
and determines which hourglass sum is the max!

example of an "hour glass":  " a b c "
                                 d
                               e f g

example of an hour glass sum:  " a + b + c + d + e + f + g "    

                          
                              
*/




import java.util.Scanner;

//method for calculating the maximum sum:    
public class HourGlass {
    
    
    static int hourglassSum(int[][] arr) {
            int maxSum = -63; //-9 * 7 this is the lowest possible number from a hour glass with -9 in all positions.
            int currentSum;

            for(int i=0; i < 4 ; i++) {
                for(int j=0; j < 4 ;j++) {
                
                    // this is adding the positions of each hour glass in the multi dimensional array:
                    currentSum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                    
                                 
                        if(currentSum > maxSum) {
                            maxSum = currentSum;
                        }                                

                }
            }
        
        return maxSum;

    }
    
    
   // main method:
   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
   
      //creating multi dimensional array:
      int[][] multiArray = new int[6][6];
      
      
      
      //KEY!!! -----> for all "i" and "j",  *** -9 < multiArray[i][j] < 9 ***
      System.out.println("Please type 36 integers (with spaces) where each is in the interval [-9,9]");
      
      
      
      //assigning values to my array usign a nested for loop:
      for(int i = 0; i < 6; i++) {
   
         for(int j = 0; j < 6; j++) {
         
            multiArray[i][j] = input.nextInt(); //assigning values of array from user input.
      
         }   
      }



      int x = hourglassSum(multiArray);
   
      System.out.println("The maximum sum from an hour glass is " + x );

   }     
    
}