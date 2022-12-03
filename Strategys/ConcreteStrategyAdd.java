package Strategys;

import Interfaces.Strategy;

public class ConcreteStrategyAdd implements Strategy {
    @Override
    public int operation(int a, int b) {
        return a + b;
    }
}
