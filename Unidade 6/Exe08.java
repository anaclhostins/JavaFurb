import java.util.Scanner;

public class Exe08 {
    public Exe08() {
        Scanner s = new Scanner(System.in);

        System.out.println("Insira o tamanho do valor: ");
        int n = s.nextInt();
        while (n < 0 || n > 20){
            System.out.println("Valor máximo é 20. Insira tamanho novamente!");
            n = s.nextInt();
        }
        double vetor[] = new double[n];
        
        ler(vetor, s);
        tabela(vetor);
    }

    public static void main(String[] args) {
        new Exe08();
    }

    private void ler(double[] valores, Scanner teclado) {
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Insira o valor da posição " + i + ": ");
            valores[i] = teclado.nextInt();
        }
    }

    private void tabela(double[] valores) {
        boolean[] ValorEncontrado = new boolean[valores.length];
        for (int i = 0; i < valores.length; i++) {

            if (!ValorEncontrado[i]) {
                double valor = valores[i];
                int contagem = 1;

                for (int j = i + 1; j < valores.length; j++) {
                    if (valores[j] == valor) {
                        contagem++;
                        ValorEncontrado[j] = true;
                    }
                }
                System.out.println(valor + "\t|\t" + contagem);
            }
        }
    }
}