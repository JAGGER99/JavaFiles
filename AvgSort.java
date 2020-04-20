/* 
Class Name: Computer Science II Section I
Assignment Number: Assign 4
Program author: Program written by Joshua Greene
Date of last modification: Last Modified on 3/3/2020
OS used: Windows 10
IDE used: jGRASP
*/

/*
Program Discription:
This program asks the user for elements to average and to sort. This program uses 3 methods:
the main method, the method for calculating average, and the method for sorting the array.
The output displays the user's numbers in an array along with the average and the sorted array.
*/

import java.util.*;

public class AvgSort {
   
     public static void main(String[] args) {
      
          //initializing variables:
          int length;
          double average;
      
          Scanner input = new Scanner(System.in);
          System.out.println("How many numbers do you want in your array?: ");
          length = input.nextInt();
      
          //creating new array called "array":
          int[] array = new int[length];
      
          //getting the values for array:
          System.out.println("Please enter your numbers?: ");
      
          for(int i = 0; i < length; i++) {
         
               array[i] = input.nextInt();      
          }
      
          //creating "arrayCopy" and copying "array" contents to it:
          int[] arrayCopy = new int[length];
          System.arraycopy(array, 0, arrayCopy, 0, array.length);
      
          //applying theAvg method to "array":
          average = theAvg(array);    
        
          //applying myBubbleSort method to "arrayCopy":
          myBubbleSort(arrayCopy);
      
          //output statements:
          System.out.println("\n");
          System.out.println(Arrays.toString(array));
          System.out.printf("The average of the above set of values is %.1f.\n\n", average);      
          System.out.println("The array sorted from least to greatest is below.");
          System.out.println(Arrays.toString(arrayCopy));

     } //end of main method
   
     //method for finding the average:
     public static double theAvg(int[] arr) {
      
          double sum = 0.0;
          double avg;
   
          for(int i = 0; i < arr.length; i++) {
         
               sum += arr[i];
          }
      
          avg = sum / arr.length;
   
          return avg;
     } //end of theAvg method


     //method for sorting my array:
     public static void myBubbleSort(int[] arr) {
      
          int n = arr.length;  
          int temp;
        
          //nested for-loop for bubble sort: 
          for(int i=0; i < n; i++){  
               for(int j=1; j < (n-i); j++){ 
          
                    if(arr[j-1] > arr[j]) {  
                                 
                         //swap elements:
                         temp = arr[j-1];  
                         arr[j-1] = arr[j];  
                         arr[j] = temp;  
                    }             
               }  
          }  
     } //end of myBubbleSort method
     
}