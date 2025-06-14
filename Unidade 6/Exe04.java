import java.util.Scanner;

public class Exe04 {
    public Exe04() {
        Scanner teclado = new Scanner(System.in);
        int valores1[] = new int[3];
        int valores2[] = new int[3];
        int somaValores[] = new int[3];

        System.out.println("Insira os valores do primeiro Vetor: ");
        ler(valores1, teclado);
        System.out.println("Insira os valores do segundo Vetor: ");
        ler(valores2, teclado);
        soma(somaValores, valores1, valores2);
        System.out.println("Valores primeiro Vetor: ");
        escrever(valores1);
        System.out.println("Valores segundo Vetor: ");
        escrever(valores2);
        System.out.println("Valores Soma Vetores: ");
        escrever(somaValores);
        teclado.close();
    }

    public static void main(String[] args) {
        new Exe04();
    }

    private void ler(int[] valores, Scanner teclado) {
        for (int i = 0; i < valores.length; i++) {
            valores[i] = teclado.nextInt();
        }
    }

    private int[] soma(int[] soma, int[] valores1, int[] valores2) {
        for (int i = 0; i < valores1.length; i++) {
            soma[i] = valores1[i] + valores2[i];
        }
        return soma;
    }

    private void escrever(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
    }
}