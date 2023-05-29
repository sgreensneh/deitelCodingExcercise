package practice;

public class ZenithBank {
    private String name;
    private double balance;


    public ZenithBank(String name,  double balance) {
        this.name = name;
        this.balance = balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(String name){
        return name;
    }

    public double getBalance() {
        return balance;
    }
    public String deposit (double amount){
        balance = balance + amount;
        return "Deposit successful";
    }
    public String transfer (ZenithBank recipient, double amountToTransfer){
        withdrawal(amountToTransfer);
        recipient.deposit(amountToTransfer);
        return "Transfer successful";
    }
    public String withdrawal(double amount) {
        balance = balance - amount;
        return "withdrawal successful";
    }
}
