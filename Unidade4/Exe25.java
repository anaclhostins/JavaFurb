/*Entrada: valor 1, valor 2 e opção
 * Saída: soma dos valores, diferença do valores, produto dos valores e divisão dos valores
 * Processo: ler os valores, ler a opção.
 * Se for o caso 1, somam (valor1+valor2) e escreve a soma
 * Se for o caso 2, subtrai (valor1-valor2) e escreve a diferença
 * Se for o caso 3, multiplica (valor1*valor2) e escreve o produto
 * Se for caso 4, divide (valor1/valor2) e escreve a divisão
 */

import java.util.Scanner;

public class Exe25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite valor 1: ");
        double valor1 = s.nextDouble();

        System.out.print("Digito o valor 2: ");
        double valor2 = s.nextDouble();

        System.out.println("Escolha uma opção: \n1-Soma de dois números\n2-Diferença entre dois números\n3-Produto entre dois números\n4-Divisão entre dois números");
        int opcao = s.nextInt();

        switch (opcao) {
            case 1:
                double soma = valor1+valor2;
                System.out.print(soma);
                break;
            case 2:
                double diferenca = valor1-valor2;
                System.out.print(diferenca);
                break;
            case 3:
                double produto = valor1*valor2;
                System.out.print(produto);
                break;
            case 4: 
                if (valor2==0){
                    System.out.println("O denominador não pode ser zero");
                } else {
                    double divisao = valor1/valor2;
                    System.out.print(divisao);
                }
                break;
            default:
                System.out.print("ERRO");
                break;
        }

        s.close();
    }
}
