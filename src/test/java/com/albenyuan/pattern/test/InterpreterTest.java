package com.albenyuan.pattern.test;

import com.albenyuan.pattern.interpreter.Evaluator;
import com.albenyuan.pattern.interpreter.Expression;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Alben Yuan
 * @Date 2018-04-27 16:33
 */
public class InterpreterTest {

    @Test
    public void name() throws Exception {
        final String expression = "w x z - +";
        final Evaluator sentence = new Evaluator(expression);
        final Map<String, Expression> variables = new HashMap<>();
        variables.put("w", new com.albenyuan.pattern.interpreter.Number(5));
        variables.put("x", new com.albenyuan.pattern.interpreter.Number(10));
        variables.put("z", new com.albenyuan.pattern.interpreter.Number(42));
        final int result = sentence.interpret(variables);
        System.out.println(result);
    }
}
