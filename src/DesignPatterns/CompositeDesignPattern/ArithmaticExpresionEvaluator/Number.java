package DesignPatterns.CompositeDesignPattern.ArithmaticExpresionEvaluator;

public class Number implements ArithmaticExpression{

    private int number;

    public Number(int number){
        this.number = number;
    }
    @Override
    public int evaluate() {
        System.out.println("Number :"+number);
        return number;
    }
}
