package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a);
        // 메서드를 호출할 때 매개변수 x에 변수 a의 값을 전달한다. 복사해서!!
        changePrimitive(a);
        System.out.println("메서드 호출 후: a = " + a);
    }

    public static void changePrimitive(int x) {
        x = 20;
    }
}
