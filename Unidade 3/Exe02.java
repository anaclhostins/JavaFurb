import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Insira o valor do sapato: ");
        double valorSapato = s.nextDouble();

        double desconto = valorSapato*0.12;
        double valorDesconto = valorSapato-desconto;

        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.println("O valor do desconto é de R$"+ df.format(desconto));
        System.out.println("O preço do par de sapatos com desconto é R$" + df.format(valorDesconto));

        s.close();
    }
}
