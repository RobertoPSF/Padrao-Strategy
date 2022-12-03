package Strategys;

import Interfaces.Strategy;

public class ConcreteStrategyDivision implements Strategy {
    @Override
    public int operation(int a, int b) {
        return a/b;
    }
}
