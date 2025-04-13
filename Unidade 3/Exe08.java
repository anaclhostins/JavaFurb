import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Insira o valor em dólares: ");
        double valorDolar = s.nextDouble();

        System.out.print("Insira a cotação: ");
        double cotacao = s.nextDouble();

        double valorReais = valorDolar*cotacao;

        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.print("O valor devolvido ao cliente deve ser de R$"+df.format(valorReais));

        s.close();
    }
}
