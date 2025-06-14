import java.util.Scanner;

public class Exe07 {
    public Exe07() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o tamanho do vetor:");
        int n = teclado.nextInt();
        int[] valores = new int[n];
        

        ler(valores, teclado);
        escrever(valores);
        ordenar(valores);
        System.out.println("Valores ordenados: ");
        escrever(valores);

        teclado.close();
    }

    public static void main(String[] args) {
        new Exe07();
    }

    private void ler(int[] valores, Scanner teclado) {
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Insira o valor da posição " + i + ": ");
            int valor = teclado.nextInt();
            while (buscar(valores, valor) == true) {
                System.out.println("Valor já existente. Tente novamente");
                valor = teclado.nextInt();
            }
            valores[i] = valor;
        }
    }

    private boolean buscar(int[] valores, int valor) {
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == valor) {
                return true;
            }
        }
        return false;
    }

    private void escrever(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
    }

    private void ordenar(int[] valores) {
        for (int i = 0; i < valores.length-1; i++) {
            for (int j = 0; j < valores.length - 1 - i; j++) {
                // Para ser decrescente, deve se mudar o sinal 
                if (valores[j] > valores[j + 1]) {
                    int aux = valores[j];
                    valores[j] = valores[j + 1];
                    valores[j + 1] = aux;
                }
            }
        }
    }

}
