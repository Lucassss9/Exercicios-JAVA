import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite a base do Retângulo: ");
        double base = scanner.nextDouble();
        System.out.println("Digite a altura do Retângulo");
        double altura = scanner.nextDouble();
        double area = base * altura;
        System.out.println("A área do retângulo é:");
        System.out.printf("%s x %s = %s", base, altura, area);
    }
}
