import java.util.Scanner;

public class Exe16{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor da compra:");
        int valorCompra = teclado.nextInt();

        System.out.print("Digite o valor dado pelo cliente:");
        int valorCliente = teclado.nextInt();

        int troco = valorCliente - valorCompra;
        int nota100 = troco/100;
        troco = troco%100;
        int nota10 = troco/10;
        troco = troco%10;
        int moeda1 = troco/1;
        int qntNotas = nota100 + nota10 + moeda1;

        System.out.print("O número mínimo de notas de troco é: " + qntNotas);
        System.out.print("\nQuantidade de nota de 100: " + nota100 + 
        "\nQuantidade de notas de 10: " + nota10 + 
        "\nQuantidade de moeda de 1: " + moeda1);

        teclado.close();
    }
}