import java.text.DecimalFormat;
import java.util.Scanner;
/*Entrada: notaProva1,notaProva2, notaProva3 e notaExercicios
 * Saída: Média de aproveitamento, conceito e mensagem "Aprovado" ou "Reprovado"
 * Processo: ler as 3 notas, calcular  a media ((notaProva1+notaProva2*2+notaProva3*3+notaExercicios)/7)
 * transformar a média em conceito e 
 * escrever a mensagem "Aprovado" se conceito for A,B ou C e "Reprovado" caso for D ou E 
 * */

public class Exe20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Insira a nota 1, nota 2, nota 3 e a nota dos Exercícios: ");
        double notaProva1 = s.nextDouble();
        double notaProva2 = s.nextDouble();
        double notaProva3 = s.nextDouble();
        double notaExercicios = s.nextDouble();

        double media = (notaProva1+notaProva2*2+notaProva3*3+notaExercicios)/7;
        DecimalFormat df = new DecimalFormat("#0.00");

        char conceito;
        if (media>=9){
            conceito = 'A';
        } else if (media>=7.5){
            conceito = 'B';
        } else if (media>=6){
            conceito = 'C';
        } else if (media>=4){
            conceito = 'D';
        } else {
            conceito = 'E';
        }

        String mensagem;
        if (conceito == 'A' || conceito == 'B' || conceito == 'C'  ){
           mensagem = "Aprovado";
        } else {
            mensagem = "Reprovado";
        }

        System.out.print("A média de aproveitamento é: " + df.format(media)+" Conceito: " + conceito + " " + mensagem);
        
        s.close();
    }
}
