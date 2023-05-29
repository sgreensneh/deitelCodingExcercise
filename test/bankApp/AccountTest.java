package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AccountTest {
    private Account SgreenAccount;
    @BeforeEach
    public void setUpTest(){
        SgreenAccount = new Account(1,"Green","1234");
    }

    @Test
    public void depositTest(){
        SgreenAccount.deposit(BigDecimal.valueOf(2_000));
        assertEquals(BigDecimal.valueOf(2_000), SgreenAccount.getBalance("1234"));
    }
    @Test
    public void getBalanceWithCorrectPinTest(){
        SgreenAccount.deposit(BigDecimal.valueOf(2_000));
        assertEquals(BigDecimal.valueOf(2_000),SgreenAccount.getBalance("1234"));
    }


    @Test
    public void getBalanceWithWrongPinThrowExceptionTest(){
        SgreenAccount.deposit(BigDecimal.valueOf(2_000));
        assertThrows(IllegalArgumentException.class, ()-> SgreenAccount.getBalance("2214"));

//        BigDecimal firstNumber = BigDecimal.valueOf(1000);
//        BigDecimal secondNumber = BigDecimal.valueOf(10000);
//        var result = firstNumber.compareTo(secondNumber);
//        System.out.println(result);
    }
    @Test
    public void withdrawWithTheRightPinTest(){
        SgreenAccount.deposit(BigDecimal.valueOf(1_200));
        SgreenAccount.withdraw(BigDecimal.valueOf(200),"1234");
        assertEquals(BigDecimal.valueOf(1_000), SgreenAccount.getBalance("1234"));
    }
    @Test
    public void withdrawWithWrongPinThrowsExceptionTest(){
        SgreenAccount.deposit(BigDecimal.valueOf(1_200));
        SgreenAccount.withdraw(BigDecimal.valueOf(200), "1234");
        assertThrows(IllegalArgumentException.class, ()-> SgreenAccount.getBalance("2214"));
    }
    @Test

    public void getInfoToString(){
        System.out.printf("%s", SgreenAccount.toString());
    }


}