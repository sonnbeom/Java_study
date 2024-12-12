package December_1st_week.inheritance;

public class Child extends Parent{
    int age;

    public Child(String name, int age) {
        this.age = age;
        super(name);
        this.age = age;
    }
    void sayHo(){
        System.out.println("잔소리 스탑");
    }
    @Override
    void say() {
        super.say();
    }
}
