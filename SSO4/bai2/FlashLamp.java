package bai2;

public class FlashLamp {
    private boolean status;
    private Battery battery;

    public FlashLamp() {
        status = false;
        //battery = null;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public int getBatteryInfo() {
        return battery.getEnergy();
    }

    public void linght() {
        if (status == true && battery != null && battery.getEnergy() > 0) {
            battery.dereaseEnerfy();
        }

    }

    public void turnOn() {

        if (battery != null && battery.getEnergy() > 0) {
            status = true;
            System.out.println("đèn sáng");
            // battery.dereaseEnerfy();
        }
        linght();

    }

    public void turnOff() {
        status = false;
        System.out.println("Đèn tắt");
    }

}
