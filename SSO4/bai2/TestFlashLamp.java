package bai2;

public class TestFlashLamp {


    public static void main(String args[]) {
        Battery battery = new Battery();
        FlashLamp fl = new FlashLamp();
        fl.setBattery(battery);
        for(int i =1 ; i<= 10 ;i++){
            fl.turnOn();
            fl.turnOff();
        }
        System.out.println("Năng lương còn lại trong pin : " + fl.getBatteryInfo());
    }
   
}
