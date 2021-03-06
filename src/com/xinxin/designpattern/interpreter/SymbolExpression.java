package com.xinxin.designpattern.interpreter;

import java.util.HashMap;

public class SymbolExpression extends Expression{

    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        throw new UnsupportedOperationException();
    }
}
