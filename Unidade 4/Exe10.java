import java.util.Scanner;

/*Entrada: Idade marquinhos, idade zezinho, idade luluzinha
 * Saída: o filho caçula
 */

public class Exe10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Escreva idade de Marquinhos: ");
        int marquinhos = s.nextInt();
        
        System.out.print("Escreva idade de Zezinho: ");
        int zezinho = s.nextInt();
        
        System.out.print("Escreva idade de Luluzinha: ");
        int luluzinha = s.nextInt();

        if (marquinhos>zezinho && zezinho>luluzinha){
            System.out.print("Luluzinha é a caçula");
        } else if (marquinhos<zezinho && zezinho<luluzinha){
            System.out.print("Marquinhos é o caçula");
        } else {
            System.out.print("Zezinho é a caçula");
        }
    }
}