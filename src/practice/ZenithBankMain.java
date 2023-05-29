package practice;

import java.util.Scanner;

public class ZenithBankMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ZenithBank greenAccount = new ZenithBank("greenAccount", 10000);
        ZenithBank sunnyAccount = new ZenithBank("sunnyAccount", 5000);

        System.out.println("Enter amount for transaction: ");
        double deposit = input.nextDouble();

        System.out.println(sunnyAccount.deposit(deposit));
        sunnyAccount.transfer(greenAccount, 2000);
        System.out.println("green balance==> "+greenAccount.getBalance());
        System.out.println("sunny balance==> "+sunnyAccount.getBalance());



    }
}
