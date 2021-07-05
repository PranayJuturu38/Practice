package KpiPractice;
public class Animal {
    int age;
    public Animal(String type){
        System.out.println("Type of Animal is:" +type);
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        System.out.println("Age of the the animal is:" +age);
       return age;
    }
    public static void main(String[] args) {
        // write your code here
       Animal puppy = new Animal("Dog");
       puppy.setAge(4);
       puppy.getAge();
       System.out.println("Variable Value"+puppy.age);
    }
}
