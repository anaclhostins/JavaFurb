import java.util.Scanner;

public class Exe06 {
    public Exe06() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o tamanho de n");
        int n = teclado.nextInt();
        double[] valores = new double[n];
        ler(valores, teclado);

        System.out.println("Insira o valor a ser encontrado no vetor:");
        double valorEncontrar = teclado.nextDouble();

        if (encontrarValor(valores, valorEncontrar) == true) {
            System.out.println("Valor encontrado");
        } else {
            System.out.println("Valor não encontrado");
        }

        teclado.close();
    }

    public static void main(String[] args) {
        new Exe06();
    }

    private void ler(double[] valores, Scanner teclado) {
        for (int i = 0; i < valores.length; i++) {
            valores[i] = teclado.nextInt();
        }
    }

    private boolean encontrarValor(double[] valores, double valorEncontrar) {
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == valorEncontrar) {
                return true;
            }
        }
        return false;
    }

}
