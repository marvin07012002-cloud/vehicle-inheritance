package inherance;

public class Car extends Vehicle {
    private String carVersion;

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String carVersion) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.carVersion = carVersion;
    }
}
