import java.util.Scanner;

public class Exe03 {
    public Exe03() {
        Scanner teclado = new Scanner(System.in);
        double[] valores = new double[12];

        System.out.println("Insira os valores do Vetor: ");
        ler(valores, teclado);
        aumento(valores);
        System.out.println("Valores com aumento: ");
        escrever(valores);
        teclado.close();
    }

    public static void main(String[] args) {
        new Exe03();
    }

    private void ler(double[] valores, Scanner teclado) {
        for (int i = 0; i < valores.length; i++) {
            valores[i] = teclado.nextDouble();
        }
    }

    private double[] aumento(double[] valores) {
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % 2 == 0) {
                valores[i] = valores[i] * 1.2;
            } else if (valores[i] % 2 != 0) {
                valores[i] = valores[i] * 1.5;
            }
        }
        return valores;
    }

    private void escrever(double[] valores) {
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
    }

}
