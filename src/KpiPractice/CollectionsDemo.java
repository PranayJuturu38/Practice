package KpiPractice;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args){
        List a1 = new ArrayList();
        a1.add("Pranay");
        a1.add("Reddy");
        a1.add("Juturu");
     System.out.println("ArrayList" +a1);

     List l1 = new LinkedList();
        l1.add("Pranay");
        l1.add("Reddy");
        l1.add("Juturu");
        System.out.println("LinkedList" +l1);

        Set s1 = new HashSet();
        s1.add("Pranay");
        s1.add("Reddy");
        s1.add("Juturu");
        System.out.println("HashSet" +s1);

        Map m1 = new HashMap();
        m1.put("Pranay","1");
        m1.put("Reddy","2");
        m1.put("Juturu","3");

        System.out.println("MapElements"+m1);

    }
}
