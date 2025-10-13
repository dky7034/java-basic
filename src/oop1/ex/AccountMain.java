package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        // 계좌에 10000원 입금
        account.deposit(10000);
        // 계좌에서 9000원 출금
        account.withdraw(9000);
        // 계좌에서 2000원 출금 시도 -> 잔액 부족 출력 확인
        account.withdraw(2000);
        // 잔고 출력
        System.out.println("잔고: " + account.balance);
    }
}
