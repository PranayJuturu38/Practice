package KpiPractice;

public class EmployeeTest {
    public static void main(String[] args){
        Employee empOne = new Employee("Pranay");
        Employee emptwo =  new Employee("Yogesh");
        empOne.empAge(22);
        empOne.empDesignation("JavaIntern");
        empOne.empSalary(10000);
        empOne.printEmployee();

        emptwo.empAge(22);
        emptwo.empDesignation("JavaIntern");
        emptwo.empSalary(100000);
        emptwo.printEmployee();

    }
}
