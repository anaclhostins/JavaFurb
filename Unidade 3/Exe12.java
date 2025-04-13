import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.print("Insira o nome do funcionário: ");
        String nome = s.nextLine();

        System.out.print("Insira as horas trablhadas: ");
        double horas = s.nextDouble();

        System.out.print("Insira o número de dependentes: ");
        double dependentes = s.nextDouble();

        double salarioTrabalho = horas*10;
        double salarioBruto = salarioTrabalho+(dependentes*60);
        double salarioLiquido = salarioBruto - (salarioTrabalho*0.135);

        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.print("O funcionário " + nome + " possui um salário bruto de R$" +
        df.format(salarioBruto)+ " e um salário líquido de R$" + df.format(salarioLiquido)); 


        s.close();

    }
}