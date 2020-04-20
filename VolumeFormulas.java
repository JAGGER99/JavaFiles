//volumes formulas class:
class VolumeFormulas {
     
     //data fields:
     private double rad;
     private double hght;
     private double volumeVal;
     static int count = 0; 

     //constructors:
     VolumeFormulas() {
     
     }

     VolumeFormulas(double radiusInput) {
         
          rad = radiusInput;
     }

     VolumeFormulas(double radiusInput, double heightInput) {
          
          rad = radiusInput;
          hght = heightInput;
     }


     //methods w/ parameters (use with default constructor):
     double Cylinder(double radius, double height) {
          
          volumeVal = Math.PI * radius * radius * height;
          count++;
          return volumeVal;
     }
     
     double Cone(double radius, double height) {
          
          volumeVal = Math.PI * radius * radius * (height / 3.0);
          count++;
          return volumeVal;
     }
     
     double Sphere(double radius) {
     
          volumeVal =  Math.PI * radius * radius * radius * (4.0 / 3.0);
          count++;
          return volumeVal;
     }
     
     
     //methods w/o parameters (use with parameter constructors) for TESTER CLASS!!!:
     double Cylinder() {
     
          volumeVal = Math.PI * rad * rad * hght;
          count++;
          return volumeVal;
     }
     
     double Cone() {
          
          volumeVal = Math.PI * rad * rad * (hght / 3.0);
          count++;
          return volumeVal;
     }
     
     double Sphere() {
          
          volumeVal = Math.PI * rad * rad * rad * (4.0 / 3.0);
          count++;
          return volumeVal;
     }
 
}