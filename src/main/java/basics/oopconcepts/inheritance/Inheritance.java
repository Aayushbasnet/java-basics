package basics.oopconcepts.inheritance;

/*
    inheritance: to create hierarchy between classes by inheriting from other classes. We need to use "extend" keyword. We can extend any classes except
    final class. eg: String class is a final class,so we cannot extend it.
 */
public class Inheritance {
    public static void main(String[] args) {
        Car tesla = new Car("Accelerate the advent of sustainable transport and electric technology.");
        tesla.setBrandName("Tesla");
        tesla.setModelName("Tesla Cybertruck XFY.2");
        tesla.setColor("Matt Black");
        tesla.setTopSpeed(604.23);
        tesla.setNumberOfGears(7);
        tesla.setNumberOfWheels(6);

        tesla.getVehicleInfo();
    }
}
