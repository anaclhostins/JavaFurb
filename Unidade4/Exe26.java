import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe26 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.print("Escolha uma opção:");
        System.out.print("\nT-calcular a área de um triângulo de base b e altura h.");
        System.out.print("\nQ-calcular a área de um quadrado de lado l.");
        System.out.print("\nR- calcular a área de um retângulo de base b e altura h.");
        System.out.println("\nC- calcular a área de um círculo de raio r.");
        char opcao = s.nextLine().toUpperCase().charAt(0);

        switch (opcao) {
            case 'T':
                System.out.println("Digite a base e altura do triângulo:");
                double baseT = s.nextDouble();
                double alturaT = s.nextDouble();
                double areaT = baseT*alturaT/2;
                System.out.print("Área do triângulo: " + areaT);
                break;
            case 'Q':
                System.out.println("Digite o lado do quadrado:");
                double lado = s.nextDouble();
                double areaQ = Math.pow(lado, 2);
                System.out.print("Área do Quadrado: " + areaQ);
                break;
            case 'R':
                System.out.println("Digite a base e altura do retangulo:");
                double baseR = s.nextDouble();
                double alturaR = s.nextDouble();
                double areaR = baseR*alturaR;
                System.out.print("Área do triângulo: " + areaR);
                break;
            case 'C':
                System.out.println("Digite o raio: ");
                double raio = s.nextDouble();
                double areaC = Math.PI*Math.pow(raio, 2);
                System.out.print("Área do Círculo: " + df.format(areaC));
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }

        s.close();

    }
}