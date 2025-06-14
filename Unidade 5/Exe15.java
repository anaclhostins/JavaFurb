import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       
        System.out.println("Escreva o nome do aluno (ou 'fim' para encerrar): ");
        String nome = s.nextLine();

        while (!nome.equalsIgnoreCase("fim")) {
            System.out.println("Insira a nota 1: ");
            double nota1 = s.nextDouble();
            System.out.println("Insira a nota 2: ");
            double nota2 = s.nextDouble();

            double media = (nota1 + nota2) / 2;
            System.out.println("A média do(a) " + nome + " é " + media);

            s.nextLine(); // limpa o buffer do Scanner

            System.out.println("\nEscreva o nome do aluno (ou 'fim' para encerrar): ");
            nome = s.nextLine();
        }

        s.close();
    }
}