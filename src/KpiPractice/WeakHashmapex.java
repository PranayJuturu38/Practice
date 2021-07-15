package KpiPractice;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashmapex {
    private static Map map;
    public static void main(String[] args) {
        map = new WeakHashMap();
        map.put(new String("Pranay"), "Reddy");

        Runnable runner = new Runnable() {
            public void run() {
                while (map.containsKey("Pranay")) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ignored) {
                    }
                    System.out.println("Thread waiting");
                    System.gc();
                }
            }
        };
        Thread t = new Thread(runner);
        t.start();
        System.out.println("Main waiting");
        try {
            t.join();
        } catch (InterruptedException ignored) {
        }
    }
}
