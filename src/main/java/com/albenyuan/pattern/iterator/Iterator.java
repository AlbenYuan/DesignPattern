package com.albenyuan.pattern.iterator;

/**
 * @Author Alben Yuan
 * @Date 2018-04-11 17:11
 */
public interface Iterator<E> {

    /**
     * 是否有下一个元素
     *
     * @return
     */
    boolean hasNext();

    /**
     * 获取下一个元素
     *
     * @return
     */
    E next();

}
