import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe34 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        int opcao = 0;
        int contasEncerradas = 0;

        do {
            System.out.println("1 - Encerrar a conta de um hóspede"
                    + "\n2 - Verificar número de contas encerradas"
                    + "\n3 - Sair" + "\nEscolha uma opção:");
            opcao = s.nextInt();

            switch (opcao) {
                case 1:
                    s.nextLine();
                    System.out.println("Nome do hóspede: ");
                    String nome = s.nextLine();

                    System.out.println("Número de diárias: ");
                    int diárias = s.nextInt();

                    double diariaValor = 50;
                    double taxaServico = 0;

                    if (diárias < 15) {
                        taxaServico = 7.50;
                    } else if (diárias == 15) {
                        taxaServico = 6.50;
                    } else {
                        taxaServico = 5;
                    }

                    double total = diárias * (diariaValor + taxaServico);
                    System.out.println("Hóspede: " + nome + "\nTotal a pagar: R$" + df.format(total));
                    contasEncerradas++;
                    break;
                case 2:
                    System.out.println("Números de contas encerradas: " + contasEncerradas);
                default:
                    System.out.println("Opção Inválida! Tente novamente");
                    break;
            }
        } while (opcao != 3);

        s.close();
    }
}
