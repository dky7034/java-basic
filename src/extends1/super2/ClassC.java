package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        super(10, 20); // 부모의 생성자가 기본 생성자가 아니므로 직접 작성해야 함
        System.out.println("ClassC 생성자");
    }
}
