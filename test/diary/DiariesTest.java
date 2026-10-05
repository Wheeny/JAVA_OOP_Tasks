package diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DiariesTest {

    private Diaries diaries;
    @BeforeEach
    public void setUp(){
        diaries = new Diaries();
    }

    @Test
    public void testToCreateDiary(){
        diaries.createDiary("New Diary", "1234");
        Diary diary = diaries.findDiaryByUsername("New Diary");
        assertEquals(diary.getUsername(), "New Diary");

    }

    @Test
    public void testToCreateTwoDiaries_AndGetTheSecondOne_UsingItsUsername_ToEnsureItsAnIncrement_OnTheCountOfThe_LastCreatedDiary(){
        diaries.createDiary("New Diary", "1234");
        diaries.createDiary("Another Diary", "5678");
        Diary diary = diaries.findDiaryByUsername("Another Diary");
        assertEquals(diary.getUsername(), "Another Diary");

    }

    @Test
    public void testToCreateMultipleEntriesAndGetOneUsingTheWrongId(){
        diaries.createDiary("New Diary", "A Day In My Life");
        diaries.createDiary("Another Diary", "Just Words");
        diaries.createDiary("Yet Another Diary", "More Words");
        Diary diary = diaries.findDiaryByUsername("Non Existent Diary");
        assertNull(diary);

    }

    @Test
    public void testToCreateMultipleDiariesAndGetOneUsingTheUsernameAndDeleteIt(){
        diaries.createDiary("New Diary", "1234");
        diaries.createDiary("Another Diary", "5678");
        diaries.createDiary("Yet Another Diary", "9101");
        Diary diary = diaries.findDiaryByUsername("Yet Another Diary");
        assertEquals(diary.getUsername(), "Yet Another Diary");
        diaries.deleteDiary("Yet Another Diary", "9101");
        Diary foundDiary = diaries.findDiaryByUsername("Yet Another Diary");
        assertNull(foundDiary);

    }


}
