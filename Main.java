import Contexts.Context;
import Strategys.ConcreteStrategyAdd;
import Strategys.ConcreteStrategyDivision;
import Strategys.ConcreteStrategyMultiply;
import Strategys.ConcreteStrategySubtract;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();

        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe o primeiro número: ");
        int a = sc.nextInt();
        System.out.printf("Informe o segundo valor: ");
        int b = sc.nextInt();
        System.out.printf("Informe a operação desejada: ");
        String op = sc.next();

        if (op == "s") {
            context.setStrategy(new ConcreteStrategyAdd());
        } else if (op == "sub") {
            context.setStrategy(new ConcreteStrategySubtract());
        } else if (op == "m") {
            context.setStrategy(new ConcreteStrategyMultiply());
        } else {
            context.setStrategy(new ConcreteStrategyDivision());
        }

        int result = context.executeOperation(a, b);

        System.out.println(result);
    }
}
