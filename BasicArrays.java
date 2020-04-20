import java.util.Arrays; // needed for .sort() method on line 26.

public class BasicArrays {

   public static void main(String[] args) {
   
      //creating an array that is 8 "blocks" long (the initial values stored are 0's).
      int[] myArray = new int[8];     
        
      System.out.println("This is my size 8 array:");
        
      //a for-loop going through all the elements in myArray and populating that index with that index's value.
      for(int i=0; i < myArray.length; i++) {
      
         myArray[i] = i+1;
         System.out.println(myArray[i]);
      }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println();
       
        //creating a new array with set values. 
        int[] myArray2 = {2,111,34,4,16,54,7,3};
        
       
        //sorting myArray2 in ascending order using a method from the Array class: 
        Arrays.sort(myArray2); //NOTE: you cant set this equal to a variable...it has to be its own line.
        
        int[] myArray3 = new int[8];
        
        //copying myArray2 values to myArray3:
        System.arraycopy(myArray2, 0, myArray3, 0, myArray2.length);
        
        System.out.println("This is an array sorted in ascending order:");
        
        //printing all my values in myArray3 that I copied from myArray2:
        for(int i = 0; i < myArray3.length; i++) {
            
            System.out.println(myArray3[i] + " ");
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println();
        System.out.println("Code for MathWorks Interview:");


        int[] joshArray = new int[10];
        
        //populating myArray4 with the index number:
        for(int i = 0; i < joshArray.length; i++) {
        
            joshArray[i] = i+1;
            System.out.println(joshArray[i]);
        } 
        
        System.out.println();
        
        //creating a multi dimensional array with 5 ROWS and 2 COLUMNS: 
        int[][] multiArray = new int[5][2]; 
                                 // [i][j]
        
        // using a nested for loop to populate my multi-dimensional array(multiArray) with values from my 1-D array (joshArray[]):
        for(int i = 0 ; i < multiArray.length; i++) { //runs 5 times....multiArray.length is always 5.
            for(int j = 0; j < multiArray[i].length; j++) { // runs 2 times... multiArray[i].length is always 2. 
               
               if (j == 0)
                  multiArray[i][j] = joshArray[i];
                  
                  
               if (j == 1)
                  multiArray[i][j] = joshArray[i + 5];
               
               System.out.print(multiArray[i][j]+ " ");
            
            }
          
           System.out.println();
        }

   }        
}   
