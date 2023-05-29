package bankApp;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Bank {
    ArrayList <Account> accounts = new ArrayList<>();
    public void createAccountFor(String firstName, String lastName, String pin) {
        int accountNumber = accounts.size() + 1;
        Account newAccount = new Account(accountNumber, lastName +" "+firstName, pin);
         accounts.add(newAccount);
    }

    public int getNumberOfCustomers() {
        return accounts.size();
    }

    public Account findAccount(int accountNumber) {
        return accounts.get(accountNumber -1);
    }

    public BigDecimal checkBalanceFor(int accountNumber, String pin) {
        Account account = findAccount(accountNumber);
        return account.getBalance(pin);
        //or return findAccount(accountNumber).getBalance(pin);
    }

    public void depositInto(BigDecimal amount, int accountNumber) {
        Account account = findAccount(accountNumber);
        account.deposit(amount);
//    or    findAccount(accountNumber).deposit(amount)
    }

    public void withdrawFrom(int accountNumber, BigDecimal amount, String pin) {
        findAccount(accountNumber).withdraw(amount, pin);
//        findAccount(accountNumber).deposit(amount);
    }

    public void transfer(BigDecimal amount, int senderAccountNumber, int receiverAccountNumber, String senderPin) {
        Account senderAccount = findAccount(senderAccountNumber);
        Account receiverAccount = findAccount(receiverAccountNumber);
        senderAccount.withdraw(amount, senderPin);
        receiverAccount.deposit(amount);
    }

    public void deleteAccountFor(String firstName, String lastName, int accountNumber) {
        Account account = findAccount(accountNumber);
        Account formatAccount = new Account(0, null, null);

        accounts.add(accountNumber, formatAccount);
        accounts.remove(account);
    }

    public String checkAccountInfo(int accountNumber) {
        Account checkAccount = findAccount(accountNumber);
        Account formatAccount = new Account(0, null, null);
        if(!checkAccount.equals(formatAccount)) return "Account does not exist";
        else
            return findAccount(accountNumber).toString();
    }

    }

