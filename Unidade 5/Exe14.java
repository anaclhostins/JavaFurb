import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        String lucro9 = "";
        String lucro10_20 = "";
        String lucro21 = "";
        double compraTotal = 0;
        double vendaTotal = 0;
        double lucroTotal = 0;


        for (int i = 1; i <= 3; i++) {
            System.out.println("Insira o nome do produto: ");
            String nome = s.nextLine();
            System.out.println("Insira o preço de compra: ");
            double valorCom = s.nextDouble();
            System.out.println("Insira o valor de venda: ");
            double valorVen = s.nextDouble();

            compraTotal += valorCom;
            vendaTotal += valorVen;
            lucroTotal += (valorVen - valorCom);

            double margMerc = ((valorVen - valorCom) / valorCom) * 100;
            if (margMerc < 10) {
                lucro9 += nome + ", ";
            } else if (margMerc >= 10 && margMerc <= 20) {
                lucro10_20 += nome + ", ";
            } else if(margMerc > 20) {
                lucro21 += nome + ", ";
            }

            s.nextLine();
        }

        /*if (!lucro9.isEmpty()){
            lucro9 = lucro9.substring(0, lucro9.length() - 2);
        } else {
            lucro21 = "0";
        }
        if (!lucro10_20.isEmpty()){
            lucro10_20 = lucro10_20.substring(0, lucro10_20.length() - 2);
        } else {
            lucro21 = "0";
        }
        if (!lucro21.isEmpty()){
            lucro21 = lucro21.substring(0, lucro21.length() - 2);
        } */
        System.out.println(
                "Valor de compra total: R$" + df.format(compraTotal) + "\nValor de venda total: R$"
                        + df.format(vendaTotal) + "\nLucro total: R$" + df.format(lucroTotal));
        if (!lucro9.isEmpty()){
            lucro9 = lucro9.substring(0, lucro9.length() - 2);
            System.out.println("As mercadorias com menos de 10%: " + lucro9);
        } 
        if (!lucro10_20.isEmpty()){
            lucro10_20 = lucro10_20.substring(0, lucro10_20.length() - 2);
            System.out.println("Com 10% até 20% de lucro são: " + lucro10_20);
        } 
        if (!lucro21.isEmpty()){
            lucro21 = lucro21.substring(0, lucro21.length() - 2);
            System.out.println("Com lucro maior que 20% são: " + lucro21);
        }

        /*System.out.println("As mercadorias com menos de 10%: " + lucro9
                        + "\nCom 10% até 20% de lucro são: " + lucro10_20 + " \nCom lucro maior que 20% são: "
                        + lucro21);*/

        s.close();
    }
}
