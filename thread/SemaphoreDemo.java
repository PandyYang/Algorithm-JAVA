package thread;

import java.sql.SQLOutput;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @Author: Pandy
 * @Version 1.0
 */
public class SemaphoreDemo {
    public static void main(String[] args) {
        //模拟三个停车位
        Semaphore semaphore = new Semaphore(3);
        //模拟6个汽车
        for (int i = 1;i<=6;i++){
            new Thread(()->{
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName()+"\t  抢到车位");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println(Thread.currentThread().getName()+"\t 停车2秒后离开车位");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    semaphore.release();
                }
            },String.valueOf(i)).start();
        }
    }
}
