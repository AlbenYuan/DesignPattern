package com.albenyuan.pattern.interpreter;

import java.util.Map;

/**
 * @Author Alben Yuan
 * @Date 2018-04-27 16:30
 */
public class Number implements Expression {
    private int number;

    public Number(final int number) {
        this.number = number;
    }

    @Override
    public int interpret(final Map<String, Expression> variables) {
        return number;
    }
}

