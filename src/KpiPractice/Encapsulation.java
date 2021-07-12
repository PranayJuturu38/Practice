package KpiPractice;

public class Encapsulation {
    private String Name;
    private String id;
    private int age;
    public int getAge(){
        return age;
    }

    public String getName(){
        return Name;
    }
    public String getId(){
        return id;
 }

    public void setAge(int newage) {
        age = newage;
    }

    public void setId(String newid) {
        id = newid;
    }

    public void setName(String newName) {
        Name = newName;
    }

}
