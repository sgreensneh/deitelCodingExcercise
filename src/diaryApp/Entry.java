package diaryApp;

public class Entry {

    private  String tittle;
    private String body;
    private int id;

    public Entry(String tittle, String body, int id){
        this.tittle = tittle;
        this.body = body;
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return String.format("""
                ==========
                tittle: %s
                body: %s
                id: %d
                ==========
                """, tittle, body,id);
    }



}
