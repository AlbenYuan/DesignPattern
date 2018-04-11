package com.albenyuan.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Alben Yuan
 * @Date 2018-04-11 17:17
 */
public class ConcreteAggregate<E> implements Aggregate<E> {

    private List<E> list = new ArrayList<>();


    @Override

    public void add(E e) {
        list.add(e);
    }

    @Override
    public void remove(E e) {
        list.remove(e);
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> iterator = new ConcreteIterator<>(list);
        return iterator;
    }
}
