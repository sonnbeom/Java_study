package December_1st_week.inheritance.제네릭;


import java.util.ArrayList;
import java.util.List;

public class FruitBox<T> {
    List<T> fruits = new ArrayList<>();

    public void add(T fruit){
        fruits.add(fruit);
    }
}
