package access;

public class BankAccount {
    // 필드
    private int balance;

    // 생성자
    public BankAccount() {
        balance = 0;
    }

    // 메서드
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야 함
        return amount > 0;
    }

    // getter
    public int getBalance() {
        return balance;
    }
}
