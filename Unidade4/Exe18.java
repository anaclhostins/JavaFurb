import java.text.DecimalFormat;
import java.util.Scanner;

/*Entrada: dia do vencimento, dia do pagamento, valor da prestação 
 Saída: valor que deve ser pago pelo cliente
 Processo: Ler o dia do vencimento, o dia do pagamento e valor da prestação.
 Se for pago até o dia do pagamento se recebe desconto de 10%
 Se for pago até 5 dias depois do vencimento, paga somente o valor da prestação sem desconto
 Se for pago depois dos 5 dias, se recebe uma multa de 2% para cada dia de atraso.
 */
public class Exe18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.print("Digite o dia do pagamento: ");
        int diaPagamento = s.nextInt();

        System.out.print("Digite o dia do vencimento: ");
        int diaVencimento = s.nextInt();

        System.out.print("Digite o valor da prestação: ");
        double valorPrestacao = s.nextDouble();

        if (diaPagamento <= diaVencimento) {
            double valorFinal = valorPrestacao - (valorPrestacao * 0.1);
            System.out.print("O pagamento está em dia. O valor total foi de R$" + df.format(valorFinal));
        } else if (diaPagamento <= diaVencimento + 5) {
            System.out.print("O pagamento está atrasado. O valor total foi de R$" + df.format(valorPrestacao));
        } else {
            int diasAtraso = diaPagamento - diaVencimento;
            double valorFinal = ((valorPrestacao * 0.02) * diasAtraso) + valorPrestacao;
            System.out.print("O pagamento está atrasado. Multa de 2% por dia de atraso. O valor total foi de R$"
                    + df.format(valorFinal));
        }

        s.close();
    }
}
