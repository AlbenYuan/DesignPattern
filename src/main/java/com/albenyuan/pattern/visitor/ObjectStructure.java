package com.albenyuan.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Alben Yuan
 * @Date 2018-04-26 14:31
 */
public class ObjectStructure {

    private List<Element> elements = new ArrayList<Element>();

    /**
     * 执行方法操作
     */
    public void action(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }

    /**
     * 添加一个新元素
     */
    public void add(Element node) {
        elements.add(node);
    }
}
