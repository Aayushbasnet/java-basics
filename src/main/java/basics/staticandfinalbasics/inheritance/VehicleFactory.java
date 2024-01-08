package basics.staticandfinalbasics.inheritance;

public class VehicleFactory {
    protected String brandSlogan;
    private String brandName;
    private String modelName;
    private String color;
    private int numberOfWheels;
    private double topSpeed;
    private int numberOfGears;

    public VehicleFactory(String brandSlogan){
        this.brandSlogan = brandSlogan;
    }

    public String getBrandSlogan(){
        return this.brandSlogan;
    }

    protected void setBrandName(String brandName){
        this.brandName = brandName;
    }
    protected String getBrandName(){
        return this.brandName;
    }

    protected void setModelName(String modelName){
        this.modelName = modelName;
    }
    protected String getModelName(){
        return this.modelName;
    }

    protected void setColor(String color){
        this.color = color;
    }
    protected String getColor(){
        return this.color;
    }

    protected void setNumberOfWheels(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }
    protected int getNumberOfWheels(){
        return this.numberOfWheels;
    }

    protected void setNumberOfGears(int numberOfGears){
        this.numberOfGears = numberOfGears;
    }
    protected int getNumberOfGears(){
        return this.numberOfGears;
    }

    protected void setTopSpeed(double topSpeed){
        this.topSpeed = topSpeed;
    }
    protected double getTopSpeed(){
        return this.topSpeed;
    }

    public void getVehicleInfo(){
        System.out.println(this.getBrandSlogan());
        System.out.println("Car Information: \n" + " Brand: " + this.getBrandName() + "\n Model: " + this.getModelName()
            + "\n Color: " + this.getColor() + "\n Top speed: " + this.getTopSpeed() + "\n Gear number: " + this.getNumberOfGears()
                + "\n Wheels: " + this.getNumberOfWheels()
        );
    }
}
