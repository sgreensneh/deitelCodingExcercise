package bankApp;

import java.math.BigDecimal;

public class Account {
    private final int accountNumber;

    private final String accountName;

    private BigDecimal balance = BigDecimal.ZERO;
    private String pin;

    public  Account(int accountNumber, String accountName, String accountPin){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        pin = accountPin;
    }

    public  void deposit(BigDecimal amount){
        balance = balance.add(amount);
    }

    public  void validatePin(String pin){
        if (!pin.equals((this.pin))) throw  new IllegalArgumentException("invalide pin");

    }

    public  void withdraw(BigDecimal amount, String pin){
        validatePin(pin);
        if(amount.compareTo(balance) < 0)
        balance = balance.subtract(amount);
    }

    public BigDecimal getBalance(String pin){
        validatePin(pin);
//        if (!pin.equals(this.pin)) throw new IllegalArgumentException("invalid pin");
        return balance;
    }

    @Override
    public  String toString(){
        return String.format("""
                ====================
                Account Name: %s
                Account Number: %s
                Account Balance: %s
                ====================
                """, accountName, accountNumber, balance.toPlainString());
    }
}
