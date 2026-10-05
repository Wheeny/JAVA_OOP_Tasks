package diary;

import java.util.ArrayList;
import java.util.List;

public class Diaries {

    private List<Diary> diaries = new ArrayList<>();
    private int diaryCount = 1;


    public void createDiary(String username, String password){
        Diary diary = new Diary(username, password);
        diaryCount++;
        diaries.add(diary);
    }

    public Diary findDiaryByUsername(String username) {
        for (Diary diary : diaries) {
            if (username != null && username.equals(diary.getUsername())) {
                return diary;
            }
        }
        return null;
    }


    public void deleteDiary(String username, String password){
        for (Diary diary : diaries) {
            if (username != null && username.equals(diary.getUsername())) {
                diaries.remove(diary);
                break;
            }
        }
    }

}




