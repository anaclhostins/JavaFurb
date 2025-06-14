import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        double valorTotal =0;
        System.out.println("Insira o valor da compra: ");
        double valorCompra = s.nextDouble();

        while (valorCompra != 0) {
            double valorPagar = 0;
            if (valorCompra > 500) {
                 valorPagar = valorCompra * 0.80;
            } else if (valorCompra <= 500) {
                valorPagar = valorCompra * 0.85;
            }
            System.out.println("O valor a pagar é: " + df.format(valorPagar));
            valorTotal += valorPagar;
            System.out.println("Insira o valor da compra: ");
            valorCompra = s.nextDouble();
        }
        System.out.println("O valor total recebido foi de " +  df.format(valorTotal));
        s.close();
    }
}
