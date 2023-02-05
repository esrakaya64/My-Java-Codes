
package odev1;

public class Ogrenci {
    private String name;
    private String surname;
    private String stdNo;
    private Ders lesson [];

    Ogrenci(String name, String surname, String stdNo, Ders[] lesson) {
        this.name = name;
        this.surname = surname;
        this.stdNo = stdNo;
        this.lesson = lesson;
    }
    public void avarage(int sum, int lessonNum){
        double avarage = sum/lessonNum;
        System.out.println("Avarage is " + avarage);
    }
    public void listLessons(){
        for(int i = 0; i<6; i++){
            System.out.println(lesson[i].getName());
        }   
    }    
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setSurname(String Surname){
        this.surname = surname;
    }
    public String getSurname(){
        return this.surname;
    }
    public void setStdNo(String StdNo){
        this.stdNo = stdNo;
    }
    public String getStdNo(){
        return this.stdNo;
    }
    /*public void setLesson(Ders lesson){
        this.lesson = new Ders[6];
    }
    public Ders[] getLesson(){
        return this.lesson;
    }*/
    
}
