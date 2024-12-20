package December_1st_week.inheritance.제네릭;

import December_1st_week.inheritance.상속.Car;

import java.util.ArrayList;

public class Market {
    public static void main(String[] args) {
        FruitBox<String> strBox = new FruitBox<>();
        FruitBox<Integer> integerFruitBox = new FruitBox<>();
        FruitBox<Car> carFruitBox = new FruitBox<>();


        // 멀티 매개변수
        MultiFruitBox<String, Integer> multiFruitBox = new MultiFruitBox<>();
        multiFruitBox.add("애플", 2);

    }
}
