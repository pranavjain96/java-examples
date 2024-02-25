package Oracle.course;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapThreadSafeExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();

        // Creating and starting multiple threads to put values into the ConcurrentHashMap
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                concurrentHashMap.put("Key" + i, i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1001; i <= 2000; i++) {
                concurrentHashMap.put("Key" + i, i);
            }
        });

        // Starting the threads
        thread1.start();
        thread2.start();

        // Waiting for the threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Displaying the ConcurrentHashMap
        System.out.println("ConcurrentHashMap: " + concurrentHashMap.size());
    }
}
