import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Insira a quantidade de termos desejada: ");
        int n = s.nextInt();


        if (n <= 2) {
            System.out.println("O valor deve ser maior de 2.");
        } else {
            int num = 8;
            int potencia = 3;

            System.out.println(num);
            
            for (int i = 2; i <= n; i++) {
                if (i % 2 == 0) {
                    num = num + 2;
                    System.out.println(num);;
                } else {
                    potencia++;
                    num = (int) Math.pow(2, potencia);
                    System.out.println(num);
                }
            }
        }
    }
}
