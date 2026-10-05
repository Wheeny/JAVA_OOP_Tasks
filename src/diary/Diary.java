package diary;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String username;
    private String password;
    private boolean isLocked;
    private List<Entry> entries = new ArrayList<>();
    private boolean state;
    private int entryId = 1;


    public Diary(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void unlockDiary(String password){
        if (this.password == password){
            state = true;
        }
    }

    public void lockDiary(){
        state = false;
    }

    public boolean isLocked(){
        return state;
    }

    public void createEntry(String title, String body){
        Entry entry = new Entry(entryId, title, body);
        entryId++;
        entries.add(entry);
    }

    public void deleteEntry(int id){
        for (Entry entry : entries) {
            if (entry.getId() == id) {
                entries.remove(entry);
                break;
            }
        }
    }

    public Entry findEntryById(int id) {
        for (Entry entry : entries) {
            if (entry.getId() == id) {
                return entry;
            }
        }
        return null;
    }

    public void updateEntry(int id, String title, String body){
        Entry entryFound = findEntryById(id);
        entryFound.setTitle(title);
        entryFound.setBody(body);
    }
}
