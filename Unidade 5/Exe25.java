import java.util.Scanner;

public class Exe25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int pontosD = 0;
        int pontosE = 0;

        while (!((pontosD >= 21) || (pontosE >= 21) && Math.abs(pontosD - pontosE)>= 2)) {
        System.out.println("Insira o ponto da jogada: ");
        char pontoJogada = s.nextLine().toUpperCase().charAt(0);    
            if (pontoJogada == 'D') {
                pontosD++;
            } else if (pontoJogada == 'E') {
                pontosE++;
            } else {
                System.out.println("Entrada inválida");
            }
        }

        System.out.println("\nPlacar final:");
        System.out.println("Jogador da direita: " + pontosD);
        System.out.println("Jogador da Esquerda: " + pontosE);

        if (pontosD > pontosE) {
            System.out.println("O Jogador da direita é o vencedor");
        } else if (pontosD < pontosE) {
            System.out.println("O jogador da esquerda é o vencedor");
        }
        s.close();
    }
}
