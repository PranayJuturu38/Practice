package KpiPractice;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable balance = new Hashtable();
        Enumeration names;
        String str;
        double bal;
        balance.put("Pranay", new Double(3434.34));
        balance.put("Reddy", new Double(123.22));
        balance.put("Juturu", new Double(1378.00));
       names = balance.keys();
       while(names.hasMoreElements()) {
           str = (String) names.nextElement();
           System.out.println(str + ": " + balance.get(str));
       }
        bal = ((Double)balance.get("Pranay")).doubleValue();
        balance.put("Pranay", new Double(bal + 1000));
        System.out.println("Pranay's new balance: " + balance.get("Pranay"));
    }
}
