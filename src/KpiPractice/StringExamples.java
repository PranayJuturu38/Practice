package KpiPractice;

public class StringExamples {
    public void Stringlength(String str){

        int len = str.length();
        System.out.println("String Length :"+len);
    }
    public static void StringCon(){
        String str1 = "KPI";
        System.out.println("Hello"+str1);

    }
    public static void main(String[] args){
        char[] helloArray = {'h','e','l','l','o'};
        String helloString = new String(helloArray);
        StringExamples string1 = new StringExamples();
        string1.Stringlength("Hello world!");
        StringCon();
        System.out.println(helloString);
    }
}
