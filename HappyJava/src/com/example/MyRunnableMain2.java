package com.example;

public class MyRunnableMain2 {
    public static void main(String[] args) {

        RunnableExcute runnableExcute = new RunnableExcute();
        runnableExcute.execute(() -> {
            System.out.println("hello");
        });
    }
}
