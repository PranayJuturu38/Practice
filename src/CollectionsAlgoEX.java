import java.util.*;

public class CollectionsAlgoEX {
    public static void main(String args[]) {

        List ll = new LinkedList();
        ll.add(new Integer(-10));
        ll.add(new Integer(223));
        ll.add(new Integer(-13));
        ll.add(new Integer(83));

        Comparator r = Collections.reverseOrder();

        Collections.sort(ll, r);

        Iterator li = ll.iterator();
        System.out.print("List sorted in reverse: ");

        while(li.hasNext()) {
            System.out.print(li.next() + " ");
        }
        System.out.println();
        Collections.shuffle(ll);

        li = ll.iterator();
        System.out.print("List shuffled: ");

        while(li.hasNext()) {
            System.out.print(li.next() + " ");
        }

        System.out.println();
        System.out.println("Minimum: " + Collections.min(ll));
        System.out.println("Maximum: " + Collections.max(ll));
    }
}
