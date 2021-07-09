package KpiPractice;

class Vehicle {
    public void Car(String company,double year){
        System.out.println("Vehicle is Car of  Company"+company+"and year"+year);
    }
    public void Bike(String company,double year){
        System.out.println("Vehicle is Bike of  Company"+company+"and year"+year);

    }

}
public class MyVehicle extends Vehicle {
public void Truck(String company,double year){
    System.out.println("Vehicle is Truck of  Company"+company+"and year"+year);
}
public static void main(String[] args){
    MyVehicle obj = new MyVehicle();
    obj.Car("Tata",1999);
    obj.Truck("Ashok",2000);
    obj.Bike("Yamaha",2015);
}
}