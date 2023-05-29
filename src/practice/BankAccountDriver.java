package practice;

public class BankAccountDriver {
    public static void main(String[] args) {
        BankAccount zainabsDormAccount = new BankAccount("zainab", 5000, "Dorm");
//        System.out.println(zainabsDormAccount.transferFunds(5000));
//        String result = String.format("%s%s balance is %.2f", zainabsDormAccount.getName(), "'s", zainabsDormAccount.getBalance());
//        System.out.println(result);

        System.out.println("Enter amount to deposit: ");
        GreenScanner next = new GreenScanner(System.in);
        double amountToDeposit = next.nextDouble();

        System.out.println(zainabsDormAccount.deposit(amountToDeposit));
        System.out.println("Current balance = " +zainabsDormAccount.getBalance());


    }
}
