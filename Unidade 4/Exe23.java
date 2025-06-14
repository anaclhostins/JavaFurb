import java.util.Scanner;

/*Entrada: número inteiro que representa determinado mês do ano
 * Saída: Mês do ano escrito por extenso
 * Processo: Ler o valor inteiro e escrever por extenso
 */
public class Exe23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Insira o número do mês: ");
        int mes = s.nextInt();

        switch (mes) {
            case 1:
                System.out.print("Janeiro");
                break;
            case 2:
                System.out.print("Fevereiro");
                break;
            case 3:
                System.out.print("Março");
                break;
            case 4:
                System.out.print("Abril");
                break;
            case 5:
                System.out.print("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Inválido");
                break;
        }
    }
}
