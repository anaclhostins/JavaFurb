import java.text.DecimalFormat;
import java.util.Scanner;
/*Entrada: renda anual, qtn de dependentes
 * Saída: Valor do imposto
 * Processo: ler a renda e a qnt de dependentes. Se a renda líquida for >=2000, escreve "Não paga imposto".
 * Se a renda líquida for >=5000, o imposto é de 5%, então multiplica a renda por 0.05 e imprimi o valor do imposto
 * Se a renda líquida for >=10000, o imposto é de 10%, então multiplica a renda por 0.1 e imprimi o valor do imposto
 * Se a renda líquida for <10000, o imposto é de 15%, então multiplica a renda por 0.15 e imprimi o valor do imposto
 * Caso houver dependente se recebe desconto de 2%, entao multiplica a renda por 0.02 e diminui do valor do IR o desconto
 */

public class Exe17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Insira o valor da renda líquida: ");
        int renda = s.nextInt();

        System.out.print("Insira o número de dependentes: ");
        int nmrDependentes = s.nextInt();

        DecimalFormat df = new DecimalFormat("#0.00");

        double ir;
        double desconto = 0;
        if (renda<=2000) {
            System.out.print("Não paga imposto");
        } else if (renda <= 5000){
            ir = (renda*0.05);
            desconto = ir -((ir*0.02)*nmrDependentes);
            System.out.print("O imposto é 5%: R$" + df.format(desconto));
        } else if (renda <= 10000){
            ir = (renda*0.1)-desconto;
            desconto = ir -((ir*0.02)*nmrDependentes);
            System.out.print("O imposto é 10%: R$" + df.format(desconto));
        } else {
            ir = (renda*0.15)-desconto;
            desconto = ir -((ir*0.02)*nmrDependentes);
            System.out.print("O imposto é 15%: R$" + df.format(desconto));
        }

        s.close();
    }
}