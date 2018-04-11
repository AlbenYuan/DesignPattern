package com.albenyuan.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Alben Yuan
 * @Date 2018-04-11 17:13
 */
public class ConcreteIterator<E> implements Iterator<E> {

    private List<E> list;
    private int cursor;


    public ConcreteIterator(List<E> list) {
        this.list = list;
        this.cursor = 0;
    }

    @Override
    public boolean hasNext() {
        return null != list && cursor != list.size();
    }

    @Override
    public E next() {
        E e = null;
        if (this.hasNext()) {
            e = list.get(cursor);
            cursor++;
        }
        return e;
    }
}
