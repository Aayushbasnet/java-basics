package basics.oopconcepts.polymorphism;

public class Car extends Vehicle{
    @Override
    public void design() {
        super.design(); // calls design() of vehicle

        System.out.println("The is a overridden design method of class Vehicle");
    }

    public void ride(){
        System.out.println("Riding the car");
    }
}
