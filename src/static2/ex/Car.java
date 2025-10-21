package static2.ex;

public class Car {
    // 필드
    private static int totalCars;
    private String name;

    // 생성자
    public Car(String name) {
        System.out.println("차량 구입, 이름: " + name);
        this.name = name;
        totalCars++;
    }

    // 메서드
    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + totalCars);
    }
}
