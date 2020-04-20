public class AreFloatingNumsApproximatelyEqual {

   public static void main(String[] args) {
   
         double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
         double y = 5.0;
         System.out.println(x);
         System.out.println(y);
         System.out.println((x == y) + " ... they are not exactly equal!");
         
         /* Since you cannot reliably check if two floating point numbers are equal,
            you can check to see if they are equal within a certain range using an
            epsilon value:
         */
   
         final double EPSILON = 1E-14;  // Normally for doubles you set epsilon to 10^-14 and for floats you set epsilon to 10^-7
         if(Math.abs(x-0.5) < EPSILON) {
              System.out.println(x + " is approximately 0.5 (within " + EPSILON + ").");
         }
   }

} 