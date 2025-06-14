import java.util.Scanner;
/*Entrada: meses que foi admitido
 * Saída: Valor do reajuste
 * Processo: Ler os meses admitidos
 * Se foi admitido há até 12 meses, Escreve "O funcionário recebe reajuste de recebe 5%"
 * Se foi admitido entre 13 a 48 meses, Escreve "O funcionário recebe reajuste de 7%""
 * Se for maior que 48 meses, escrever "Não informado"
 */
public class Exe15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Insira o valor de meses trabalhados: ");
        int mesesTrabalhados = s.nextInt();

        if (mesesTrabalhados<=12){
            System.out.print("O funcionário recebe reajuste de recebe 5%");
        } else if (mesesTrabalhados<=48){
            System.out.print("O funcionário recebe reajuste de recebe 7%");
        } else {
            System.out.print("Reajuste não informado");
        }
        s.close();

    }
}