import java.util.Scanner;

public class Exe18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int canal4 = 0;
        int canal5 = 0;
        int canal9 = 0;
        int canal12 = 0;
        int totalTele = 0;

        System.out.println("Insira o canal assistido: ");
        int canal = s.nextInt();
        while (canal != 0) {
            int pessoasVendo = 0;
            switch (canal) {
                case 4:
                    System.out.println("Insira o número de pessoas assistindo");
                    pessoasVendo = s.nextInt();
                    canal4 += pessoasVendo;
                    totalTele += pessoasVendo;
                    break;
                case 5:
                    System.out.println("Insira o número de pessoas assistindo");
                    pessoasVendo = s.nextInt();
                    canal5 += pessoasVendo;
                    totalTele += pessoasVendo;
                    break;
                case 9:
                    System.out.println("Insira o número de pessoas assistindo");
                    pessoasVendo = s.nextInt();
                    canal9 += pessoasVendo;
                    totalTele += pessoasVendo;
                    break;
                case 12:
                    System.out.println("Insira o número de pessoas assistindo");
                    pessoasVendo = s.nextInt();
                    canal12 += pessoasVendo;
                    totalTele += pessoasVendo;
                    break;
                default:
                    System.out.println("Canal Inválido");
                    break;
            }

            System.out.println("Insira o canal assistido: ");
            canal = s.nextInt();
        }

        double percent4 = (canal4 * 100) /totalTele;
        double percent5 = (canal5 *100) /totalTele;
        double percent9 = (canal9 *100) / totalTele;
        double percent12 = (canal12 *100) / totalTele;

        System.out.println("O percentual de audiência do canal 4 é: " + percent4
                + "\nO percentual de audiência do canal 5 é: " + percent5 
                + "\nO percentual de audiência do canal 9 é:  " + percent9
                + "\nO percentual de audiência do canal 9 é:  " + percent12);

        s.close();
    }
}