import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Olá, qual o seu nome?");
            String name = scanner.nextLine();
            System.out.println("Qual seu ano de nascimento?");
            int year = scanner.nextInt();
            var anoAtual = 2025;
            int idade = anoAtual - year;
            System.out.println("Olá, " + name + " você tem " + idade + " anos.");
        }
    }
}