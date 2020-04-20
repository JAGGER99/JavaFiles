public class KeyBoardCheck {

   public static void main(String[] args) {
   
      String[] words = {"hello","tree","green","you","glad"};
   
      char[] row1 = {'q','w','e','r','t','y','u','i','o','p'};
      char[] row2 = {'a','s','d','f','g','h','j','k','l'};
      char[] row3 = {'z','x','c','v','b','n','m'};
      
 /////////////////////////////////////////////////////////////////////////  
    int a;
    int b;
    int c;
    // for-loop for each word in my "words" array
    for(int i = 0; i < words.length; i++) {
         //have to set to zero after each word otherwise it will just return the total at the end!
         a = 0; 
         b = 0;
         c = 0;
         
         //for-loop for getting the "j"th character of the "i"th word in my array
         for(int j = 0; j < words[i].length(); j++) {
         
            //for loop for comparing the "j"th character of the "i" word to every character in my "row1" array
            for(int k = 0; k < row1.length; k++) {
               if(words[i].charAt(j) == row1[k]) {
                     a++;
                     break;//doesnt add to the program but just speeds up the process!
               }
            }
            //for loop for comparing the "j"th character of the "i" word to every character in my "row2" array
            for(int l = 0; l < row2.length; l++) {   
               if(words[i].charAt(j) == row2[l]) {
                     b++;
                     break;//doesnt add to the program but just speeds up the process!

               }
            }
            //for loop for comparing the "j"th character of the "i" word to every character in my "row3" array
            for(int m = 0; m < row3.length; m++) {   
               if(words[i].charAt(j) == row3[m]) {
                     c++;
                     break;//doesnt add to the program but just speeds up the process!

               }
            }
    
         } //end of second for loop
         
        //collection of if statements for determining the output 
        if(a == words[i].length()) {
           
           System.out.println( " '" + words[i] + "' " + " can be spelled with letters only found on row 1"  );
    
         }
    
         if(b == words[i].length()) {
           
           System.out.println(" '" + words[i] + "' " + " can be spelled with letters only found on row 2" );
    
         }
    
         if(c == words[i].length()) {
           
           System.out.println( " '" + words[i] + "' " + " can be spelled with letters only found on row 3" );
    
         }
    } //end of first for loop

    
    
  }
}