import java.text.DecimalFormat;

public class Exe22 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#0.00");
        double salario = 2000;
        double aumento = 1.5;
        int anoInicial = 1996;
        int anoAtual = 2025; 

        while (anoInicial <= anoAtual) {
            salario = salario+(salario*(aumento/100));
            aumento *= 2; 
            anoInicial++;
        }

        System.out.println("O salário final é de: " + df.format(salario));
    }
}
