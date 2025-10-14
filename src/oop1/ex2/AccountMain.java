package oop1.ex2;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        account.withdraw(8000);
        account.withdraw(3000);
        System.out.println("잔고: " + account.balance);
    }
}
