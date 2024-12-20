package December_1st_week.inheritance.제네릭;

import java.util.ArrayList;
import java.util.List;

public class MultiFruitBox <T, U>{
    List<T> apples = new ArrayList<>();
    List<U> bananas = new ArrayList<>();

    void add(T apple, U banana){
        apples.add(apple);
        bananas.add(banana);
    }

}
