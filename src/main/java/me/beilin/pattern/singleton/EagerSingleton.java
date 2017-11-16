package me.beilin.pattern.singleton;

/**
 * 单例模式
 * 饿汉模式
 *
 * @Author Alben
 * @Date 17/3/12
 * @Version v0.0.1
 */
public class EagerSingleton implements Singleton {

    private static EagerSingleton instance = new EagerSingleton();

//    static {
//        instance = new EagerSingleton();
//    }

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
