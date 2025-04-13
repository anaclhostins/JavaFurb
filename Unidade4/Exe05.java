import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.println("A cor é azul?");
        boolean resposta = s.nextBoolean();

        if (resposta) {
            System.out.print ("Sim");
        } else {
            System.out.print ("Não");
        }
        s.close();
    }

}
