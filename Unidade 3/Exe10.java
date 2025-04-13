import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Insira o Cateto Oposto: ");
        double cateto1 = s.nextDouble();

        System.out.print("Insira o Cateto Adjacente: ");
        double cateto2 = s.nextDouble();

        double hipotenusa = Math.sqrt((Math.pow(cateto1,2))+(Math.pow(cateto2,2)));

        System.out.print("O comprimento da hipotenusa é: "+hipotenusa);

        s.close();
    }
}