package KpiPractice;

public class RunEncapsulation {
public static void main(String[] args){
    Encapsulation obj = new Encapsulation();
    obj.setName("Pranay");
    obj.setAge(22);
    obj.setId("1");
    System.out.println("Name:"+obj.getName());
    System.out.println("Age:"+obj.getAge());
    System.out.println("id:"+obj.getId());

}
}
