abstract class Vehicle {

    public String make;
    public String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public abstract void startEngine();
    public abstract void stopEngine();

    public void displayInfo() {
        System.out.println("Make: " + make + ", Model: " + model);
    }

}
