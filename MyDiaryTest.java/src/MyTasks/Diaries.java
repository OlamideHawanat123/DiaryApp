package MyTasks;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private final List<Diary> diaries ;

    public Diaries() {
        this.diaries = new ArrayList<>();
    }

    public void addDiary(Diary diary) {
        diaries.add(diary);
    }

    public Diary findDiaryByUsername(String username) {
        for (Diary diary : diaries) {
            if(diary.getUserName().equals(username)) {
                return diary;
            }
        }
        return null;
    }

    public void deleteDiary(Diary diary) {
        for (Diary diary1 : diaries) {
            if(diary1.equals(diary)) {
                diaries.remove(diary);
            }
        }
    }



}
