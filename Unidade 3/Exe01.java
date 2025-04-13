

import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a largura em metros: ");
        double largura = s.nextDouble ();

        System.out.println("Digite o comprimento em metros: ");
        double comprimento = s.nextDouble();

        double area = largura*comprimento;

        System.out.println("A área do terreno é: "+area);;

        s.close();
        }
}
