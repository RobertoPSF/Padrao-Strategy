package Strategys;

import Interfaces.Strategy;

public class ConcreteStrategyMultiply implements Strategy {
    @Override
    public int operation(int a, int b) {
        return a * b;
    }
}
