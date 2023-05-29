package diaryApp;

import org.junit.jupiter.api.BeforeEach;

public class EntryTest {
    private Entry entry;
    @BeforeEach
    public  void setUpTest(){
        entry = new Entry("perception is reality:", "Get it done:", 007);

    }



}