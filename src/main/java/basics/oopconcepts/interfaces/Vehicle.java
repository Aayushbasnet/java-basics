package basics.oopconcepts.interfaces;

public class Vehicle implements IInformation {
    private String type;

    public Vehicle(String type){
        this.type = type;
    }

    public void drive(){
        System.out.println("Vehicle is driving.");
    }

    @Override
    public void displayInformation() {
        System.out.println("Vehicle type is: " + type);
    }
}
