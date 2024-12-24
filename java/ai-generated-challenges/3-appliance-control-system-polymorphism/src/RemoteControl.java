public class RemoteControl {

    public void operateAppliance(Appliance appliance, boolean turnOn){
        if (turnOn){
            appliance.turnOn();
        }
        else {
            appliance.turnOff();
        }
    }
}
