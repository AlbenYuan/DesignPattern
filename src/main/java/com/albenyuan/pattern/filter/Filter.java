package com.albenyuan.pattern.filter;

import java.util.List;

/**
 * @Author Alben Yuan
 * @Date 2018-04-10 23:31
 */

public interface Filter {

    List<Entity> filter(Iterable<Entity> iterable);
}
