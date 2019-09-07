package thread;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: Pandy
 * @Version 1.0
 * 火箭发射倒计时 所有的线程所有准备就绪 当计数器减为0的时候  主线程开始进行
 */
public class CountDownLatchDemo {

    public static void main(String[] args) {

        closeDoor();
    }

    public static void closeDoor(){

        CountDownLatch countDownLatch = new CountDownLatch(4);

        for (int i=1;i<=4;i++){
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"\t 天过去了");
                countDownLatch.countDown();
            },CountryEnum.forEach_CountryEnum(i).getRetMessage()).start();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"\t 一年结束了");
    }
}
