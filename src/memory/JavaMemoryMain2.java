package memory;

public class JavaMemoryMain2 {
    public static void main(String[] args) { // main 메서드가 가장 먼저 스택 영역에 쌓임
        System.out.println("main start"); // 첫 번째 출력
        method1(); // method1 호출 - 스택 영역에 쌓임
        System.out.println("main end"); // 여섯 번째 출력
    }

    static void method1() {
        System.out.println("method1 start"); // 두 번째 출력
        Data data1 = new Data(10); // 스택 영역에 참조 변수 data1이 생성되고, 힙 영역에 Data 인스턴스가 생성된 후 그 참조값이 data1에 저장됨
        method2(data1); // method2 호출 - 매개변수(참조값)를 포함하여 스택 영역에 쌓임
        System.out.println("method1 end"); // 다섯 번째 출력
    }

    static void method2(Data data) {
        System.out.println("method2 start"); // 세 번째 출력
        System.out.println("data.value = " + data.getValue()); // 스택의 참조 변수 data를 통해 힙에 있는 Data 인스턴스의 값을 읽어옴
        System.out.println("method2 end"); // 네 번째 출력
    }
}
