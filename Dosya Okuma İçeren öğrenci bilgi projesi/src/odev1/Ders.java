package odev1;

public class Ders {
    private String name;
    private String semester;
    private String note;

    Ders(String name, String semester,String note) {
        this.name = name;
        this.semester = semester;
        this.note = note;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setSemester(String semester){
        this.semester = semester;
    }
    public String getSemester(){
        return this.semester;
    }
    public void setNote(String note){
        this.note = note;
    }
    public String getNote(){
        return this.note;
    }
}
