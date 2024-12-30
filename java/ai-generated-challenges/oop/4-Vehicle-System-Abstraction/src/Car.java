public class Car extends Vehicle implements FuelEfficient{

    private double distanceTraveled;
    private double fuelConsumed;

    public Car(String make, String model, double distanceTraveled, double fuelConsumed){
        super(make,model);
        this.distanceTraveled = distanceTraveled;
        this.fuelConsumed = fuelConsumed;
    }

    @Override
    public void startEngine(){
        System.out.println("Car engine started.");
    }

    @Override
    public void stopEngine(){
        System.out.println("Car engine stopped.");
    }

    @Override
    public double calculateFuelEfficiency(){
        return distanceTraveled / fuelConsumed;
    }
}
