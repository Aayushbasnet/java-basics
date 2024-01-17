package basics.oopconcepts.interfaces;

/*
    Class can extend only one class whereas a class can extend multiple number of interfaces.
    We cannot instantiate interface. Interface can be used as type.
 */

public class InterfaceBasics {
    public static void main(String[] args) {
        System.out.println("Computer--------");
        Computer computer1 = new Computer();
        computer1.start();
        computer1.displayInformation();

        System.out.println("Vehicle  --------");
        Vehicle vehicle1 = new Vehicle("car");
        vehicle1.drive();
        vehicle1.displayInformation();


        System.out.println("IInformation interface type for object Vehicle");
        IInformation vehicle2 = new Vehicle("Cyber-Truck"); // Vehicle implements IInformation interface so we can use IInformation as type.
        vehicle2.displayInformation();

        System.out.println("Calling private method of InterfaceBasics class");
        showInformationFromMainClass(computer1);
        showInformationFromMainClass(vehicle1);
        showInformationFromMainClass(vehicle2);
    }

    private static void showInformationFromMainClass(IInformation info){
        info.displayInformation();
    }
}
