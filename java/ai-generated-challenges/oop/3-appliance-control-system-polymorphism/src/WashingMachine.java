public class WashingMachine implements Appliance{

    @Override
    public void turnOn(){
        System.out.println("Washing Machine is now ON.");
    }

    @Override
    public void turnOff(){
        System.out.println("Washing Machine is now OFF.");
    }

}
