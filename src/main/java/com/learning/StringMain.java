package com.learning;

public class StringMain {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer();

        Thread thread1 = new Thread(() -> {
            for (int i=0; i<100;i ++) {
                stringBuffer.append("A");
        }
    });
        Thread thread2 = new Thread(() -> {
            for (int i=0; i<100; i++) {
                stringBuffer.append("B");
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (Exception e) {
         e.printStackTrace();
        }

        System.out.println("Results: " + stringBuffer.toString().length());
    }
}