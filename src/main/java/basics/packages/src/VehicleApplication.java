package basics.packages.src;
import basics.packages.vehicles.Car;

public class VehicleApplication {
    public static void main(String[] args) {
        String model = "Tesla XYZ";
        Car car = new Car();
        car.setModel(model);
        System.out.println(car.getModel());
    }
}
