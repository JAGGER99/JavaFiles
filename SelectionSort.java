public class SelectionSort {
  
  //main method:
  public static void main(String[] args) {
  
     double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
     
     //using method "selectSort()" defined below to sort list in ascending order:
     selectionSort(list);
     
     // outputting my newly ordered list:
     for(int i = 0; i < list.length ; i++) {
          
          System.out.println(list[i] + " ");
     
     }
  }
  
  
  //method for switching the values in my array around:
  public static void selectionSort(double[] list) {

     for(int i = 0; i < list.length-1; i++) {
   
         double currentMin = list[i];
         int currentMinIndex = i;
     ////////////////////////////////////////////////
         for(int j = i+1 ; j < list.length; j++) {
         
            if(currentMin > list[j]) {
            
            currentMin = list[j];
            currentMinIndex = j;
         
            }
         }
     ////////////////////////////////////////////////
         if(currentMinIndex != i) {
            list[currentMinIndex] = list[i];
            list[i] = currentMin;  
         }
     }
     
  
  }

}  
  