//Test class for VolumeFormulas class:
public class TestVolumeFormulas {

     public static void main(String[] args) {
          
          double volumeCone1;
          double volumeCylinder1;
          double volumeSphere1;
          
          double volumeCone2;
          double volumeCylinder2;
          double volumeSphere2;
          
          //using defaut constructor & methods w/ parameters:
          VolumeFormulas object1 = new VolumeFormulas();
          
          volumeSphere1 = object1.Sphere(1);
          volumeCylinder1 = object1.Cylinder(1,2);
          volumeCone1 = object1.Cone(1,3);
          
          System.out.println("Volume of Sphere, Cylinder, & Cone using default constructor: ");
          System.out.println(volumeSphere1);
          System.out.println(volumeCylinder1);
          System.out.println(volumeCone1);
          
          //using parameter constructors & methods w/o parameters:
          
          VolumeFormulas object2 = new VolumeFormulas(1);   //sphere
          VolumeFormulas object3 = new VolumeFormulas(1,2); //cylinder
          VolumeFormulas object4 = new VolumeFormulas(1,3); //cone
          
          volumeSphere2 = object2.Sphere();
          volumeCylinder2 = object3.Cylinder();
          volumeCone2 = object4.Cone();
          
          System.out.println("Volume of Sphere, Cylinder, & Cone using parameter constructors: ");
          System.out.println(volumeSphere2);
          System.out.println(volumeCylinder2);
          System.out.println(volumeCone2);
          
          System.out.println("counter should equal 6 = " + VolumeFormulas.count); 
     
     }

}