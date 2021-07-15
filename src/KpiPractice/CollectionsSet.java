package KpiPractice;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsSet {
    public static void main(String[] args) {
        int num[]={10,2,34,321,233,11};
        Set<Integer> set = new HashSet<Integer>();
        try{
            for (int i=0;i<=5;i++){
                set.add(num[i]);
            }
            System.out.println(set);
            TreeSet sortedset = new TreeSet<Integer>(set);
            System.out.println("Sorted List");
            System.out.println(sortedset);
            System.out.println("First element"+(Integer)sortedset.first());
            System.out.println("Last element"+(Integer)sortedset.last());


        } catch (Exception e) {

        }
    }
}
