public class Car {
    private String make;
    private String model;
    private int year;
    private double speed;

    public Car(String make, String model, int year, double speed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed){
        if (speed > 0){
            this.speed = speed;
        }
        else {
            this.speed = 0;
        }
    }
    public static double convertKmToMiles(double km){
        return km  * 0.621371;
    }
    public void accelerate(double amount){
        setSpeed(amount + this.speed);
    }
    public void brake(double amount){
        setSpeed(this.speed - amount);
    }
}
