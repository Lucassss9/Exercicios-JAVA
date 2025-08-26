import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa:");
        String nome1 = scanner.nextLine();
        System.out.println("Digite a idade da primeira pessoa:");
        int idade1 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o nome da segunda pessoa:");
        String nome2 = scanner.nextLine();
        System.out.println("Digite a idade da segunda pessoa:");
        int idade2 = scanner.nextInt();

        System.out.println("Pessoa 1: ");
        System.out.printf("Nome: %s \n", nome1);
        System.out.printf("Idade: %s \n \n", idade1);

        System.out.println("Pessoa 2: ");
        System.out.printf("Nome: %s \n", nome2);
        System.out.printf("Idade: %s \n \n", idade2);

        if(idade1 < idade2 ){
            int diferenca = idade2 - idade1;
            System.out.println("A diferença de idade dos dois é:");
            System.out.printf("%s - %s = %s \n", idade2, idade1, diferenca);
        } else {
            int diferenca = idade1 - idade2;
            System.out.println("A diferença de idade dos dois é:");
            System.out.printf("%s - %s = %s \n", idade1, idade2, diferenca);
        }
    }
}
