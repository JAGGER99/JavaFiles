
import java.io.*;
import java.util.*;

public class Testing{   
                                           
   public static void main(String [] args) throws IOException { // "throws IOException" mandatory for writing to/from files:


      File file = new File("testFile.txt");
            
      if(file.exists()) {
           System.out.println("The File Is Here");
      }
      
      // Writing numbers to a txt file:
      
      PrintWriter theFile = new PrintWriter(file);
      
      theFile.println(100);
      theFile.println(200);
      
      theFile.close();
      
      System.out.println("We are all done writing to the file");
      //////////////////////////////////////////////////////////////////////
      // Reading numbers from a txt file and displaying them in the console:
      
      Scanner input = new Scanner(file);
      
      if(file.exists()) {
          System.out.println("The File Is Here");
      } 
      
      int num1 = input.nextInt();
      int num2 = input.nextInt();
       
      System.out.println("The numbers are " + num2 + " and " + num1); 
      
      input.close();  
      
      System.out.println("Program is done");  
   }
}