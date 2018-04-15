package com.albenyuan.pattern.memento.blackbox;

import com.albenyuan.pattern.memento.wihtebox.Caretaker;
import com.albenyuan.pattern.memento.wihtebox.Originator;

/**
 * @Author Alben Yuan
 * @Date 2018-04-15 17:13
 */
public class Client {


    public void blackBox() {
        int state = 3;
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState(state);
        /**
         * 创建备忘录对象的 缓存起来
         */
        caretaker.saveMemento(originator.createMemento());
        /*
         * 进行设置重新还原
         */
        originator.setState(5);
        System.out.println(" 黑箱发起人更改状态：" + originator.getState());

        originator.restoreMemento(caretaker.retrieveMemento());
    }
}
