/*
This program prints out the substring of a string with the highest "value".
(where "value" is determined by how far down the alphabet you are!)
(value in ascending order: a,b,c,d,e,f,....,x,y,z)

*example:
         given:           aba
         substrings:      {a,ab,aba,b,ba,a}
         program returns: ba
*/


import java.util.Arrays;

public class LastSubString {

   public static void  main(String[] args) {
   
      
      String s = "aba"; //the String I am going to be working with.
      
      //finding the number of times my string runs through the nested for-loop below:
      int sum = 0;
      for(int n = s.length(); n > 0; n--) {
         
         sum+= n;
      }
      
      //initializing my String array with size 6 becuse: 3+2+1 =6.
      String[] array = new String[sum];  
      
      //initializing counter:     
      int counter = 0;         
         
            //start of my nested for-loop:      
            for(int i = 0; i < s.length(); i++) {
            
        
                  String lastVal = ""; //have to reset lastVal for each character in the string.
         
                  for(int j = i; j < s.length(); j++) { //starting at "i" and incrementing till your orginal string's length.
               
                     array[counter] = lastVal + s.charAt(j); //setting array value to string at iteration "j".
               
                     lastVal = "" + array[counter]; //setting lastVal to the previous string.
                     counter++;  //incrementing counter.   
         
                  }          
            }
  
      //sorting my String array using Array class:    
      Arrays.sort(array);  
      
      // printing out the final element in my String array (which is the largest valued substring):
      System.out.println(array[array.length-1]);
      
   }
}