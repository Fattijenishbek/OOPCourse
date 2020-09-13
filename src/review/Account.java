package review;

public class Account {
    // class fields
    private int balance;
    private int id;
    private boolean isLoked = true;


    public void addposit(int amount){
        balance+= (amount>=0)? amount:0;
    }

    public void withdraw(int amount){
        if (balance-amount<0){
            System.out.println("Not enough");
        }
        else {
        balance-= (amount>=0)? amount:0;}
    }

    public void print(){
        System.out.println("Your balance is:"+ balance);
    }

}
