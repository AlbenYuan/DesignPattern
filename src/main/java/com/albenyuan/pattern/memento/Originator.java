package com.albenyuan.pattern.memento;

/**
 * @Author Alben Yuan
 * @Date 2018-04-15 17:03
 */
public class Originator {


    private int state = 0;

    private Caretaker caretaker = new Caretaker();

    public Memento createMemento() {
        return new Memento(state);
    }

    /**
     * 将发起人恢复到备忘录对象所记载的状态
     */
    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
        System.out.println("恢复 备忘录 状态：" + state);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

}
