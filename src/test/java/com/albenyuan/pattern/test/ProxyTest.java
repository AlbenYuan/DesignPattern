package com.albenyuan.pattern.test;

import com.albenyuan.pattern.proxy.Proxy;
import org.junit.Test;

/**
 * @Author Alben Yuan
 * @Date 2018-04-03 13:52
 */

public class ProxyTest {

    @Test
    public void proxy() {
        Proxy proxy = new Proxy();
        proxy.action();
    }
}
