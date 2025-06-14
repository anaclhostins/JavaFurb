import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        for(int qnt = 0; qnt<20;qnt++){
            System.out.println("Digite um número: ");
            int num = s.nextInt();

            if (num % 2 == 0){
                System.out.println("Par");
            } else {
                System.out.println("Ímpar");
            }
        }
        s.close();
    }
}
