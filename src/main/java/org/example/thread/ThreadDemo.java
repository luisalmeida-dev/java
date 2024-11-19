package org.example.thread;

public class ThreadDemo extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is running");
    }

    //Podemos criar uma thread utilizando o construtor da classe
    public static void threadByConstructor(){
        Thread t = new Thread("New thread by constructor");
        t.start();
        System.out.println(t.getName());
    }

    public static void main(String[] args) {
        ThreadDemo thread = new ThreadDemo();
        thread.start(); //Comando inicia a thread que foi criada
        threadByConstructor();
    }


}
