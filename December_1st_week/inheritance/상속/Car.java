package December_1st_week.inheritance.상속;

public class Car {
    Engine engine;

    Car(Engine engine){
        this.engine = engine;
    }
    void drive(){
        System.out.println(engine.type + "엔진으로 드라이브");
    }
}
