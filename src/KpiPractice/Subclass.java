package KpiPractice;
class Superclass{
    int age;
    Superclass(int age){
        this.age=age;
    }
    public void getAge(){
        System.out.println("Age in superClass"+age);
    }
}
public class Subclass extends Superclass{
    Subclass(int age) {
        super(age);
    }
public static void main(String[] args){
        Subclass obj = new Subclass(25);
        obj.getAge();
}

}
