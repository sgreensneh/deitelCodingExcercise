package practice;

public class BankAccount {
    private  String name;
    private double balance;
    private String accountType;

    // no args constructors
    public BankAccount() {}

    // required-args constructor
    public BankAccount(String name) {
        this.name = name;

    }

    public BankAccount (String name, double balance, String accountType){
        this.name = name;
        this.balance = balance;
        this.accountType = accountType;
    }

    public void setName (String name) {
        this.name = name;
    }
    public String getName () {
        return name;
    }
    public double getBalance() {
        return balance;
    }

    public String transferFunds(double amount) {
        balance=balance-amount;
        return "Transfer successful";
    }
    public String deposit (double amount) {
        balance = balance+amount;
        return "Deposit successful \n Thnak you for banking with us. ";
    }
}
