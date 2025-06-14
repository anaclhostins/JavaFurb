import java.util.Scanner;

public class Exe20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double massaInicial = 0;
        double tempo = 0;
        System.out.println("Insira a massa inicial: ");
        double massa = s.nextDouble();
        massaInicial = massa;

        while (massa > 0.5) {
            massa = massa / 2;
            tempo += 50;
        }

        int tempoMin = (int) tempo/60;
        int tempoSeg = (int) tempo % 60;

        System.out.println("Massa inicial: " + massaInicial
                + "\nMassa Final: " + massa
                + "\nTempo: " + tempoMin + " Minutos e " + tempoSeg + " segundos");
            

        s.close();
    }
}