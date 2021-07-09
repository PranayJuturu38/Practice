package KpiPractice;

class Super_Class {
    int num = 20;

    public void display() {
        System.out.println("SuperClass");
    }
}
public class Sub_Class extends Super_Class{
    int num =10;
    public void display() {
        System.out.println("SubClass");
    }
    public void method(){
        Sub_Class sub = new Sub_Class();
        sub.display();
        super.display();
        System.out.println("Num in sub class "+sub.num);
        System.out.println("Num in super class "+super.num);
    }
    public static void main(String[] args){
        Sub_Class obj =new Sub_Class();
        obj.method();
    }
}