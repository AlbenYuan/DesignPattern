package com.albenyuan.pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Alben Yuan
 * @Date 2018-04-10 23:37
 */

public class RefuseFilter implements Filter {
    @Override
    public List<Entity> filter(Iterable<Entity> iterable) {
        List<Entity> list = new ArrayList<>();
        if (iterable != null) {
            for (Entity entity : iterable) {
                if (null != entity && !entity.isAllow()) {
                    list.add(entity);
                }
            }
        }
        return list;
    }
}
