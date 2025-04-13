import java.text.DecimalFormat;
import java.util.Scanner;
/*Entrada: massa do indivíduo e altura
 * Saída: IMC e grau de obesidade
 * Processo: ler os valores de massa e altura, 
 * calcular o IMC (massa/altura^2), transformar do IMC para o grau
 * de obesidade e escrever o grau de obesidade
 */
public class Exe21 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.println("Insira a massa em Kg: ");
        double massa = s.nextDouble();

        System.out.println("Insira a altura em M: ");
        double altura = s.nextDouble();

        double imc = massa/Math.pow(altura, 2);

        String obesidade; 
        if (imc < 18.5){
            obesidade = "Magreza";
        } else if (imc <= 24.9) {
            obesidade = "Saúdavel";
        } else if (imc <= 29.9) {
            obesidade = "Sobrepeso";
        } else if (imc <= 34.9) {
            obesidade = "Obesidade Grau I";
        } else if (imc <= 39.9) {
            obesidade = "Obesidade Grau II I(severa)";
        } else {
            obesidade = "Obesidade Grau III (Mórbida)";
        }
        
        System.out.print(obesidade);

        s.close();
    }
}
