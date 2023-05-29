package tdd;

import chapterThree.Calculator;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CalculatorTest {
    @Test
    public void calculatorTest(){
        Calculator calculator = new Calculator();
        assertNotNull(calculator);
    }

    @Test
    public void addTest() {
        Calculator calculator = new Calculator();
        int firstNumber = 4;
        int secondNumber = 5;
        int sum = calculator.add(firstNumber,secondNumber);
        assertEquals(9, sum);



    }
}
