import java.util.Scanner;

public class Exe26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int acimaValor = 0;
        int trechos = 0;
        int acima150km = 0;
        double valor = 0;
        double distancia = 0;

        System.out.println("Insira o valor máximo do pedágio: ");
        double valorMaximo = s.nextDouble();
        System.out.println("Digite o valor do pedágio: ");
        valor = s.nextDouble();
        while (valor >= 0) {
            System.out.println("Insira a distância: ");
            distancia = s.nextDouble();
            trechos++;
            if (valor >= valorMaximo) {
                acimaValor++;
            } else if (valor < valorMaximo && distancia > 150) {
                acima150km++;
            }
            System.out.println("Digite o valor do pedágio: ");
            valor = s.nextDouble();
        }

        System.out.println("Trechos acima do valor: " + acimaValor);
        System.out.println("Trechos informados: " + trechos);
        System.out.println("Trechos acima de 150 com valor aceito: " + acima150km);
        s.close();
    }
}