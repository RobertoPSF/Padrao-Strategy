package Contexts;

import Interfaces.Strategy;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeOperation(int a, int b){
        return strategy.operation(a, b);
    }
}
