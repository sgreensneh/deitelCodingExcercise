import chapterThree.Driller;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class DrillerTest {

    @Test
    public void fourCopiesTest() {
        Driller driller = new Driller();
        int fourCopies = driller.amount(2000,4);
        assertEquals(8000,fourCopies);


    }
@Test
    public void nineCopiesTest(){
        Driller driller = new Driller();
        int nineCopies = driller.amount(1800,9);
        assertEquals(16200,nineCopies);



}

@Test
    public void twentyCopies(){

        Driller driller = new Driller();
        int twentyCopies = driller.amount(1600,20);
        assertEquals(32000,twentyCopies);
}
@Test
    public void thirtyCopies(){

        Driller driller = new Driller();
        int thirtyCopies = driller.amount(1500,30);
        assertEquals(45000,thirtyCopies);
}




}




