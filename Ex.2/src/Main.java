import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Diga o tamanho dos lados do quadrado: ");
        double lados = scanner.nextDouble();
        System.out.println("A área do quadrado é: ");
        double area = lados * lados;
        System.out.printf("%s x %s = %s \n", lados, lados, area);
    }
}
