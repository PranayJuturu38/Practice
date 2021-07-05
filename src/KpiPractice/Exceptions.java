package KpiPractice;

public class Exceptions {
    public static void main(String[] args){
        try{
            int num = 100/0;
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
    }
}
