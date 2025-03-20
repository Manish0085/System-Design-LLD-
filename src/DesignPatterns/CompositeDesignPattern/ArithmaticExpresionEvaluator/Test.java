package DesignPatterns.CompositeDesignPattern.ArithmaticExpresionEvaluator;

public class Test {

    public static void main(String[] args) {
        Number two = new Number(2);
        Number seven = new Number(7);
        Number eight = new Number(8);

        Expression expression = new Expression(two, seven, Operation.ADD);
        expression.evaluate();
        Expression finalExp = new Expression(eight, expression, Operation.MULTIPLY);
        finalExp.evaluate();


//                           *
//                         /   \
//                          8     +
//                               /  \
//                              2    7
    }
}
