package me.beilin.pattern.singleton;

/**
 * 单例模式
 * 这个是对线程安全的懒汉模式做了升级版,俗称双重检查锁定。
 * 在JDK1.5之后，双重检查锁定才能够正常达到单例效果。
 *
 * @Author Alben
 * @Date 17/3/12
 * @Version v0.0.1
 */
public class SingletonLock implements Singleton {
    private volatile static SingletonLock instance;

    private SingletonLock() {
    }

    public static SingletonLock getInstance() {
        if (instance == null) {
            synchronized (SingletonLock.class) {
                if (instance == null) {
                    instance = new SingletonLock();
                }
            }
        }
        return instance;

    }
}
