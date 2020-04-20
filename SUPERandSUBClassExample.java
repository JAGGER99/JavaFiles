public class SUPERandSUBClassExample {

     public static void main(String[] args) {
         
          //creating objects:
          People people1 = new People();
          Student student1 = new Student();
          Teacher teacher1 = new Teacher();
          
          
          //calling methods:
          student1.studentMethod(3, "Computer Science");
          teacher1.teacherMethod(4, "Engineering");
       
       
          System.out.println("");
          
          // all 3 objects calling method from People class (the super-class)!:
          people1.getSchoolName("LeTourneau University");
          student1.getSchoolName("LeTourneau University");
          teacher1.getSchoolName("LeTourneau University");

     }
}

///////////////////////////////////////////////////////////////////
// Super - class:
class People {
     
     //constructor:
     People() {
     }
     
     //method:
     void getSchoolName(String school) {
     
          System.out.println("the name of my school is " + school);
     }
     
}
///////////////////////////////////////////////////////////////////
//Sub - class1:
class Student extends People {
     
     //constructor:
     Student() {
     }
     
     //method:
     void studentMethod(int yearIN, String degreeIN) {
      
          System.out.println("I am a " + degreeIN + " major in year " + yearIN);
     }

}
/////////////////////////////////////////////////////////////////////
//Sub - class2:
class Teacher extends People {
     
     //constructor:
     Teacher() {
     }
     
     //method:
     void teacherMethod(int classesTeachIN, String departmentIN) {
      
          System.out.println("I teach " + classesTeachIN + " classes in " + departmentIN);
     }
}