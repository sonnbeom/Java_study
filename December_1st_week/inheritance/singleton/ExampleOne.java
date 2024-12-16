package December_1st_week.inheritance.singleton;

public class ExampleOne {
    private static ExampleOne instance;
    // 외부 생성자를 막는다.
    private ExampleOne(){

    }
    public static ExampleOne getInstance(){
        if (instance == null){
            instance = new ExampleOne();
        }
        return instance;
    }
}
