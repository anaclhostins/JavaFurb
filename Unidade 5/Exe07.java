import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double valor1 = 0;
        double valor2 = 0;
        double maior = 0;
        double menor = 0;

        System.out.println("Insira o número de valores a serem comparados");
        int numrs = s.nextInt();

        for (int i = 0;i <= numrs; i++) {
            System.out.println("Escreva o valor: ");
            valor1 = s.nextInt();
            if (valor1 > valor2){
                    maior = valor1;
                    menor = valor2;
            } else if (valor1 < valor2){
                    maior = valor2;
                    menor = valor1;
            } 
            valor2 = valor1;
        }
        System.out.println("O maior número é: " + maior + "\nO menor número é: " + menor);
            
    }
}
