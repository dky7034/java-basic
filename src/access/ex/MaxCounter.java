package access.ex;

public class MaxCounter {
    // 필드
    private int count = 0;
    private int max;

    // 생성자
    public MaxCounter() {
    }

    public MaxCounter(int max) {
        this.max = max;
    }

    // 메서드
    public void increment() {
        if (max <= count) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        count++;
    }

    public int getCount() {
        return count;
    }
}
