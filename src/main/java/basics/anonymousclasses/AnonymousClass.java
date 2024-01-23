package basics.anonymousclasses;
class Computer{
    public void shutDown(){
        System.out.println("Computer is closing down");
    }
}

interface Phone{
    public void call();
}

public class AnonymousClass {
    public static void main(String[] args) {
        System.out.println("Anonymous class by extending class example");
        /*
            Here computer type is Computer class but the class here is not Computer because it takes two classes the super class
            and the child/sub class to override the method in the class of this variable or the type of this variable in Computer class.
            So, the object that the computer one is pointing at is some kind of subclass of Computer class which does not have a name.
            Therefore, this is an anonymous class.
            With anonymous classes, there is no way that you can create a new object of that class.
         */
        Computer computer = new Computer(){
            @Override
            public void shutDown(){
                System.out.println("This is anonymous class override. Macbook is shutting down");
            }
        };
        computer.shutDown();

        System.out.println("Anonymous class by implementing interface example");

        /*
            anonymous class using interface.
         */
        Phone phone = new Phone(){
            @Override
            public void call() {
                System.out.println("Calling....");
            }
        };
        phone.call();
    }
}
