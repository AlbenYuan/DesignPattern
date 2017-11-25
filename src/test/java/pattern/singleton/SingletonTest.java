package pattern.singleton;

import me.beilin.pattern.singleton.EagerSingleton;
import me.beilin.pattern.singleton.LazySingleton;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

/**
 * 单例模式 单元测试
 *
 * @Author Alben
 * @Date 17/3/13
 * @Version v0.0.1
 */
public class SingletonTest {

    private static Logger logger = LoggerFactory.getLogger(SingletonTest.class);


    @Test
    public void eagerSingleton() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        EagerSingleton singleton1 = EagerSingleton.getInstance();
        EagerSingleton singleton2 = EagerSingleton.getInstance();
        EagerSingleton singleton3 = null;
        boolean hasException = false;
        try {
            Class clazz = Class.forName(EagerSingleton.class.getName());
            singleton3 = (EagerSingleton) clazz.newInstance();
        } catch (Exception e) {
            hasException = true && e instanceof IllegalAccessException;
        }

        Assert.assertTrue(singleton1 == singleton2);
        Assert.assertTrue(hasException);
        Assert.assertTrue(null == singleton3);
    }

    @Test
    public void lazySingleton() {
        LazySingleton singleton1 = LazySingleton.getInstance();
        LazySingleton singleton2 = LazySingleton.getInstance();

        Assert.assertTrue(singleton1 == singleton2);
    }

    @Test
    public void multiThreadLazySingleton() throws InterruptedException {
        SingletonThread thread1 = new SingletonThread();
        SingletonThread thread2 = new SingletonThread();

        Thread.sleep(3000);
        LazySingleton singleton1 = thread1.getSingleton();
        LazySingleton singleton2 = thread2.getSingleton();
        Assert.assertTrue(singleton1 != null);
        Assert.assertTrue(singleton2 != null);
        Assert.assertTrue(singleton1 == singleton2);

    }

    class SingletonThread extends Thread {
        private LazySingleton singleton = null;

        @Override
        public void run() {
            singleton = LazySingleton.getInstance();
        }

        public LazySingleton getSingleton() {
            return singleton;
        }
    }

}
