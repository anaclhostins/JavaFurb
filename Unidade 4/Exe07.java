import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Entre com o peso da carta: ");
        double peso = s.nextDouble();

        double valorAPagar = 0;

        if (peso <= 50) {
            valorAPagar = 0.45;
        } else {
            double pesoExcedido = peso - 50;
            double qntAdicional = (pesoExcedido / 20) + 1;
            valorAPagar = 0.45f + 0.45f * qntAdicional;
        }

        DecimalFormat df = new DecimalFormat("#0.00");
        System.out.print("Valor a pagar R$" + df.format(valorAPagar));

        s.close();
    }
}
