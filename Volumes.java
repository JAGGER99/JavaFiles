/* 
Class Name: Computer Science II Section I
Assignment Number: Assign 6
Program author: Program written by Joshua Greene
Date of last modification: Last Modified on 4/17/2020
OS used: Windows 10
IDE used: jGRASP
*/

/*
Program Discription:

This program calculates 30 or less volumes of a user's file and/or single data set.
Uses "VolumesFormulas" class for volume calculations for cylinders,cones, and spheres.
Determines the type of output (to a new file or to the console) the user wants.

*/


import java.util.*;
import java.io.*;


//driver class:
public class Volumes {
     
     //main method:
     public static void main(String[] args) throws IOException {
          
          //variables:
          String lastName;
          String haveFile;
          int i = 0;
          int volType;
          int outputType;
          boolean fileBoo = true;
          boolean consoleBoo = true;
          
          //creating arrays able to store a max of 30 volumes:
          int[] type = new int[30];
          double[] radius = new double[30];
          double[] height = new double[30];
          double[] volumes = new double[30];
          
          
          //creating Scanner instance for reading console input:
          Scanner consoleInput = new Scanner(System.in);
          
          //creating VolumeFormula instance:
          VolumeFormulas object = new VolumeFormulas();
          
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////          
//Dealing with user's set of data and output requests:
          
          //determining if user has data:
          System.out.println("Do you have your own set of data? Yes or No?");
          haveFile = consoleInput.nextLine();
          
          
          //if the user has their own volume in need of calculation:
          if(haveFile.equals("Yes")) {
               
               System.out.println("What is your shape's corresponding number?:");
               System.out.println(" 1 - Cylinder\n 2 - Cone\n 3 - Sphere");
               volType = consoleInput.nextInt();
               
               i++; //so that the counter starts at the second "box" when filling the arrays in the while loop below.
               
               if(volType == 1) {
                  
                  type[0] = 1;
                  
                  System.out.println("what is the height?: ");
                  height[0] = consoleInput.nextDouble();
                  System.out.println("what is the radius?: ");
                  radius[0] = consoleInput.nextDouble();
                  
                  volumes[0] = object.Cylinder(radius[0], height[0]);
               }
               
               else if(volType == 2) {
               
                  type[0] = 2;
                  
                  System.out.println("what is the height?: ");
                  height[0] = consoleInput.nextDouble();
                  System.out.println("what is the radius?: ");
                  radius[0] = consoleInput.nextDouble();
                  
                  volumes[0] = object.Cone(radius[0], height[0]);
               }
               
               else if(volType == 3) {
                  
                  type[0] = 3;
                  
                  System.out.println("what is the radius?: ");
                  radius[0] = consoleInput.nextDouble();
                  
                  volumes[0] = object.Sphere(radius[0]);
               
               } 
          }
          
          //determining how to output:
          System.out.println("How would you like the output?: ");
          System.out.println(" 1 - Monitor Only \n 2 - File Only \n 3 - Both");
          outputType = consoleInput.nextInt();
          
          if(outputType == 1) {
               
               fileBoo = false;
               consoleBoo = true;
          }
          
          else if(outputType == 2) {
               
               fileBoo = true;
               consoleBoo = false;
          }
          
          else if(outputType == 3) {
               
               fileBoo = true;
               consoleBoo = true;
          }
          
             
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Getting info from file + Exception Handling:  
                
          //creating File object and reading user's file in the "args" String array input from the user from the "Run Arguments" input line above:
          File file1 = new File(args[0]);
          
          //making sure the file exists and giving a second chance:                   
          if(!file1.exists()) { 
                
               System.out.println("There was an error in the file name provided.");
               System.out.println("Below, please type the name of the file you want to import data from:"); 
               String fileName = consoleInput.next();
               File newFile1 = new File(fileName);
               file1 = newFile1;
               
               
               if(!newFile1.exists()) {
                
                    System.out.println("We still cant find this file!");
                    System.out.println("The program has been terminated.");
                    System.exit(0);
               }
          }     
          
          
          Scanner fileInput = new Scanner(file1);
          
          
          //beginning of try block: 
          try {      
                
                //while-loop going through and finding the volume for each row of the txt file:
                while(fileInput.hasNextInt()) {  
          
                     type[i] = fileInput.nextInt();
           
                     //cylinder:
                     if(type[i] == 1) {
               
                          radius[i] = fileInput.nextDouble();
                          height[i] = fileInput.nextDouble();
                   
                          volumes[i] = object.Cylinder(radius[i], height[i]);   
                     }
               
                     //cone:
                     else if(type[i] == 2) {
               
                          radius[i] = fileInput.nextDouble();
                          height[i] = fileInput.nextDouble();

                          volumes[i] = object.Cone(radius[i], height[i]);
                     }    
                              
                     //sphere:
                     else if(type[i] == 3) {
                     
                          radius[i] = fileInput.nextDouble();
                     
                          volumes[i] = object.Sphere(radius[i]);
                     }
                
                     i++;
                
                } //end of while loop.      
                
          }//end of try block.
           

          //catch blocks:
          catch(InputMismatchException ex2) {
                
               System.out.println("There was was a problem with the ordering of your data!");
               System.out.println("The program has been terminated.");
               System.exit(0);
          }
         
          catch(IndexOutOfBoundsException ex3) {
          
               System.out.println("We cant store this many volumes in our database.");
               System.out.println("The program has been terminated.");
               System.exit(0);
          }
                    
 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////             
 //Output:
           
          //writing output to console:
          if(consoleBoo) {
            
              System.out.println("Total Volumes calculated: " + VolumeFormulas.count + "\n\n");
            
              for(int j = 0; j < i; j++) {
               
                    if(type[j] == 1) {
                  
                         System.out.printf("Cylinder volume with radius %.1f and height %.3f is %.2f \n", radius[j], height[j], volumes[j]);                     
                    }
                     
                    else if(type[j] == 2) {
                  
                         System.out.printf("Cone volume with radius %.1f and height %.3f is %.2f \n", radius[j], height[j], volumes[j]);
                    }
               
                    else if(type[j] == 3) {
                  
                         System.out.printf("Sphere volume with radius %.1f is %.2f \n", radius[j], volumes[j]);
                    }
              }
               
          } //end output to console.
           
           
          //writing output to the file:
          if(fileBoo) {
           
               //getting last name for file:
               System.out.println("Please enter your last name: ");
               lastName = consoleInput.next();
               
                
               //creating new file for volumes:
               File file2 = new File(lastName + ".volumeCalculations.txt");
               PrintWriter fileWriter = new PrintWriter(file2);
                
                
               fileWriter.println("Total Volumes calculated: " + VolumeFormulas.count + "\n\n");
         
               for(int j = 0; j < i; j++) {
               
                    if(type[j] == 1) {
                  
                         fileWriter.printf("Cylinder volume with radius %.1f and height %.3f is %.2f \n", radius[j], height[j], volumes[j]);
                    }
               
                    else if(type[j] == 2) {
                  
                         fileWriter.printf("Cone volume with radius %.1f and height %.3f is %.2f \n", radius[j], height[j], volumes[j]);                     }
               
                    else if(type[j] == 3) {
                 
                         fileWriter.printf("Sphere volume with radius %.1f is %.2f \n", radius[j], volumes[j]);
                    }
               }
          
      
               //closing the printwriter (the PrintWriter wont write anything to the file until it is closed!):
               fileWriter.close();

               //final output to console:         
               System.out.println("The program is finished and the volumes have been stored in the following file: " + lastName + ".volumeCalculations.txt");
            
          } //end output to file.
        
         
    } // end of main.

} // end of driver class.

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////