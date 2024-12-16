package December_1st_week.inheritance.상속;

public class PhoneService implements Phone{
    @Override
    public void turnOn() {
        System.out.println("폰 켜짐");
    }

    @Override
    public void showBattery() {
        System.out.println(BATTERY);

    }
    @Override
    public void addBattery(int battery) {
//        BATTERY += battery;
        System.out.println("상수는 못 더해요. "+ battery);
    }
}
