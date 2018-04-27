package com.albenyuan.pattern.interpreter;

import java.util.Map;

/**
 * @Author Alben Yuan
 * @Date 2018-04-27 16:31
 */
public class Variable implements Expression {
    private String name;

    public Variable(final String name) {
        this.name = name;
    }

    @Override
    public int interpret(final Map<String, Expression> variables) {
        if (null == variables.get(name)) return 0; // Either return new Number(0).
        return variables.get(name).interpret(variables);
    }
}