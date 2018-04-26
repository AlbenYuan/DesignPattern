package com.albenyuan.pattern.test;

import com.albenyuan.pattern.visitor.ConcreteElement;
import com.albenyuan.pattern.visitor.ConcreteVisitor;
import com.albenyuan.pattern.visitor.ObjectStructure;
import com.albenyuan.pattern.visitor.Visitor;
import org.junit.Test;

/**
 * @Author Alben Yuan
 * @Date 2018-04-26 15:54
 */
public class VisitorTest {

    @Test
    public void name() throws Exception {
        //创建一个结构对象
        ObjectStructure os = new ObjectStructure();
        //给结构增加一个节点
        os.add(new ConcreteElement());
        //创建一个访问者
        Visitor visitor = new ConcreteVisitor();
        os.action(visitor);
    }
}
