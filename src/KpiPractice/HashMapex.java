package KpiPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapex {
    public static void main(String[] args) {
     HashMap hm = new HashMap();

     hm.put("Pranay",new Double(11.2));
        hm.put("Reddy",new Double(132.22));
        hm.put("Juturu",new Double(143.24));

        Set set =hm.entrySet();

        Iterator itr = set.iterator();

        while(itr.hasNext()){
            Map.Entry me =(Map.Entry)itr.next();
            System.out.print(me.getKey()+":");
            System.out.println(me.getValue());
        }
        double balance =((Double)hm.get("Reddy")).doubleValue();
        hm.put("Pranay",new Double(balance+1000));
        System.out.println("Pranay new balance :"+hm.get("Pranay"));
    }
}
