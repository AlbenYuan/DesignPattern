package com.albenyuan.pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Alben Yuan
 * @Date 2018-04-10 23:34
 */

public class AllowFilter implements Filter {

    @Override
    public List<Entity> filter(Iterable<Entity> iterable) {
        List<Entity> list = new ArrayList<>();
        if (null != iterable) {
            for (Entity entity : iterable) {
                if (entity != null && entity.isAllow()) {
                    list.add(entity);
                }
            }
        }
        return list;
    }
}
