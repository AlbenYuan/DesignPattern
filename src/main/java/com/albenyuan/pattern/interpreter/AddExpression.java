package com.albenyuan.pattern.interpreter;

import sun.tools.tree.AndExpression;

import java.util.Map;

/**
 * @Author Alben Yuan
 * @Date 2018-04-27 15:15
 */
public class AddExpression implements Expression {


    private Expression right;
    private Expression left;

    public AddExpression(Expression right, Expression left) {
        this.right = right;
        this.left = left;
    }


    @Override
    public int interpret(Map<String, Expression> variables) {
        return 0;
    }
}
