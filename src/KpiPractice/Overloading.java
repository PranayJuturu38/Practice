package KpiPractice;

public class Overloading {
    static int add(int a,int b){
        return a+b;
    }
    static double add(int a,int b,int c){
        return a+b+c;
    }
}
class function{
    public static void main(String[] args){
        System.out.println(Overloading.add(1,2,3));
        System.out.println(Overloading.add(1,2));

    }
}
