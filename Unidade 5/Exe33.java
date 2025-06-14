import java.util.Scanner;

public class Exe33 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        int nulo = 0;
        int branco = 0;
        int totalVotos = 0;
        int voto = 0;

        do {
            System.out.println("Digite seu voto:");
            System.out.println("1- Candidato 1 \n2- Candidato 2" +
                    "\n3- Candidato 3\n4- Candidato 4");
            System.out.println("5- Nulo \n6- Branco \n0 - Encerrar votação");
            voto = s.nextInt();

            switch (voto) {
                case 1:
                    candidato1++;
                    totalVotos++;
                    break;
                case 2:
                    candidato2++;
                    totalVotos++;
                    break;
                case 3:
                    candidato3++;
                    totalVotos++;
                    break;
                case 4:
                    candidato4++;
                    totalVotos++;
                    break;
                case 5:
                    nulo++;
                    totalVotos++;
                    break;
                case 6:
                    branco++;
                    totalVotos++;
                    break;
                case 0:
                    System.out.println("Encerrando votação");
                    break;
                default:
                    System.out.println("Opção incorreta. Tente novamente");
                    break;
            }
        } while (voto != 0);

        double percNulos = (nulo * 100) / totalVotos;
        double percBrancos = (branco * 100) /totalVotos;

        System.out.println("Candidato 1: " + candidato1 + " voto(s)");
        System.out.println("Candidato 2: " + candidato2 + " voto(s)");
        System.out.println("Candidato 3: " + candidato3 + " voto(s)");
        System.out.println("Candidato 4: " + candidato4 + " voto(s)");
        System.out.println("Votos nulo: " + nulo);
        System.out.println("Votos em branco: " + branco);
        System.out.println("Percentual de votos nulos: " + percNulos + "%");
        System.out.println("Percentual de votos em branco: " + percBrancos + "%");

        s.close();
    }
}