import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe as 3 cartas: ");
        int carta1 = s.nextInt();
        int carta2 = s.nextInt();
        int carta3 = s.nextInt();

        int cartasBoas = 0;
        if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
            cartasBoas += 1;
        }
        if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
            cartasBoas = cartasBoas + 1;
        }
        if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
            cartasBoas = cartasBoas++;
        }

        if (cartasBoas == 1){
            System.out.print("Truco");
        } else if (cartasBoas == 2){
            System.out.print("Seis");
        } else if (cartasBoas == 3){
            System.out.print("Nove");
        }
    }
}