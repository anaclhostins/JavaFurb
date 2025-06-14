import java.util.*;

public class Exe09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Insira dois números inteiros: ");
        double nmr1 = s.nextDouble();
        double nmr2 = s.nextDouble();

        if (nmr1 % nmr2 == 0) {
            System.out.print("Os valores são múltiplos");            
        } else if (nmr2 % nmr1 == 0) {
            System.out.print("Os números são múltiplos");
        } else {
            System.out.print("Os números não são múltiplos");
        }

        s.close();
    }
}