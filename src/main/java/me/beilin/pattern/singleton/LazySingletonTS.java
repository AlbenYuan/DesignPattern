package me.beilin.pattern.singleton;

/**
 * 单例模式
 * 懒汉模式 线程安全
 *
 * @Author Alben
 * @Date 17/3/11
 * @Version v0.0.1
 */
public class LazySingletonTS implements Singleton {

    private static LazySingletonTS instance = null;

    // 私有化构造方法
    private LazySingletonTS() {
    }

    //
    public static synchronized LazySingletonTS getInstance() {
        if (null == instance) {
            instance = new LazySingletonTS();
        }
        return instance;
    }
}
