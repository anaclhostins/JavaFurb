import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double altura = 0;
        double somaAltura = 0;

        for (int i = 0; i < 20;i++) {
            System.out.println("Escreva a altura:");
            altura = s.nextDouble();
            somaAltura = somaAltura + altura;
        }

        double alturaMedia = somaAltura/20;

        System.out.println("A média de alturas é:" + alturaMedia);

        s.close();

    }   
}
