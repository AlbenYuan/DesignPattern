package com.albenyuan.pattern.interpreter;

import java.util.Map;

/**
 * @Author Alben Yuan
 * @Date 2018-04-27 16:31
 */
public class Plus implements Expression {
    Expression leftOperand;
    Expression rightOperand;

    public Plus(final Expression left, final Expression right) {
        leftOperand = left;
        rightOperand = right;
    }

    @Override
    public int interpret(final Map<String, Expression> variables) {
        return leftOperand.interpret(variables) + rightOperand.interpret(variables);
    }
}
