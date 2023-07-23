package garbage_collector;

import java.util.Date;

public class GarbageCollector02 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total Memory : " + runtime.totalMemory());
        System.out.println("Free Memory : " + runtime.freeMemory());

        Date dateObject = null;

        for(int i = 0; i<1000000000; i++) {
            dateObject = new Date();
            dateObject = null;
        }

        // new Date ile 1000000000 tane Date'in objesini ürettikten sonra kalan free alan
        System.out.println("After Free Memory : " + runtime.freeMemory());

        System.gc();
        System.out.println("After Garbage collector run : " + runtime.freeMemory());


    }
}
