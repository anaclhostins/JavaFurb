import java.util.Scanner;


public class Exe11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Insira a temperatura em °C: ");
        double tempGraus = s.nextDouble();

        double tempF = (9* tempGraus/5) + 32;

        System.out.print("O valor convertido para °F é: "+ tempF);

        s.close();

    }
}