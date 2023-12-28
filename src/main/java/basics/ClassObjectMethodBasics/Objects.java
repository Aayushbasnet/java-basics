package basics.ClassObjectMethodBasics;

/* We can have any number of classes for our project but we can only have one public class and one main method for the entry point*/

class Person{
    private String name;
    private int age;
    private float salary;
    private int phoneNumber;

     void setName(String name) {
        this.name = name;
    }
     String getName() {
        return name;
    }

     void setAge(int age) {
        this.age = age;
    }

     int getAge() {
        return age;
    }

     void setSalary(float salary){
        this.salary = salary;
    }

     float getSalary(){
        return this.salary;
    }

     void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

     int getPhoneNumber(){
        return this.phoneNumber;
    }

     void getUserDetail(){
         System.out.println(
            "Hi! I am " + this.getName() + ". I am " + this.getAge() + " years old." + " My salary is " + this.getSalary()
            + ". My phone number is " + this.getPhoneNumber()
         );
     }
}

public class Objects {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Aayush Basnet");
        person.setAge(23);
        person.setSalary(30000);
        person.setPhoneNumber(1234567890);
        person.getUserDetail();
    }
}
