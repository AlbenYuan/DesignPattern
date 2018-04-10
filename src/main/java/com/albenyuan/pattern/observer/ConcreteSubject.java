package com.albenyuan.pattern.observer;


import java.util.Vector;

/**
 * @Author Alben Yuan
 * @Date 2018-04-11 00:43
 */
public class ConcreteSubject implements Subject {

    private Vector<Observer> vector = new Vector<>();

    private Integer state;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
        this.notifyObserver();
    }

    @Override
    public void attach(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : getObservers()) {
            observer.update(this.state);
        }
    }

    public Iterable<Observer> getObservers() {
        return (Vector<Observer>) vector.clone();
    }
}
