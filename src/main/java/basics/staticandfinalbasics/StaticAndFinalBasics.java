package basics.staticandfinalbasics;

/*
    => non-static variables are also known as instance variables because each object gets its own copy.
    => static variables are also known as class variables as it belongs to a class and exists only in one copy of this variable because there is only one class
    => static/class variables/methods cannot access non-static/instance variables/methods because static/class variables/methods exists before making any object of the class so it
            doesn't know about the value that we've given to instance/non-static variables/method through objects. But non-static variables/methods can access static data
    => Static variable/methods are usually used for constants.
    => Finals are used for constants that are unchangeable values (once value is assigned we cannot change the value). Eg: public static final double PI_CONSTANT = 3.14
 */

class Student{
    public static final double PI_CONSTANT = 3.14;
    public String studentName;
    public static String faculty;
    public static int objectCreationCount = 0;

    public Student(){
        objectCreationCount++;
    }

    public void displayStudentName(){
        System.out.println("Student name is " + this.studentName);
    }

    public static void displayFacultyName(){
        System.out.println("Faculty name is " + faculty);
    }

    public static void displayTotalObjectCreatedCount(){
        System.out.println("Total object created is: " + objectCreationCount);
    }
}
public class StaticAndFinalBasics {
    public static void main(String[] args){
        Student.faculty = "Engineering";
        Student.displayFacultyName();
        Student.displayTotalObjectCreatedCount();


        Student.faculty = "Nursing";
        Student.displayFacultyName();
        System.out.println("Before creating object");
        Student.displayTotalObjectCreatedCount();

        System.out.println("Value of pi is: " + Student.PI_CONSTANT);

        Student student1 = new Student();
        System.out.println("After creating first object");
        Student.displayTotalObjectCreatedCount();

        Student student2 = new Student();
        System.out.println("After creating second object");
        Student.displayTotalObjectCreatedCount();

        student1.studentName = "Aayush Basnet";
        student1.displayStudentName();

        student2.studentName = "Sanjeeta Bhandari";
        student2.displayStudentName();
    }
}
