package cn.itcast.git.thread;

import java.util.concurrent.TimeUnit;

/**
 * @Discription
 * @Author rio
 * @Date 2019/10/12 15:07
 */
public class T1 {

    volatile boolean running = true;

    void m(){
        System.out.println("m start");
        while (running) {
            System.out.println(Thread.currentThread().getName()+"running ......");
        }
        System.out.println("m end!");
    }

    public static void main(String[] args) {
        T1 t = new T1();
        new Thread(new Runnable() {
            @Override
            public void run() {
                t.m();
            }
        },"t1").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t.running = false;
    }
}
