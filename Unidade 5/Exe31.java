import java.util.Scanner;

public class Exe31 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Insira um valor: ");
        int valor = s.nextInt();

        int divisor = 2;
        while (valor > 1) {
            if (valor % divisor == 0) {
                valor = valor / divisor;
                System.out.println("Número: " + valor);
                System.out.println("Divisor: " + divisor);
            } else {
                divisor++;
            }
        }
        s.close();
    }
}