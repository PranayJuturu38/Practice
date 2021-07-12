package KpiPractice;

public class demo {
 public static void main(String[] args){
     Salary obj1 = new Salary("Pranay","HYD",1,234.00);
     Employeeinfo obj2 = new Salary("Juturu","BLR",2,9032740.00);
     System.out.println("Calling mailcheck");
     obj1.mailCheck();
     System.out.println("Calling mailcheck with employee");
     obj2.mailCheck();
 }
}
