package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    private  Bank gtBank;
    @BeforeEach
    public void setUpTest(){
        gtBank = new Bank();
        gtBank.createAccountFor("Sunny","Green","007");
    }

    @Test
    public void accountCanBeCreatedTest(){
        gtBank = new Bank();
        gtBank.createAccountFor("Sunny","Green","007");
        assertEquals(1,gtBank.getNumberOfCustomers());
    }

    @Test
    public void accountCanBeFoundAfterCreation(){
        String expected = """
                ====================
                Account Name: Green Sunny
                Account Number: 1
                Account Balance: 0
                ====================
                """;
        assertEquals(expected,gtBank.findAccount(1).toString());
//        System.out.println(gtBank.findAccount(1).toString());
    }

    @Test
    public void balanceCanBeCheckedTest(){
        assertEquals("0",gtBank.checkBalanceFor(1,"007").toPlainString());
    }

    @Test
    public void depositIntoAccountTest(){
        gtBank.depositInto(BigDecimal.valueOf(200),1);
        assertEquals(BigDecimal.valueOf(200), gtBank.checkBalanceFor(1,"007"));
//        System.out.println(gtBank.checkBalanceFor(1,"007").toString());
    }
    @Test
    public void withdrawFromAccount(){
        gtBank.depositInto(BigDecimal.valueOf(5000),1);
        gtBank.withdrawFrom(1,BigDecimal.valueOf(4_000),"007");
        assertEquals(BigDecimal.valueOf(1_000), gtBank.checkBalanceFor(1,"007"));
    }

    @Test
    public void transferMoneyTest(){
        gtBank.createAccountFor("Saint","Paul","1234");
        gtBank.depositInto(BigDecimal.valueOf(10_000),2);
        gtBank.transfer(BigDecimal.valueOf(8_000),2,1,"1234");

        assertEquals(BigDecimal.valueOf(2000),gtBank.checkBalanceFor(2,"1234"));
    }

}