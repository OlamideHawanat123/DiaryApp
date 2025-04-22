package MyTasks;

import java.util.ArrayList;
import java.util.List;

public class Diary {

    private String userName;
    private boolean isLocked = true;
    private String password;
    private List<Entry> diaryEntry;


    public Diary(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.diaryEntry = new ArrayList<>();
    }

    public void setDiaryEntry(List<Entry> diaryEntry) {
        this.diaryEntry = diaryEntry;
    }

    public List<Entry> getDiaryEntry() {
        return diaryEntry;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void unlockDiary(String password) {
        if (this.password.equals(password)) {
            isLocked = false;
        }
    }

    public boolean isEmpty(String Password) {
        if(!this.password.equals(Password)) {
            throw new IllegalArgumentException("Wrong password, are you sure this diary is yours?");
        }
        return diaryEntry.isEmpty();

}

    public void createEntry(String title, String content) {
        int newId = diaryEntry.size() + 1;
        diaryEntry.add(new Entry(newId, title, content));

    }

    public void lock() {
        isLocked = true;
    }

    public void deleteEntry(int id) {
        Entry entryToBeDeleted = null;

        for(Entry entry : diaryEntry) {
            if(entry.getId() == id) {
                entryToBeDeleted = entry;
                break;
            }
        }
        if(entryToBeDeleted != null) {
            diaryEntry.remove(entryToBeDeleted);
        }
        else{
            System.out.println("Entry not found");
        }
    }

    public Object findEntryById(int id) {
        for(Entry entry : diaryEntry) {
            if(entry.getId() == id) {
                return entry;
            }
        }
        return null;
    }

    public String viewEntry(int id) {
        if(!diaryEntry.isEmpty()) {
            for(Entry entry : diaryEntry) {
                return "ID: " +entry.getId()+ "\nTitle: " +entry.getTitle()+ "\nContent: " +entry.getContent();
            }

        }
        return null;
    }

    public void updateEntry(int id, String title, String content) {
        if(!diaryEntry.isEmpty()) {
            for(Entry entry : diaryEntry) {
                if(entry.getId() == id) {
                    entry.setTitle(title);
                    entry.setContent(content);
                }
            }
        }
    }

    public String getUserName() {
        return userName;
    }
}

