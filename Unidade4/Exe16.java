
import java.util.Scanner;

/*Entrada: idade do homem mais velho, idade do homem mais novo, idade mulher mais novo e idade mulher mais nova
 * Saída:  soma das idades da mulher mais nova e do homem mais velho, e produto das idades da mulher mais velha e o hommem mais novo
 * Processo: Ler as idades, comparar idade das mulher  e comparar idade homens, definir os mais velhos e mais novos, somar a idade da mulher mais nova e do homem mais velho 
 * e multiplicar a idade do homem mais nova pela idade da mulher mais velha.
 * Escrever a soma e o produto
 */

public class Exe16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Escreva a idade dos homens: ");
        int idadeHomem1 = s.nextInt();
        int idadeHomem2 = s.nextInt();

        System.out.println("Escreva a idade das mulheres: ");
        int idadeMulher1 = s.nextInt();
        int idadeMulher2 = s.nextInt();

        int homemV, homemN;
        if (idadeHomem1 > idadeHomem2) {
            homemV = idadeHomem1;
            homemN = idadeHomem2;
        } else {
            homemV = idadeHomem2;
            homemN = idadeHomem1;

        }

        int mulherV, mulherN;
        if (idadeMulher1 > idadeMulher2) {
            mulherV = idadeMulher1;
            mulherN = idadeMulher2;
        } else {
            mulherV = idadeMulher2;
            mulherN = idadeMulher1;
        }

        int soma = homemV + mulherN;
        int produto = homemN * mulherV;

        System.out.print("Soma: " + soma + " Produto: " + produto);

        s.close();
    }
}