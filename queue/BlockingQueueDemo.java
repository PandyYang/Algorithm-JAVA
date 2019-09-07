package queue;

import sun.security.provider.NativePRNG;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @Author: Pandy
 * @Version 1.0
 * 当队列是空的时候 从队列中获取元素的操作会被阻塞
 * 当队列是满的时候 向队列中添加元素的操作会被阻塞
 * 阻塞队列是消息中间件的核心底层原理
 */
public class BlockingQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        //List list = null;
        /**
         * offer方法不会抛出异常
         */
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        System.out.println(blockingQueue.offer("a", 2L, TimeUnit.SECONDS));
        System.out.println(blockingQueue.offer("a", 2L, TimeUnit.SECONDS));
        System.out.println(blockingQueue.offer("a", 2L, TimeUnit.SECONDS));
        System.out.println(blockingQueue.offer("a", 2L, TimeUnit.SECONDS));



        /*blockingQueue.put("a");
        blockingQueue.put("b");
        blockingQueue.put("c");
        System.out.println("========================");
        //blockingQueue.put("1");

        blockingQueue.take();
        blockingQueue.take();
        blockingQueue.take();
        blockingQueue.take();*/

        /*//offer方法不会抛出异常
        System.out.println(blockingQueue.offer("a"));
        System.out.println(blockingQueue.offer("b"));
        System.out.println(blockingQueue.offer("c"));
        System.out.println(blockingQueue.offer("1"));

        //探测队首的元素
        System.out.println(blockingQueue.peek());
        //弹出队首的元素
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());*/

        /*System.out.println(blockingQueue.add("a"));
        System.out.println(blockingQueue.add("a"));
        System.out.println(blockingQueue.add("a"));
        System.out.println(blockingQueue.add("a"));*/


        /*for (String s : blockingQueue) {
            System.out.println("s = " + s);
        }*/
    }
}
