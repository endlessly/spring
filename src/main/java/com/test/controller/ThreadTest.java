package com.test.controller;

public class ThreadTest extends Thread {
    //标记线程号
    private int threadNo;

    //生成构造方法
    public ThreadTest(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
//同步方法默认同步对象
    public void run() {
//可以把同步方法想成一个房屋，而同步代码块就是里面的保险箱 这个保险箱的钥匙可以是 这个房间的钥匙也可以是其他钥匙
//我们在这里加了一个类锁 ThreadTest.class 意思就是想进代码块必须是这个类是实例 但是类锁只有一个 所以造成了两个同步
// 每一个对象都有一个内置的锁 但是两个一个类的实例同时访问 这个类中的同步方法不会 同步，除非采用synchronized(){}代码块给类加锁
//因为我们创建的两个对象是有两把锁，每个对象一个 互相不干扰，除非给这个类加锁
        int s;
        if (threadNo == 1) {
            s = 100;
        } else {
            s = 10;
        }


        synchronized (ThreadTest.class) {

            for (int i = 1; i < s; i++) {
                System.out.println("第" + threadNo + "是" + i);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
//开启两个线程同时执行
        new ThreadTest(1).start();
        new ThreadTest(2).start();

    }
}