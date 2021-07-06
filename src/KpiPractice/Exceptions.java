package KpiPractice;

public class Exceptions {
    public static void main(String[] args) {
        try {

            try {
                System.out.println("Divide by zero");
                int num = 100 / 0;
            } catch (Exception e) {
                System.out.println(e);
            }
         try{
             int a[]= new int[5];
           a[5]=4;
         }
         catch(ArrayIndexOutOfBoundsException e){
             System.out.println(e);
         }
        }
        catch(Exception e){System.out.println("Handled");}

        System.out.println("Rest of the code");
//        try{
//            String str = null;
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
    }
}
