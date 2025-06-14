import java.util.Scanner;

public class Exe30 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Insira o valor de N: ");
        int n = s.nextInt();

        System.out.println("Insira o valor de K: ");
        int k = s.nextInt();

        System.out.println("Insira o valor de M: ");
        int m = s.nextInt();

        int atual = n;
        int somaMochila = 0;
        int somaFora = 0;

        String elementos = "";
        String entrou = "";
        String fora = "";

        while (atual>0){
            elementos += atual + " ";

            if (somaMochila + atual <= m) {
                somaMochila += atual;
                entrou += atual + " ";
            } else {
                somaFora += atual;
                fora += atual + " ";
            }
            atual -= k;
        }
        System.out.println("\nElementos a serem colocados: " +  elementos);
        System.out.println("Elementos na mochila: " + entrou);
        System.out.println("Elementos fora: " + fora);
        System.out.println("Soma dos elementos dentro da mochila: " + somaMochila);
        System.out.println("Soma dos elementos fora da mochila: " + somaFora);
        s.close();
    }
}