import java.util.Scanner;

public class Exe32 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o dia em que começa o mês: ");
        int p = teclado.nextInt();

        while (p < 0 || p > 7) {
            System.out.println("Dia inválido. Insira novamente: ");
            p = teclado.nextInt();
        }

        System.out.println("Insira o número de dias do mês: ");
        int n = teclado.nextInt();
        while (n <= 29 || n > 32) {
            System.out.println("Dias inválidos. Insira novamente");
            p = teclado.nextInt();
        }

        System.out.println("Dom Seg Ter Qua Qui Sex Sab");
        if (p > 1) {
            for (int i = 0; i < p; i++) {
                System.out.print("  ");
            }
        }
        int dia = 1;
        int diaSemana = p;
        while (dia <= n) {
            System.out.printf("%3d ", dia);
            if (diaSemana == 7) {
                System.out.println();
                diaSemana = 1;
            } else {
                diaSemana++;
            }
            dia++;
        }
        teclado.close();
    }
}