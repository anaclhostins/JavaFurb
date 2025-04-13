import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print ("Escreva valor 1: ");
        double valor1 = s.nextDouble();

        System.out.print("Escreva valor 2: ");
        double valor2 = s.nextDouble();

        if (valor1 > valor2) {
            System.out.println(valor1 + " é maior que " + valor2);
        } else if (valor2>valor1) {
            System.out.print(valor2 + " é maior que " + valor1);
        } else if (valor1 == valor2) {
            System.out.print(valor1 + " é igual a "+ valor2);
        }
        
        s.close();

    }
}
