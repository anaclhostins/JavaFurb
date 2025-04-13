
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.print("Insira a hora de entrada: ");
        int horaEn = s.nextInt();
        System.out.print("Insira o minuto de entrada: ");
        int minutoEn = s.nextInt();

        System.out.print("Insira a hora de saída: ");
        int horaSa = s.nextInt();
        System.out.print("Insira o minuto de saída: ");
        int minutoSa = s.nextInt();

        if (horaEn < 0 || horaEn > 23 || minutoEn < 0 || minutoEn > 59 ||
            horaSa < 0 || horaSa > 23 || minutoSa < 0 || minutoSa > 59) {
            System.out.println("Horário inválido.");
            return;
        }

        int minutoEnTo = horaEn * 60 + minutoEn;
        int minutoSaTo = horaSa * 60 + minutoSa;

        if (minutoSaTo <= minutoEnTo) {
            System.out.println("Horário de saída deve ser depois da entrada.");
            return; // Usado para interromper o método
        }

        int minutosTo = minutoSaTo - minutoEnTo;
        int horasCobradas;

        if (minutosTo < 30) {
            horasCobradas = 1;
        } else {
            int resto = minutosTo % 60;
            horasCobradas = minutosTo / 60;

            if (resto >= 30) {
                horasCobradas++;
            }
        }

            double preco = 0;
            switch (horasCobradas) {
                case 1:
                    preco = 5 * horasCobradas;
                    break;
                case 2:
                    preco = 5 * horasCobradas;
                    break;
                case 3:
                    horasCobradas = horasCobradas - 2;
                    preco = 10 + (7.5 * horasCobradas);
                    break;
                case 4:
                    horasCobradas = horasCobradas - 2;
                    preco = 10 + (7.5 * horasCobradas);
                    break;
                default:
                    horasCobradas = horasCobradas - 4;
                    preco = 25 + (10 * horasCobradas);
                    break;
            }
            System.out.println("O valor a ser pago é R$" + df.format(preco));

            s.close();
    

        /*
         * if (horasTo == 1){
         * preco = 5 * horasTo;
         * } else if (horasTo == 2){
         * preco = 5 * horasTo;
         * } else if (horasTo == 3) {
         * horasTo = horasTo-2;
         * preco = 10 + (7.5 * horasTo);
         * } else if (horasTo == 4){
         * horasTo = horasTo-2;
         * preco = 10 + (7.5*horasTo);
         * } else {
         * horasTo = horasTo - 4;
         * preco = 25 + (10 * horasTo);
         * }*/
        

    }
}