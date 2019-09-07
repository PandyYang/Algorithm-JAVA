package designpattern;

/**
 * @author Pandy
 * @version 1.0
 * @date 0:08
 */
public class SinglePattern {
    /**
     * 饿汉式
     */
    static class Singleton1{
        private Singleton1(){};
        private static Singleton1 singleton1 = new Singleton1();
        //直接创建好
        public static Singleton1 getInstance(){
            return singleton1;
        }
    }

    /**
     * 懒汉式
     */
    static class Singleton2{
        private Singleton2(){};
        private static Singleton2 singleton2 = null;
        public static Singleton2 getInstance(){
            //为null的时候才创建 多线程有安全问题
            if (singleton2 == null){
                singleton2 = new Singleton2();
            }
            return singleton2;
        }
    }

    /**
     * 线程安全
     */
    static class Singleton3{
        private Singleton3(){};
        //volatile 防止内存分配后未实例化就返回
        private volatile static Singleton3 singleton3;
        public static Singleton3 getInstance(){
            if (null == singleton3){
                synchronized (singleton3){
                    if (null == singleton3){
                        singleton3 = new Singleton3();
                    }
                }
            }
            return singleton3;
        }
    }
}
