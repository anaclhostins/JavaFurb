import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int somaPar = 0;
        int somaImpar = 0;
        for(int numero = 1; numero <= 100;numero++) {
            if(numero % 2 == 0){
                somaPar = somaPar+numero;
            } else {
                somaImpar += numero;
            }
        }
        System.out.println("Ímpares: " + somaImpar);
        System.out.println("Pares: " + somaPar);
    }
}
