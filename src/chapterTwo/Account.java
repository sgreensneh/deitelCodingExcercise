package chapterTwo;

public class Account {

    private int withdrawal;
    private int balance;
    public void deposit(int amount) {
        if (amount > 0) {
           balance = balance + amount;
        }


    }

    public void withdrawal(int amount) {

        if (amount > 0 && amount <= balance){
            balance = balance - amount;
        }
    }

    public int getBalance(){
       return balance;
    }










}
