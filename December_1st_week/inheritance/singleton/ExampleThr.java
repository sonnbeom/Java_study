package December_1st_week.inheritance.singleton;

public class ExampleThr {
    private ExampleThr(){

    }
    private static class ExampleHolder{
        private static final ExampleThr INSTANCE = new ExampleThr();
    }
    public static ExampleThr getInstance(){
        return ExampleHolder.INSTANCE;
    }
}
