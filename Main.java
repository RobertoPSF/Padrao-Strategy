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
        sc.nextLine();
        System.out.printf("Informe o segundo valor: ");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.printf("Informe a operação desejada: \n1 - soma\n2 - subtração\n3 - multiplicação\n4 - divisão\nOpção: ");
        int op = sc.nextInt();
        sc.nextLine();
        
        if (op == 1) {
            context.setStrategy(new ConcreteStrategyAdd());
        } else if (op == 2) {
            context.setStrategy(new ConcreteStrategySubtract());
        } else if (op == 3) {
            context.setStrategy(new ConcreteStrategyMultiply());
        } else {
            context.setStrategy(new ConcreteStrategyDivision());
        }
        sc.close();

        int result = context.executeOperation(a, b);

        System.out.println(result);
    }
}
