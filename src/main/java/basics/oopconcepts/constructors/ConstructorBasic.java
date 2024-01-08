package basics.oopconcepts.constructors;
class ClassWithConstructor{
    int value;
    public ClassWithConstructor(){
        System.out.println("I am a constructor");

    }
    // constructor with parameter
    public ClassWithConstructor(int value){
        this.value = value;
        System.out.println("I am a constructor with parameter of value: " + value + " " + this.value);
    }
}

public class ConstructorBasic {
    // difference between method & constructor is that constructor cannot have any return type
    // constructor name must be same as Class name
    // constructors are called only at the time of object creation. So, can be called only once for an object but methods can be called any number of times.

    public static void main(String[] args) {
        ClassWithConstructor classWithConstructor = new ClassWithConstructor();
        ClassWithConstructor classWithConstructor1 = new ClassWithConstructor(5);
    }
}
