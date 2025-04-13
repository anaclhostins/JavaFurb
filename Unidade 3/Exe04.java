import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Insira a nota 1: ");
        double nota1 = s.nextDouble();

        System.out.print("Insira a nota 2: ");
        double nota2 = s.nextDouble();

        System.out.print("Insira a nota 3: ");
        double nota3 = s.nextDouble();

        double mediaPonderada = ((nota1*5)+(nota2*3)+(nota3*2))/10;

        System.out.print("A média ponderada é "+mediaPonderada);

        s.close();
    }
}
