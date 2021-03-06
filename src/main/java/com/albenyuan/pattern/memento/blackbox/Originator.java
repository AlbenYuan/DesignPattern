package com.albenyuan.pattern.memento.blackbox;

/**
 * @Author Alben Yuan
 * @Date 2018-04-15 17:16
 */
public class Originator {

    private int state = 0;

    Caretaker caretaker = new Caretaker();

    public Memento creatMementoObject() {
        return new Memento(state);
    }

    /**
     * 将发起人恢复到备忘录对象所记载的状态
     */
    public void restoreMemento(MementoWare momIf) {
        this.setState(((Memento) momIf).getState());
        System.out.println("黑箱恢复 备忘录 状态：" + state);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    private class Memento implements MementoWare {

        private int state;

        public Memento(int state) {
            this.state = state;
            System.out.println("黑箱备忘录 当前保存 状态：" + state);
        }

        public int getState() {
            return state;
        }

        public void setState(int state) {

            this.state = state;
        }

    }
}
