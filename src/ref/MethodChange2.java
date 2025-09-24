package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: data.value = " + dataA.value); // 10
        changeReference(dataA);
        System.out.println("메서드 호출 후: data.value = " + dataA.value); // 20 → 참조값이 매개변수로 전달되며, 메서드 내에서 해당 객체의 멤버의 값을 변경했으므로 호출 후의 값은 다름
    }
    public static void changeReference(Data dataX) {
        dataX.value = 20;
    }
}
