import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.print("Digite o comprimento em metros: ");
        double comprimento = s.nextDouble();

        System.out.print("Digite a altura em metros: ");
        double altura = s.nextDouble();

        double area = comprimento*altura;
        double azulejo = area * 9;
        double valor = azulejo*12.50;

        DecimalFormat df = new DecimalFormat("#0.00");
        System.out.print("O valor total é de R$"+ df.format(valor));
    
        s.close();
    }
}