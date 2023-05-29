package diaryApp;

import java.util.ArrayList;

public class Diary {
    ArrayList<Entry> entries = new ArrayList<>();

    public void createAnEntry(String tittle, String body, int id){
//        int entryNumber = entries.size() +1;
        Entry newEntry = new Entry(tittle, body, id);
        entries.add(newEntry);
    }

    public int countEntry(){
        return entries.size();
    }

    public Entry viewEntry(int entry){
        return entries.get(entry -1);

    }
    public  void deleteEntry(int id){
        entries.remove(id-1);
    }

    public Entry findEntry(int id){
        return entries.get(id-1);
    }
    public void editBody(int id, String body){
        Entry editEntry = findEntry(id);
        editEntry.setBody(body);
    }
    public void editTittle(int id, String tittle){
        Entry editBody = findEntry(id);
        editBody.setBody(tittle);
    }


}
