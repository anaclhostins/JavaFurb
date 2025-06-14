import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        int pecasManha = 0;
        int pecasTarde = 0;
        int diaMaiorProd = 0;
        int maiorProducao = 0;
        int producaoManha = 0;
        int producaoTarde = 0;

        System.out.println("Insira o dia do pagamento: ");
        int diaPagamento = s.nextInt();

        // Verificaçao dia Pagamento
        while ((diaPagamento < 1) || (diaPagamento > 30)) {
            System.out.println("Dia inválido");
            System.out.println("Insira o dia do pagamento: ");
            diaPagamento = s.nextInt();
        }

        // peças dia e tarde
        while (diaPagamento >= 1 && diaPagamento <= 30) {
            int producaoTotal = 0;
            double salario = 0;
            double valorManha = 0;
            double valorTarde = 0;
            System.out.println("Peças produzidas - Manhã: ");
            pecasManha = s.nextInt();
            System.out.println("Peças produzidas - Tarde: ");
            pecasTarde = s.nextInt();
            producaoManha += pecasManha;
            producaoTarde += pecasTarde;
            producaoTotal = pecasManha + pecasTarde;

            // Dia maior produção
            if (producaoTotal > maiorProducao) {
                maiorProducao = producaoTotal;
                diaMaiorProd = diaPagamento;
            }
            
            // Até dia 15
            if (diaPagamento <= 15) {
                if (pecasManha > 30 && pecasTarde > 30 && producaoTotal > 100) {
                    salario = producaoTotal * 0.80;
                    System.out.println("Valor do dia: R$" + df.format(salario));
                } else {
                    salario = producaoTotal * 0.5;
                    System.out.println("Valor do dia: R$" + df.format(salario));
                }
            // A partir dia 16
            } else if (diaPagamento >= 16 && diaPagamento <= 30) {
                valorManha = pecasManha * 0.4;
                valorTarde = pecasTarde * 0.3;
                salario = valorManha + valorTarde;
                System.out.println("Valor do dia: R$" + df.format(salario));
            }
            
            // Novo funcionario
            System.out.println("Novo funcionário(1-Sim | 2-Não): ");
            int novoFuncionário = s.nextInt();
            // validaçao resposta
            while (novoFuncionário != 1 && novoFuncionário != 2) {
                System.out.println("Resposta Inválida");
                System.out.println("Novo funcionário(1-Sim | 2-Não): ");
                novoFuncionário = s.nextInt();
            }
            if (novoFuncionário == 1) {
                System.out.println("Insira o dia do pagamento: ");
                diaPagamento = s.nextInt();
                while (diaPagamento < 1 && diaPagamento > 30) {
                    System.out.println("Dia inválido");
                    System.out.println("Insira o dia do pagamento: ");
                    diaPagamento = s.nextInt();
                }
            } else if (novoFuncionário == 2) {
                diaPagamento =0;
            }
        }

        System.out.println("Dia de maior produção: " + diaMaiorProd);
        if (producaoManha > producaoTarde) {
            System.out.println("O funcionário produziu mais no período da Manhã");
        } else if (producaoManha < producaoTarde) {
            System.out.println("O funcionário produziu mais no período da Tarde");
        }
        s.close();
    }
}
