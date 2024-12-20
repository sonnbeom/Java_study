package December_1st_week.inheritance.singleton;

public class ExampleThr {
    private ExampleThr(){

    }
    private static class ExampleHolder{
        private static final ExampleThr INSTANCE = new ExampleThr();
    }
    public static ExampleThr getInstance(){
        return ExampleHolder.INSTANCE;
    } // 클래스로더 -> 동기화 -> 멀티쓰레드, 동기화 리소스 낭비를 방지할 수 있다. BSS -> static -> 메모리 낭비 막을 수 있다!
}
