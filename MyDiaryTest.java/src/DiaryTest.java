import MyTasks.Diary;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    Diary diary = new Diary("Olamide", "2000");
    @Test
    @DisplayName("Test that diary is always locked before every entry")
    public void diaryIsLockedBeforeEveryEntry() {


        assertTrue(diary.isLocked());
    }

    @Test
    @DisplayName("Test that diary unlocks after providing correct pin")
    public void diaryUnlocksAfterProvidingCorrectPin() {
        assertTrue(diary.isLocked());
        diary.unlockDiary("2000");
        assertFalse(diary.isLocked());
    }

    @Test
    @DisplayName("Test that diary remains locked if wrong pin is provided to unlock it")
    public void diaryRemainsLockedIfWrongPinIsProvided(){
        diary.unlockDiary("2200");
        assertTrue(diary.isLocked());
    }

    @Test
    @DisplayName("Test that diary is empty if there is no entry in it")
    public void diaryIsEmptyIfThereIsNoEntryInIt() {
        assertTrue(diary.isLocked());
        diary.unlockDiary("2000");
        assertFalse(diary.isLocked());
        assertTrue(diary.isEmpty("2000"));
    }

    @Test
    @DisplayName("Test that diary is no longer empty after creating an entry in it")
    public void testDiaryIsNotEmptyAfterCreatingEntryInIt() {
        assertTrue(diary.isEmpty("2000"));
        diary.unlockDiary("2000");
        diary.createEntry("A new Day", "I love my mum so much that i don't think i can do without her. I'm currently doing things that only makes her happy");
        assertFalse(diary.isEmpty("2000"));

    }

    @Test
    @DisplayName("Test that lock diary locks diary upon request")
    public void lockDiaryUponRequest() {
        assertTrue(diary.isLocked());
        diary.unlockDiary("2000");
        assertFalse(diary.isLocked());
        diary.lock();
        assertTrue(diary.isLocked());
    }

    @Test
    @DisplayName("Test that diary deletes a specified entry")
    public void deleteEntryDeletesTheEntryAtASpecifiedId(){
        diary.unlockDiary("2000");
        diary.createEntry("Another day", "I went to the market for shopping");
        diary.deleteEntry(1);
        assertTrue(diary.isEmpty("2000"));
    }

    @Test
    @DisplayName("Test that diary finds entry by id")
    public void findEntryById(){
        diary.unlockDiary("2000");
        diary.createEntry("Another day", "I went to the market for shopping");
        String expected = "ID: 1\nTitle: Another day\nContent: I went to the market for shopping";
        assertEquals(expected, diary.viewEntry(1));
    }

    @Test
    @DisplayName("Test that update entry updates the content of the entry of a specified id")
            public  void testThatUpdateEntryUpdatesTheContentOfTheEntryOfASpecifiedId(){
        diary.unlockDiary("2000");
        diary.createEntry("Another day", "I went to the market for shopping");
        diary.updateEntry(1, "Another day at the market", "I went to the market in the morning and i went to church in the evening");
        String expected = "ID: 1\nTitle: Another day at the market\nContent: I went to the market in the morning and i went to church in the evening";
        assertEquals(expected, diary.viewEntry(1));
    }

    @Test
    @DisplayName("Test that diary finds entry by id")
    public void findEntryByIdAgain(){
        diary.unlockDiary("2000");
        diary.createEntry("Another day", "I went to the market for shopping");
        assertEquals(diary.findEntryById(1), diary. findEntryById(1));
    }


    }




