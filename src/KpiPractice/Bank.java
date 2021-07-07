package KpiPractice;

public class Bank { //Parent Class
    String city ="HYD";
    int getROI(){

        return 0;

    }

}
class HDFC extends Bank{ //Child class
    String city = "BLR";
    @Override
    int getROI() {
        return 10;

    }
    void getCity(){
        System.out.println(super.city);
        System.out.println(city);
    }
}
class AXIS extends Bank{
    @Override
    int getROI() {
        return 12;
    }
}
class ICICI extends Bank{
    @Override
    int getROI() {
        return 34;
    }
}
class getROI{
    public static void main(String[] args){
         ICICI i = new ICICI();
         AXIS a= new AXIS();
         HDFC h= new HDFC();
         h.getCity();
        System.out.println("ICICI"+i.getROI());
        System.out.println("AXIS"+a.getROI());
        System.out.println("HDFC"+h.getROI());

    }
}
