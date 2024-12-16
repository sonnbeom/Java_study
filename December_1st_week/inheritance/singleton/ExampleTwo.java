package December_1st_week.inheritance.singleton;

public class ExampleTwo {
    private static ExampleTwo instance;

    private ExampleTwo(){

    }

    public synchronized static ExampleTwo getInstance(){
        if (instance == null){
            instance = new ExampleTwo();
        }
        return instance;
    }
}
