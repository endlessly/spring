package com.test.controller;

import com.test.Thread.MyRunnable;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable("a");
        Thread thread = new Thread(myRunnable);
        System.out.println(thread.isAlive());
            thread.start();
        System.out.println(thread.isAlive());
    }
}
