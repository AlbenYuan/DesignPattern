package com.albenyuan.pattern.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Vector;

/**
 * @Author Alben Yuan
 * @Date 2018-04-11 00:09
 */
public class Composite implements Component {

    private static final Logger logger = LoggerFactory.getLogger(Composite.class);

    private Vector<Component> vector = new Vector<>();

    public void addComponent(Component component) {
        vector.add(component);
    }

    public void removeComponent(Component component) {
        vector.remove(component);
    }


    @Override
    public Component getComponent() {
        logger.info("Composite.getComponent()");
        return null;
    }

    @Override
    public void operate() {
        logger.info("Composite.operate()");
        for (Component component : vector) {
            component.operate();
        }
    }
}
