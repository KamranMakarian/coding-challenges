public class Refrigerator implements Appliance{

    @Override
    public void turnOn(){
        System.out.println("Refrigerator is now ON.");
    }

    @Override
    public void turnOff(){
        System.out.println("Refrigerator is now OFF.");
    }
}
