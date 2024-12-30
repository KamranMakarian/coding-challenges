public class Microwave implements Appliance{

    @Override
    public void turnOn(){
        System.out.println("Microwave is now ON.");
    }

    @Override
    public void turnOff(){
        System.out.println("Microwave is now OFF.");
    }
}
