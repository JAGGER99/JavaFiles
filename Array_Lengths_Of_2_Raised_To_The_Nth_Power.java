//Code Discription:
/* This code takes an array with 2^n elements and every iteration takes the
   last half and places it underneath the first half.
   
   example:         12345678
                 
                    1234
                    5678
                 
                      12
                      56
                      34
                      78
                 
   final result:       1
                       5
                       3
                       7
                       2
                       6
                       4
                       8

*/


public class Array_Lengths_Of_2_Raised_To_The_Nth_Power {

   public static void main(String[] args) {
   
         int n=3; //the power 2 is raised to.
         int[] arrayGiven = {1,2,3,4,5,6,7,8}; //example of array with 2^n elements.
         int[][] oldArray = new int[1][arrayGiven.length]; // initially set to dimensions of arrayGiven.
         
         for(int i = 0; i < oldArray[0].length; i++) {
               oldArray[0][i] = i+1;
         }
         
         //initializing newArray to anything since we re-assign it values in the first for-loop.
         //reason for this is because it must be initialized outside the for-loop so it can be seen outside the loop later in the code.
         int[][] newArray = new int[1][1];
                  
         
         for(int k=1; k <= n; k++) {
               
               //get the length of row and column each run through:
               double iLength = Math.pow(2,k);
               double jLength = Math.pow(2,n-k);
               
               //converting them to type int so i can use them as max index values in the array creation:
               int iLengthINT =(int)iLength;
               int jLengthINT =(int)jLength;
               
               //setting new size to newArray:
               newArray = new int[iLengthINT][jLengthINT];  // 2 x 4 // 4 x 2 // 8 x 1
               
              
                             
               //populating the newArray with values from oldArray:
                  for(int i = 0; i < iLengthINT/2; i++) { //number of rows  //iLengthINT of the NEXT array used here : 2 / 4 / 8
               
                        for(int j = 0; j < jLengthINT*2; j++) { //number of columns  //jLengthINT of the NEXT array used here : 4 / 2 / 1
                        
                           
                           if(j < jLengthINT) // i is the same when column j < jLengthINT.
                           newArray[i][j % jLengthINT] = oldArray[i][j]; //need to use modulo to know which column.
                           
                           else  // need [i + iLengthINT/2] so that that the i starts on the next row.
                           newArray[i + iLengthINT/2][j % jLengthINT] = oldArray[i][j]; //use modulo again for same reason.

                                          
                        }
               
                  } 
               
               
            //setting latest newArray values to your oldArray:
               oldArray = new int[iLengthINT][jLengthINT];
               
               for(int i = 0; i < iLengthINT; i++) {
                  for(int j = 0; j < jLengthINT; j++) {
               
                     oldArray[i][j] = newArray[i][j];
                  }
               }
        
         } //end of all for-loops!
      
      
         //creating another array to store my final newArray values in:
         int[] finalArray = new int[arrayGiven.length];
         
         for(int i = 0; i < arrayGiven.length; i++) {
         
               finalArray[i] = newArray[i][0];
               System.out.println(finalArray[i]);
         }    
   }

}