package thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @Author: Pandy
 * @Version 1.0
 * 可循环使用的屏障
 * 集齐七颗龙珠 召唤神龙 增加到某一定的值 主线程运行
 */
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(7,()->{
            System.out.println("------召唤神龙");
        });

        for (int i =1;i<=7;i++){
            final int tempInt = i;
         new Thread(()->{
             System.out.println(Thread.currentThread().getName() + "\t 已收集" + tempInt+"颗龙珠");
             try {
                 cyclicBarrier.await();
             } catch (InterruptedException e) {
                 e.printStackTrace();
             } catch (BrokenBarrierException e) {
                 e.printStackTrace();
             }
             },String.valueOf(i)).start();
        }
    }
}
