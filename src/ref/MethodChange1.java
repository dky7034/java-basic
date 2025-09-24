package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: " + a); // 10
        changePrimitive(a); // 변수 a가 복사되는 것이 아니라 a의 값(10)만 매개변수로 복사된다. 따라서 a의 값은 변경되지 않는다.
        System.out.println("메서드 호출 후: " + a); // 10
    }
    public static void changePrimitive(int x) {
        x = 20;
    }
}
