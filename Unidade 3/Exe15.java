import java.util.Scanner;


public class Exe15 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.print("Digite um número de até 3 dígitos: ");
        int num = s.nextInt();

        int cent = num /100;
        num = num % 100;
        int dez = num / 10;
        num = num % 10;
        int uni = num/1;

        System.out.print("O numero " + " possui " + cent + " centenas " + dez + " dezenas " + uni + " unidades.");

        s.close();
        
}
}