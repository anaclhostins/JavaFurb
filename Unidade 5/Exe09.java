import java.util.ArrayList;
import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Escreva o número de alunos na sala: ");
        int qntAlunos = s.nextInt();

        String nome = "";
        int idade = 0;
        ArrayList<String> nomes = new ArrayList<>();
        int mais20 = 0;
        int outros = 0;

        for (int i = 0; i < qntAlunos; i++) {
            s.nextLine();
            System.out.println("Escreva o nome do aluno: ");
            nome = s.nextLine();

            System.out.println("Escreva a idade do aluno: ");
            idade = s.nextInt();
            if (idade == 18) {
                nomes.add(nome);
            } else if (idade >= 20) {
                mais20++;
            } else {
                outros++;
            }
        }

        System.out.println("O alunos que tem 18 anos são: ");
        for (String nomeLista : nomes) {
            System.out.println(nomeLista);
        }
        System.out.println("O número de alunos que tem idade acima de 20 é " + mais20
                + "\ne o número de alunos que tem idade diferente de 18 e menor que 20 é " + outros);
    }
}
