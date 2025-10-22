package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        // parent2 변수는 Parent 타입이지만, 실제로는 Child 객체를 가리키고 있으므로
        // Child 인스턴스에 해당한다. 따라서 정상적인 다운캐스팅이 가능하며,
        // child 객체의 메서드를 호출할 수 있다.
        Parent parent2 = new Child(); // 업캐스팅
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child) {
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        }
    }
}
