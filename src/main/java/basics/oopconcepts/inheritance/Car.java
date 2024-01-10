package basics.oopconcepts.inheritance;

public class Car extends VehicleFactory {
    private final String brandSlogan;

    public Car(String brandSlogan){
        this.brandSlogan = brandSlogan;
    }

    @Override
    public void getVehicleInfo() {
        System.out.println("Override property");
        System.out.println("Hear our slogan: " + this.brandSlogan);
        super.getVehicleInfo();
    }

}
