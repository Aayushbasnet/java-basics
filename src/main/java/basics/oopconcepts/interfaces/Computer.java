package basics.oopconcepts.interfaces;

public class Computer implements IInformation{
    private final int serialNumber = 8085;
    public void start(){
        System.out.println("Computer is starting.");
    }

    @Override
    public void displayInformation() {
        System.out.println("Computer serial number is: " + this.serialNumber);
    }
}
