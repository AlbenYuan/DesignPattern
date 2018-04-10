package com.albenyuan.pattern.filter;


import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * @Author Alben Yuan
 * @Date 2018-04-10 23:32
 */

public class Entity implements Serializable {

    private static final long serialVersionUID = -1585215886045552875L;

    private String name;

    private boolean isAllow;

    public Entity() {
    }

    public Entity(String name, boolean isAllow) {
        this.name = name;
        this.isAllow = isAllow;
    }

    public boolean isAllow() {
        return isAllow;
    }

    public void setAllow(boolean allow) {
        isAllow = allow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Entity{");
        sb.append("name='").append(name).append('\'');
        sb.append(", isAllow=").append(isAllow);
        sb.append('}');
        return sb.toString();
    }
}


