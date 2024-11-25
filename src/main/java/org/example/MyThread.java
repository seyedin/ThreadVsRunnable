package org.example;

public class MyThread extends Thread {
    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Message from thread: "+i);
            try{
                Thread.sleep(500);
            } catch(InterruptedException e) {
                System.out.println("MyThread interrupted: "+e.getMessage());
            }
        }
    }
}
