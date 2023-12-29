package basics.packages.src;
import basics.packages.vehicles.Car;

public class VehicleApplication {
    public static void main(String[] args) {
        String model = "Tesla XYZ";
        String color = "Purple";
        int maxGear = 6;
        float topSpeed = 167.89F;

        Car car = new Car();
        car.setModel(model);
        System.out.println("Model: " + car.getModel());

        car.setColor(color);
        System.out.println("Color: " + car.getColor());

        car.setMaxGear(maxGear);
        System.out.println("Maximum gear: " + car.getMaxGear());

        car.setTopSpeed(topSpeed);
        System.out.println("Top speed: " + car.getTopSpeed() + "km/hr");
    }
}
