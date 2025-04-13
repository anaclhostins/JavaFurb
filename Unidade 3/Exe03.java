import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Insira o valor da gasolina: ");
        double valorDaGasolina = s.nextDouble();

        System.out.print("Insira o valor do pagamento: ");
        double pagamento = s.nextDouble();

        double gasolinaLitros = pagamento/valorDaGasolina;

        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.println("A quantidade gasolina colocada é de "+ df.format(gasolinaLitros)+ " litros");

        s.close();

    }
}