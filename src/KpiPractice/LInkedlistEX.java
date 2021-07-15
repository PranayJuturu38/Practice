package KpiPractice;

import java.util.LinkedList;

public class LInkedlistEX {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("P");
        ll.add("R");
        ll.add("A");
        ll.add("N");
        ll.add("A");
        ll.add("Y");
        ll.addLast("J");
        ll.addFirst("U");

        System.out.println("Original ll"+ll);

        ll.remove("U");
        ll.remove(3);
        System.out.println("Contents of ll after deletion"+ll);

        Object obj =  ll.get(4);
        ll.set(4,(String) obj +"Changed");
        System.out.println("ll after change:" +ll);
    }
}
