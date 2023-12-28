package basics.packages.vehicles;

public class Car {
    private String model;
    private String color;
    private float topSpeed;
    private int maxGear;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public void setTopSpeed(float topSpeed){
        this.topSpeed = topSpeed;
    }

    public float getTopSpeed(){
        return this.topSpeed;
    }

    public void setMaxGear(int maxGear){
        this.maxGear = maxGear;
    }

    public int getMaxGear(){
        return this.maxGear;
    }
}
