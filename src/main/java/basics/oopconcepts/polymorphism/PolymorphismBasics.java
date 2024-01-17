package basics.oopconcepts.polymorphism;

public class PolymorphismBasics {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        Car car = new Car();

        Vehicle vehicle2 = car;
        /*
            vehicle2.design() calls overridden design() method even though its type is vehicle.
            This is because what really matters when we call a method in polymorphism is not the type of the reference that we use. It's actually
            the object with the reference is pointing at.
            The type of the reference (vehicle2) is Vehicle but the reference is pointing to car object (Car car = new Car()).

         */
        vehicle2.design();

        car.ride();

        // vehicle2 cannot call ride() method even if it references to car object because its type is Vehicle and Vehicle has only design() method. Uncomment the code below to view example
        // vehicle2.ride();

        createDesign(car);
    }

    public static void createDesign(Vehicle vehicle){
        System.out.println("create design");
        vehicle.design();
    }
}
