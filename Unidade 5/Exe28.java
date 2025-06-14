import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        int voto = 0;
        int nenhumDeNos = 0;
        int cpm22 = 0;
        int skank = 0;
        int jotaQuest = 0;
        int totalVotos = 0;

        System.out.println("Insira o voto: ");
        voto = s.nextInt();
        while ((voto > 0) && (voto < 5)) {
            totalVotos++;
            switch (voto) {
                case 1 -> nenhumDeNos++;
                case 2 -> cpm22++;
                case 3 -> skank++;
                case 4 -> jotaQuest++;
            }

            s.nextLine();
            System.out.println("Deseja adicionar novo voto? (S - Sim / N - Não)");
            char novoVoto = s.nextLine().toUpperCase().charAt(0);
            while ((novoVoto != 'S') && (novoVoto != 'N')) {
                System.out.println("Resposta Inválida");
                System.out.println("Deseja adicionar novo voto? (S - Sim / N - Não)");
                novoVoto = s.nextLine().toUpperCase().charAt(0);
            }
            if (novoVoto == 'S') {
                System.out.println("Insira o voto: ");
                voto = s.nextInt();
            } else {
                voto = 0;
            }
        }

        double percentual1 = ((double) nenhumDeNos / totalVotos) * 100;
        double percentual2 = ((double) cpm22 / totalVotos) * 100;
        double percentual3 = ((double) skank / totalVotos) * 100;
        double percentual4 = ((double) jotaQuest / totalVotos) * 100;
        System.out.println("\nTotal de votos por Conjunto: \nNenhum de Nós: " + nenhumDeNos +
                " votos\nCPM22: " + cpm22 + " votos\nSkank: " + skank + " votos\nJota Quest: " + jotaQuest + " votos");
        System.out.println("Percentual de cada grupo: \nNenhum de Nós: " + df.format(percentual1) + "%\nCPM22: "
                + df.format(percentual2)
                + "%\nSkank: " + df.format(percentual3) + "%\nJota Quest: " + df.format(percentual4) + "%");
        if (nenhumDeNos > cpm22 && nenhumDeNos > skank && nenhumDeNos > jotaQuest) {
            System.out.println("O Vencendor é o conjunto Nenhum de Nós");
        } else if (cpm22 > nenhumDeNos && cpm22 > skank && cpm22 > jotaQuest) {
            System.out.println("O Vencendor é o conjunto CPM22");
        } else if (skank > nenhumDeNos && skank > cpm22 && skank > jotaQuest) {
            System.out.println("O Vencendor é o conjunto Skank");
        } else if (jotaQuest > nenhumDeNos && jotaQuest > skank && jotaQuest > cpm22) {
            System.out.println("O Vencendor é o conjunto Jota Quest");
        }

        s.close();
    }
}
