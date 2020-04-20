/* 
Class Name: Computer Science II Section I
Assignment Number: Assign 3
Program author: Program written by Joshua Greene
Date of last modification: Last Modified on 4/3/2020
OS used: Windows 10
IDE used: jGRASP
*/

/*
Program Discription:
This program determines the runtime to read in a txt file, sort the file, and output the file to a new txt file.
The program uses a class called "StopWatch" found in another file to start, stop, and get the ellapsed time.
The output contains the length of time it took to read,sort, and write to a new file in seconds or milliseconds
depending on which constructor was used from our "StopWatch" class.
*/

import java.io.*;         // for IO Exception throw
import java.util.*;       // for Scanner, PrintWriter, and Arrays classes

//driver class:
public class TestStopWatch {
 
     public static void main(String[] args) throws IOException {
        
 
          // creating StopWatch object(s):
          StopWatch watch1 = new StopWatch();
          StopWatch watch2 = new StopWatch(true);
          StopWatch watch3 = new StopWatch(false);
   
          //starting clock(s):
          watch1.start();
          watch2.start();
          watch3.start();
      
          //finding a file and reading its data in:
          File file1 = new File("bigData.txt");
               
          if(file1.exists()) {
          
               System.out.println("The File Is Here");
          }
   
          Scanner input = new Scanner(file1);
      
          int[] array = new int[2500000];
      
          for(int i = 0; i < array.length; i++) {
         
               array[i] = input.nextInt();
          }
      
          //sorting data using built-in sort method:
          Arrays.sort(array);
      
          //creating a new file called "sortedData.txt & filling with sorted array":
          File file2 = new File("sortedData.txt");
      
          PrintWriter fileData = new PrintWriter(file2);
      
          for(int i = 0; i < array.length; i++) {
         
               fileData.println(array[i]);
          }
      
          //closing the file writer:
          fileData.close();
      
          //stopping clock(s):
          watch1.stop();
          watch2.stop();
          watch3.stop();
      
          //output(s):
          System.out.println("The time ellapsed is: " + watch1.getElapsedTime() + " (in milliseconds).");
          System.out.println("The time ellapsed is: " + watch2.getElapsedTime() + " (in seconds)."); 
          System.out.println("The time ellapsed is: " + watch3.getElapsedTime() + " (in milliseconds).");     
                  
     }
}