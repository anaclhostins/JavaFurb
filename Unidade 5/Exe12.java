import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Escreva o número de linhas: ");
        int n = s.nextInt();
        
        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println(" ");
        }
        s.close();
    }
}
