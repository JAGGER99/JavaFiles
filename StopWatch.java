/*Below is the StopWatch class used in the "TestStopWatch" file
for starting, stopping, and returning the ellapsed time:
*/

import java.lang.System;  // for currentTimeMillis()


class StopWatch {
   
     //data fields (instance variables):
     private long startTime;
     private long endTime;
     private double returnValue;
     private boolean inSec;

 
     //constructors:
     StopWatch() {
      
          inSec = false;
     }
   
     StopWatch(boolean chooseMill) {
      
          inSec = chooseMill;
     } 
 
     //methods:
     void start() {
  
          startTime = System.currentTimeMillis();
     }
 

     void stop() {
   
          endTime = System.currentTimeMillis();
     }
   
   
     double getElapsedTime() {
   
          if(inSec) {
        
               returnValue = (endTime - startTime) / 1000.0;
          }
      
          else {
      
               returnValue = (endTime - startTime);
          }   
      
          return returnValue;    
     }
   
}