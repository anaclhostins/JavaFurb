import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.print("Digite a distância em km: ");
        double distancia = s.nextDouble();

        System.out.print("Digite o tempo em horas: ");
        double tempo = s.nextDouble();

        double velocidadeMedia = distancia/tempo;
        double combus = distancia/12;

        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.print("A velocidade média foi de "+ df.format(velocidadeMedia) + "km/h e a quantidade combustível foi de " 
        + df.format(combus) + "Litros" );

        s.close();
    }
    }

