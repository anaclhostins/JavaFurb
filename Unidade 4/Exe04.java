import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Entre um número maior que 0: ");
        double valor = s.nextDouble();

        if (valor % 1 != 0) {
            System.out.print("Casas decimais foram digitadas");
        } else {
            System.out.print("Casas decimais não foram digitadas");
        }
        
    }
}
