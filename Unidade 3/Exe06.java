import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Insira o peso do prato em kg: ");
        double peso = s.nextDouble();

        double pesoFinal = (peso-0.75)*25;

        DecimalFormat df = new DecimalFormat("#0.00");


        System.out.print("O cliente deve pagar R$"+df.format(pesoFinal));

        s.close();

    }
}
