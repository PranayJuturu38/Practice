package KpiPractice;

import java.util.ArrayList;

public class ArrayListCl {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        System.out.println("Initial Size"+al.size());//Size of the arraylist
        al.add("P");
        al.add("R");
        al.add("A");
        al.add("N");
        al.add("A");
        al.add("Y");
        al.add("R");
        al.add(1,"J");
        System.out.println("Size of al after addition"+al.size());

        System.out.println("Contents of al:"+al);

        al.remove("R");
        al.remove(1);
        System.out.println("After deletion"+al.size());
        System.out.println("Contents of al:"+al);

    }
}
