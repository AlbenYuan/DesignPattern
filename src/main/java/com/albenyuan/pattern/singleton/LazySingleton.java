package com.albenyuan.pattern.singleton;

/**
 * 单例模式
 * 懒汉模式,线程不安全
 *
 * @Author Alben
 * @Date 17/3/11
 * @Version v0.0.1
 */
public class LazySingleton implements Singleton {

    private static LazySingleton instance = null;

    // 私有化构造方法
    private LazySingleton() {
        try {
            Thread.sleep(1000); // 延长创建过程，以便容易凸显出多线程情况下的问题。
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static LazySingleton getInstance() {
        if (null == instance) {

            instance = new LazySingleton();
        }
        return instance;
    }
}
