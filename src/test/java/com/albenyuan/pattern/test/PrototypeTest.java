package com.albenyuan.pattern.test;

import com.albenyuan.pattern.prototype.ConcretePrototype;
import com.albenyuan.pattern.prototype.Prototype;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author Alben Yuan
 * @Date 2018-04-03 10:32
 */

public class PrototypeTest {

    @Test
    public void prototype() {
        Prototype prototype = new ConcretePrototype();
        Prototype clone = prototype.clone();
        Assert.assertNotEquals(clone, prototype);

    }
}
