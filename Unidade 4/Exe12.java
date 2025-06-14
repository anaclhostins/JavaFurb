import java.util.Scanner;
/*Entrada: lado 1, lado2 e lado3
 *Saída: tipo de triângulo (equilátero, isósceles e escaleno)
 *Processo: Ler os comprimentos dos três lados de um triângulo.
 *Verificar se é um triângulo válido, garantindo que o comprimento de cada lado seja menor que a soma dos outros dois.
 *Se for um triângulo, Classificar em:
 *  Se os três lados forem iguais, o triângulo é Equilátero.
 *  Se dois lados forem iguais e um diferente, o triângulo é Isósceles.
 *  Se os três lados forem diferentes, o triângulo é Escaleno.
 *Caso não for um triângulo, escrver "Não forma um triângulo"
 *!Fluxograma no exercício!
 */
public class Exe12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Entre com o comprimento do lado 1: ");
        int lado1 = s.nextInt();

        System.out.print("Escreva o comprimento do lado2: ");
        int lado2 = s.nextInt();

        System.out.print("Escreva o comprimento do lado 3: ");
        int lado3 = s.nextInt();

        if (lado1<(lado2+lado3) && lado2<(lado1+lado3) && lado3<(lado1+lado2)){
            if (lado1 == lado2 && lado2==lado3){
                System.out.print("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado3 == lado2){
                System.out.print("Triângulo Isósceles");
            } else {
                System.out.print("Triângulo Escaleno");
            }
        } else {
            System.out.print("Não forma um triângulo");
        }

        s.close();
    }
}