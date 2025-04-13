import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);

        System.out.print("Insira o Raio: ");
        double raio = s.nextDouble();

        System.out.print("Insira a Altura: ");
        double altura = s.nextDouble();

        double volume = (3.14159*(Math.pow(raio,2))*altura);

        System.out.print("O volume da lata de óleo é"+ volume);

        s.close();

    }
    
}
