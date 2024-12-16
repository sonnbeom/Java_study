package December_1st_week.inheritance.상속;

public interface Phone {
    int BATTERY = 100; //변수가 아니라 상수로 선언 생략 가능하다,  final => 변경이 불가능하다 + public이다
    void turnOn();
    void showBattery();
    void addBattery(int battery);
}
