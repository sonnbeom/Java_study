package December_1st_week.inheritance.singleton;

public class App {
    public static void main(String[] args) {
        ExampleOne exampleOne1 = ExampleOne.getInstance();
        ExampleOne exampleOne2 = ExampleOne.getInstance();
        System.out.println(exampleOne1);
        System.out.println(exampleOne2);
        // 위 패턴을 따르지 않으면 false가 출력된다. heap에 다른 메모리를 참조하므로
        System.out.println(exampleOne1 == exampleOne2);
        ExampleFour exampleFour = ExampleFour.INSTANCE;

    }
}
