import java.util.Scanner;

/*Entrada: valor1, valor2 e valor3
 * Saída: Opção 1(ordem crescente), opção 2(ordem decrescente) e opção3(valor maior no meio)
 * Processo: ler o 3 valores, valor
 */
public class Exe24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Insira 3 valores:");
        float valor1 = s.nextFloat();
        float valor2 = s.nextFloat();
        float valor3 = s.nextFloat();

        System.out.println(
                "Escolha uma das opções:\n1-Ordem Crescente \n2-Ordem Decrescente \n3-Valor maior no meio \nQual a opção desejada? ");
        int opcao = s.nextInt();

        float maior = 0, menor = 0, meio = 0;
        if (valor1 > valor2 && valor1 > valor3) {
            maior = valor1;
            if (valor2 > valor3) {
                menor = valor3;
                meio = valor2;
            } else {
                menor = valor2;
                meio = valor3;
            }
        }

        if (valor2 > valor1 && valor2 > valor3) {
            maior = valor2;
            if (valor1 > valor3) {
                menor = valor3;
                meio = valor1;
            } else {
                menor = valor1;
                meio = valor3;
            }
        }

        if (valor3 > valor1 && valor3 > valor2) {
            maior = valor3;
            if (valor2 > valor1) {
                menor = valor1;
                meio = valor2;
            } else {
                menor = valor2;
                meio = valor1;
            }
        }

        switch (opcao) {
            case 1:
                System.out.println(menor + " " + meio + " " + maior);
                break;
            case 2:
                System.out.print(maior + " " + meio + " " + menor);
                break;
            case 3:
                System.out.print(menor + " " + maior + " " + meio);
                break;
            default:
                System.out.print("Inválido");
                break;
        }
        s.close();
    }
}
