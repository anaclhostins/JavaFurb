import java.util.Scanner;

public class Exe17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double maiorAltura = 0;
        int maiorInsc = 0;
        int menorIns = 0;
        double menorAltura = 3;
        double media = 0;
        int inscricao = 0;
        int numeroIncs = 0;
        double alturaTotal = 0;

        System.out.println("Insira o número de inscrição: ");
        inscricao = s.nextInt();
        while (inscricao != 0) {
            System.out.println("Insira a altura do atleta: ");
            double altura = s.nextDouble();
            if (altura > maiorAltura) {
                maiorAltura = altura;
                maiorInsc = inscricao;
            }

            if (altura < menorAltura) {
                menorAltura = altura;
                menorIns = inscricao;
            }

            numeroIncs++;
            alturaTotal += altura;
            System.out.println("Insira o número de inscrição: ");
            inscricao = s.nextInt();
        }

        media = alturaTotal / numeroIncs;
        System.out.println("O atleta mais baixo tem " + menorAltura + " e o número de inscrição é " + menorIns);
        System.out.println("O atleta mais alto tem " + maiorAltura + " e o número de inscrição é " + maiorInsc);
        System.out.println("A média do grupo de atletas é: " + media);

        s.close();
    }
}