import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Entre com as horas trabalhadas no  mês: ");
        int horasMes = s.nextInt();

        System.out.print("Entre com o valor pago com hora: ");
        double horasValor = s.nextDouble();

        double salarioTotal = horasValor*horasMes;

        if (horasMes > 160) {
            double salarioExtra = (horasMes-160) * (horasValor/2);
            salarioTotal = salarioTotal + salarioExtra;
        }

        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.print("O salário total é R$" + df.format(salarioTotal));

    }
}
