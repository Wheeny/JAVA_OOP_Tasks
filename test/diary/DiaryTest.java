package diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {

    private Diary diary;
    @BeforeEach
    public void setUp(){
        diary = new Diary("Winnie", "1234");
    }



    @Test
    public void testThatDiaryIsUnlockedWithTheWrongPassword(){
        diary.unlockDiary("124");
        assertFalse(diary.isLocked());
    }

    @Test
    public void testToUnlockDiary(){
        diary.unlockDiary("1234");
        assertTrue(diary.isLocked());
    }

    @Test
    public void testThatTheDiaryIsLocked(){
        diary.unlockDiary("1234");
        diary.lockDiary();
        assertFalse(diary.isLocked());
    }

    @Test
    public void testToCreateEntry(){
        diary.createEntry("New Diary", "A Day In My Life");
        Entry entry = diary.findEntryById(1);
        assertEquals(entry.getTitle(), "New Diary");

    }

    @Test
    public void testToCreateTwoEntries_AndGetTheSecondOne_UsingItsId_ToEnsureItsAnIncrement_OnTheIdOfThe_LastCreatedEntry(){
        diary.createEntry("New Diary", "A Day In My Life");
        diary.createEntry("Another Diary", "Just Words");
        Entry entry = diary.findEntryById(2);
        assertEquals(entry.getTitle(), "Another Diary");

    }

    @Test
    public void testToCreateMultipleEntriesAndGetOneUsingTheWrongId(){
        diary.createEntry("New Diary", "A Day In My Life");
        diary.createEntry("Another Diary", "Just Words");
        diary.createEntry("Yet Another Diary", "More Words");
        Entry entry = diary.findEntryById(5);
        assertNull(entry);

    }

    @Test
    public void testToCreateMultipleEntriesAndGetOneUsingTheIdAndDeleteIt(){
        diary.createEntry("New Diary", "A Day In My Life");
        diary.createEntry("Another Diary", "Just Words");
        diary.createEntry("Yet Another Diary", "More Words");
        Entry entry = diary.findEntryById(3);
        assertEquals(entry.getTitle(), "Yet Another Diary");
        diary.deleteEntry(3);
        Entry foundEntry = diary.findEntryById(3);
        assertNull(foundEntry);

    }


    @Test
    public void testToCreateMultipleEntriesAndGetOneUsingTheIdAndUpdateIt(){
        diary.createEntry("New Diary", "A Day In My Life");
        diary.createEntry("Another Diary", "Just Words");
        diary.createEntry("Yet Another Diary", "More Words");
        Entry entry = diary.findEntryById(3);
        assertEquals(entry.getTitle(), "Yet Another Diary");
        diary.updateEntry(3, "New Title", "New Body");
        Entry foundEntry = diary.findEntryById(3);
        assertEquals(entry.getTitle(), "New Title");
        assertEquals(entry.getBody(), "New Body");


    }


}
