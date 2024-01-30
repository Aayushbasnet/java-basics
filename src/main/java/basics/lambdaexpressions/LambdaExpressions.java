package basics.lambdaexpressions;

/*
    Lambda expressions are simply a way of passing a block of code to a method.
    Typical scenario to use lambda expression: When you want to pass some code to a thread, etc.
    We used to use Anonymous Classes before Lambda expression was introduced in Java 8.
    Lambda expressions are always associated with interfaces that have a single method which are called functional interfaces
 */

// Interfaces with only one method are actually called Functional Interface. We can name them however we want.
interface IFunctionalInterface{
//    void start();
    int start(int value); // we want to return value from the block of code
}

interface IAnotherFunctionalInterface{
    int start(String value); // we want to return value from the block of code
}

class Car {
    public void drive(IFunctionalInterface obj){
        System.out.println("Driving the car");
        int startResult = obj.start(14);
        System.out.println("Returning the number: " + startResult);
    }

    public void drive(IAnotherFunctionalInterface obj){
        System.out.println("Driving the car");
        int startResult = obj.start("value");
        System.out.println("Returning the string: " + startResult);
    }

}

public class LambdaExpressions {
    public static void main(String[] args) {
        Car car1 = new Car();

        // Anonymous class example. lots of code to just pass start() method's code to drive() method. It is long and lengthy
        System.out.println("Passing code to another method using Anonymous class");
        car1.drive(new IFunctionalInterface() {
            @Override
            public int start(int value) {
                System.out.println("Car1 has started using anonymous class");
                return 15 * value;
            }
        });

        System.out.println("Passing code to another method with different parameter using Anonymous class");
        car1.drive(new IAnotherFunctionalInterface() {
            @Override
            public int start(String value) {
                System.out.println("Car1 has started using anonymous class: " + value);
                return 100;
            }
        });

        //lambda expression example.
        System.out.println("Passing code to another method using Lambda expression");
        car1.drive((int value)->{
            System.out.println("Car1 has started using lambda expression");
            return 20 + value;
        });

//        car1.drive((String value)->{
//            System.out.println("Car1 has started using lambda expression");
//            return "This is value in string: " + value;
//        }, "String master");

    }

}
