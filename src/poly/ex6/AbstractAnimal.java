package poly.ex6;

public abstract class AbstractAnimal {
    // 추상
    public abstract void sound();

    // 상속
    public void move() {
        System.out.println("동물이 이동합니다.");
    }
}
