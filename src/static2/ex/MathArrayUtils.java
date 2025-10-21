package static2.ex;

public class MathArrayUtils {
    // 필드

    // 생성자
    private MathArrayUtils() {
        // private - 인스턴스 생성을 막음
    }

    // 메서드
    public static int sum(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    public static double average(int[] values) {
        double avg = (double) sum(values) / values.length;
        return avg;
    }

    public static int min(int[] values) {
        int min = values[0];
        for (int value : values) {
            if (min > value) {
                min = value;
            }
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];
        for (int value : values) {
            if (max < value) {
                max = value;
            }
        }
        return max;
    }
}
