package com.albenyuan.pattern.interpreter;

import java.util.Map;

/**
 * @Author Alben Yuan
 * @Date 2018-04-27 15:14
 */
public interface Expression {

    public int interpret(final Map<String, Expression> variables);
}
