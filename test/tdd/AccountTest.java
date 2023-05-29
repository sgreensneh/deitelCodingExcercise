package tdd;

import chapterTwo.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {


    @Test
    public void depositTest() {

        // given there is an account
        Account greenAccount = new Account();


        // when i deposit
        greenAccount.deposit(5000);


        // check that balance is 5000
        int greenAccountBalance = greenAccount.getBalance();

        assertEquals(5000, greenAccountBalance);

    }

    @Test

    public void depositTwiceTest() {
        // given there is an account
        Account greenAccount = new Account();

        // given that an initial balance is 4000
        greenAccount.deposit(4000);

        // when i deposit 2000
        greenAccount.deposit(2000);

        // check that balance is 6000
        int greenBalance = greenAccount.getBalance();
        assertEquals(6000, greenBalance);
    }

    @Test

    public void depositNegativeAmountTest() {

        // given there is an account
        Account greenAccount = new Account();

        // given that an initial balance is 4000
        greenAccount.deposit(4000);

        // when i deposit 2000
        greenAccount.deposit(-2000);

        // check that account balance is 4000
        int greenBalance = greenAccount.getBalance();
        assertEquals(4000, greenBalance);


    }

    @Test

    public void withdrawalAccount() {
        // given there is an account
        Account greenAccount = new Account();

        // given there is an initial deposit 10000
        greenAccount.deposit(10000);

        greenAccount.withdrawal(7000);
        int getBalance = greenAccount.getBalance();
        assertEquals(3000, getBalance);


    }

    @Test

    public void withdrawalNegativeAccount() {

        Account sunnyAccount = new Account();

        sunnyAccount.deposit(20000);

        sunnyAccount.withdrawal(10000);
        sunnyAccount.withdrawal(-10000);

        int getBalance = sunnyAccount.getBalance();
        assertEquals(10000, getBalance);

    }

    @Test

    public void withdrawalExcessAccount() {
        Account sunnyAccount = new Account();
        sunnyAccount.deposit(20000);
        sunnyAccount.withdrawal(30000);
        int getBalance = sunnyAccount.getBalance();
        assertEquals(20000, getBalance);






    }


}

















