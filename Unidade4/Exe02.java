import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Entre com um valor inteiro maior que 0: ");
        double valor = s.nextDouble();

        if (valor % 2 == 0) {
            System.out.print("Número é par");
        } else {
            System.out.print("Número é ímpar");
        }
        s.close();
    }
}
