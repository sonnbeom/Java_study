package December_1st_week.inheritance.상속;

interface Keyboard { }

class Logitec_Keyboard implements Keyboard { }

class Samsung_Keyboard implements Keyboard { }

class Apple_Keyboard implements Keyboard { }

public class Main {
    public static void main(String[] args) {
        // 인터페이스 타입 배열로 여러가지 클래스들을 한번에 타입 묶음을 할 수 있다.
        Keyboard[] keyboards = {
                new Logitec_Keyboard(),
                new Samsung_Keyboard(),
                new Apple_Keyboard(),
        };
        System.out.println("첫번째 인스턴스 "+ keyboards[0]);
        System.out.println("두번째 인스턴스 " + keyboards[1]);
    }
}


