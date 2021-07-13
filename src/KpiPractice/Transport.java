package KpiPractice;

public class Transport implements VehicleInter{

    @Override
    public void Car() {
        System.out.println("Car");
    }

    @Override
    public void Bike() {
      System.out.println("Bike");
    }
    public static void main(String[] args){
        Transport obj = new Transport();
        obj.Car();
        obj.Bike();
    }
}
