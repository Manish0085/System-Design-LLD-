package DesignPatterns.CompositeDesignPattern.ArithmaticExpresionEvaluator;

public class Expression implements ArithmaticExpression{

    ArithmaticExpression leftExpression;
    ArithmaticExpression rightExpression;
    Operation operation;

    public Expression(ArithmaticExpression leftExpression, ArithmaticExpression rightExpression, Operation operation) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
        int val = 0;
        switch (operation){
            case ADD -> val = leftExpression.evaluate()+ rightExpression.evaluate();
            case SUBTRACT -> val = leftExpression.evaluate()- rightExpression.evaluate();
            case MULTIPLY -> val = leftExpression.evaluate()* rightExpression.evaluate();
            case DIVIDE -> val = leftExpression.evaluate()/ rightExpression.evaluate();
            case MODULAR -> val = leftExpression.evaluate()% rightExpression.evaluate();

        }

        System.out.println("Expression value: "+val);
        return val;

    }
}
