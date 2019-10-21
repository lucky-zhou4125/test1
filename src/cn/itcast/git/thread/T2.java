package cn.itcast.git.thread;

import java.util.concurrent.Semaphore;

/**
 * @Discription   semaphore(信号量)控制多个线程同时访问某个资源
 * @Author rio
 * @Date 2019/10/12 16:58
 */
public class T2 {

    public static void main(String[] args) {

        int nums = 20;

        Semaphore semaphore = new Semaphore(5);

        for(int i=0; i<nums; i++){

            int finalI = i;

            new Thread(() -> {
                try {
                    semaphore.acquire();

                    System.out.println("顾客" + finalI + "在挑选商品， 购买。。。");

                    Thread.sleep(1000);

                    System.out.println("顾客" + finalI + "购买完毕。。。");

                    semaphore.release();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }).start();
        }
    }
}
