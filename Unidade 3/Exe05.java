import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Insira o número de frangos: ");
        double nmrFrangos = s.nextDouble();

        double gastos = (nmrFrangos*4)+(2*(nmrFrangos*3.5));
        
        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.print("O valor total de gastos é de R$"+df.format(gastos));
    }
}
