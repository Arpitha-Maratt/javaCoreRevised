package week2.encapsulation;

public class Printer {
    private boolean isOn;

    public void turnOn(){
        isOn = true;
        System.out.println("Printer is On");
    }

    public void turnOff(){
        isOn = false;
        System.out.println("Printer is off");
    }
}
