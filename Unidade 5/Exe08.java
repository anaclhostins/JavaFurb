import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numrs = 0;
        double valor1 = 0;
        double mediaMa = 0;
        double negativo = 0;
        int numsNegativos = 0;
        int numsPositivos = 0;

        System.out.println("Insira o número de valores a serem comparados: ");
        numrs = s.nextInt();

        for (int i = 0; i < numrs; i++) {
            System.out.print("Escreva o valor: ");
            valor1 = s.nextDouble();
            if (valor1 < 0) {
                numsNegativos ++;
                if (valor1 < negativo) {
                    negativo = valor1;
                }
            } else if (valor1 > 0) {
                numsPositivos ++;
                if (mediaMa == 0) {
                    mediaMa = (valor1*2)/2;
                } else {
                    mediaMa = (mediaMa + valor1)/2;
                }
            }

        }

        if(numsNegativos == 0 && numsPositivos > 0){
            System.out.println("Nenhum número negativo foi inserido e \na média dos valores postivos é: " + mediaMa);
        } else if(numsNegativos > 0 && numsPositivos == 0){
            System.out.println("O menor número negativo inserido é: " + negativo + "\nNenhum valor postivo foi inserido ");
        } else {
            System.out.println("O menor valor negativo é: " + negativo + "\nA média dos valores positvo é: " + mediaMa);
        }

    }
}