import java.util.Scanner;

public class Exe02 {
    public Exe02() {
        Scanner s = new Scanner(System.in);
        double valores[] = new double[3];
        System.out.println("Insira os valores do vetor: ");
        ler(valores, s);
        double media = mediaValores(valores);
        acimaMedia(valores, media);
        s.close();
    }

    public static void main(String[] args) {
        new Exe02();
    }

    private void ler(double valores[], Scanner s) {
        for (int i = 0; i < valores.length; i++) {
            valores[i] = s.nextDouble();
        }
    }

    private double mediaValores(double valores[]) {
        double soma = 0;
        double media = 0;
        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }  
        media = (soma / valores.length);
        System.out.println("Média valores: " + media);
        return media;
    }

    private void acimaMedia(double[] valores, double media) {
        System.out.println("Valores acima da média: ");
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > media) {
                System.out.println(valores[i]);
            }
        }
    }
}
