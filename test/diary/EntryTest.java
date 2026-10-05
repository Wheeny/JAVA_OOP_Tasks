package diary;

import bankingProgram.BankingProgram;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EntryTest {

    private Entry entry;
    @BeforeEach
    public void setUp(){
        entry = new Entry(100, "Mood Diary", "Work Chronicles");
    }


    @Test
    public void testToGetId(){
        assertEquals(entry.getId(), 100);
    }

    @Test
    public void testToGetTitle(){
        assertEquals(entry.getTitle(), "Mood Diary");
    }

    @Test
    public void testToGetBody(){
        assertEquals(entry.getBody(), "Work Chronicles");
    }

    @Test
    public void testToSetId(){
        entry.setId(101);
        assertEquals(entry.getId(), 101);
    }

    @Test
    public void testToSetTitle(){
        entry.setTitle("Fitness Diary");
        assertEquals(entry.getTitle(), "Fitness Diary");
    }

    @Test
    public void testToSetBody(){
        entry.setBody("Gym Chronicles");
        assertEquals(entry.getBody(), "Gym Chronicles");
    }
}