package me.beilin.pattern.singleton;

/**
 * 单例模式
 * 内部类实现
 *
 * @Author Alben
 * @Date 17/3/12
 * @Version v0.0.1
 */
public class SingletonInnerClass implements Singleton {

    private static class SingletonHolder {
        private static final SingletonInnerClass instance = new SingletonInnerClass();
    }

    private SingletonInnerClass() {
    }

    public static final SingletonInnerClass getInstance() {
        return SingletonHolder.instance;
    }
}
