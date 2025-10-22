package poly.ex3;

public abstract class AbstractAnimal {
    // 자식에서 반드시 오버라이딩해야 하는 메서드
    public abstract void sound();

    // 자식에게 상속하기 위한 메서드
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
