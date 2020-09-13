package review;

public class Main {
    public static void main(String[] args) {
        Account account =new Account();
        account.print();
        account.addposit(100);
        account.withdraw(50);
        account.addposit(30);
        account.withdraw(200);
        account.print();
    }
}
