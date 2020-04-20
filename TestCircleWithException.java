//this program is a good example of showing how "try-catch" and "throw" statements operate:




class CircleWithException {
  /** The radius of the circle */
  private double radius;

  /** The number of the objects created */
  private static int numberOfObjects = 0;

  /** Construct a circle with radius 1 */
  public CircleWithException() {
    this(1.0);
  }

  /** Construct a circle with a specified radius */
  public CircleWithException(double newRadius) {
    setRadius(newRadius);
    numberOfObjects++;
  }


  /** Set a new radius */
  public void setRadius(double newRadius)
      throws IllegalArgumentException {
    if (newRadius >= 0)
      radius = newRadius;
    else
      throw new IllegalArgumentException("Radius cannot be negative");
  }

  /** Return numberOfObjects */
  public static int getNumberOfObjects() {
    return numberOfObjects;
  }

 
}


////////////////////////////////////////////////////////////////////////////////////////////////////////
//(IMAGINE THIS IS IN ANOTHER FILE)
// Driver Class (class with main method):

public class TestCircleWithException {
  public static void main(String[] args) {
    try {
    
      CircleWithException c1 = new CircleWithException(5); 
      
      //object c2 will set off the throw statement in the setRadius method and instantly go
      //to the catch statement on line 57...skipping the third object c3.
      //this is why the output shows only 1 object being created (c1).
      CircleWithException c2 = new CircleWithException(-5); 
      
      CircleWithException c3 = new CircleWithException(0);
      
    }
    catch (IllegalArgumentException ex) {
      System.out.println(ex);
    }

    System.out.println("Number of objects created: " + CircleWithException.getNumberOfObjects());
  }
}