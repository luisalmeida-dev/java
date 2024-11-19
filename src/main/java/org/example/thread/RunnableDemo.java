package org.example.thread;

public class RunnableDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        RunnableDemo runnableThread = new RunnableDemo();
        Thread thread = new Thread(runnableThread); //Utiliza o contrutor da classe thread passando uma instancia runnable
        thread.start();
    }
}
