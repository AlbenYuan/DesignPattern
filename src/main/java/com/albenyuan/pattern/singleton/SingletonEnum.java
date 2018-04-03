package com.albenyuan.pattern.singleton;

/**
 * 单例模式
 * 通过枚举实现。Effective Java作者Josh Bloch 提倡的方式。
 * 该方式不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
 *
 * @Author Alben
 * @Date 17/3/12
 * @Version v0.0.1
 */
public class SingletonEnum implements Singleton {

    private SingletonEnum() {
    }

    public static SingletonEnum getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton {
        INSTANCE();

        private SingletonEnum singleton;

        Singleton() {
            singleton = new SingletonEnum();

        }

        public SingletonEnum getInstance() {
            return singleton;
        }
    }
}
