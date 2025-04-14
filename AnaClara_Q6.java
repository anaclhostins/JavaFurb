import java.text.DecimalFormat;
import java.util.Scanner;

public class AnaClara_Q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.print("Insira a hora de início: ");
        int horaIn = s.nextInt();
        System.out.print("Insira o minuto de início: ");
        int minutoIn = s.nextInt();

        System.out.print("Insira a hora de fim: ");
        int horaFim = s.nextInt();
        System.out.print("Insira o minuto de fim: ");
        int minutoFim = s.nextInt();

        
        if (horaIn > 0 && horaIn < 23 && minutoIn >= 0 && minutoIn < 60 && horaFim > 0 && horaFim < 23 && minutoFim >= 0
        && minutoFim < 60) {
            int totalIn = horaIn * 60 + minutoIn;
            int totalFim = horaFim * 60 + minutoFim;
            int minutosTo = totalFim - totalIn;
            
            int horasCobradas;
            horasCobradas = minutosTo / 60;
            int resto = minutosTo % 60;
            
            if (resto > 30) {
                horasCobradas = horasCobradas + 1;
            }

            System.out.print("O temopo de montagem foi de " + horasCobradas + " horas");

            /*
             * No switch case do fluxograma possui um erro nos valores.
             * Para 1h ou 2h é 25*h
             * Para 3h ou 4h é 50 + 15,50*(h-2)
             * Para 5 ou mais é 81 + 10*(h-4)
             */
            double preco = 0;
            switch (horasCobradas) {
                case 1:
                    preco = 25 * horasCobradas;
                    break;
                case 2:
                    preco = 25 * horasCobradas;
                    break;
                case 3:
                    horasCobradas = horasCobradas - 2;
                    preco = 50 + (15.50 * horasCobradas);
                    break;
                case 4:
                    horasCobradas = horasCobradas - 2;
                    preco = 50 + (15.50 * horasCobradas);
                    break;
                default:
                    horasCobradas = horasCobradas - 4;
                    preco = 81 + (10 * horasCobradas);
                    break;
            }

            System.out.println(" e valor a ser pago é R$" + df.format(preco));
        } else {
            System.out.println("Horário inválido.");
        }
        s.close();
    }
}
