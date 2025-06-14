
import java.util.Scanner;

public class Exe09 {
    private int[] sexo;
    private int[] nota;
    private int[] idade;

    public Exe09() {
        Scanner teclado = new Scanner(System.in);

        sexo = new int[30];
        nota = new int[30];
        idade = new int[30];

        lerDados(teclado);

        double mediaGeral = calcularMediaGeral();
        System.out.println("\nNota média do cinema: " + mediaGeral);

        double mediaHomens = calcularMediaHomens();
        System.out.println("Nota média dos homens: " + mediaHomens);

        int notaMulherJovem = notaMulherMaisJovem();
        System.out.println("Nota da mulher mais jovem: " + notaMulherJovem);

        int qtdMulheres50Mais = mulheres50MaisNotaAcimaMedia(mediaGeral);
        System.out.println("Qtd mulheres >50 anos com nota acima da média: " + qtdMulheres50Mais);
    }

    public static void main(String[] args) {
        new Exe09();
    }

    private void lerDados(Scanner teclado) {
        for (int i = 0; i < 30; i++) {
            System.out.println("\nPessoa " + (i + 1));
            System.out.print("Sexo (1=feminino, 2=masculino): ");
            sexo[i] = teclado.nextInt();

            System.out.print("Nota (0 a 10): ");
            nota[i] = teclado.nextInt();

            System.out.print("Idade: ");
            idade[i] = teclado.nextInt();
        }
    }

    private double calcularMediaGeral() {
        int soma = 0;
        for (int i = 0; i < 30; i++) {
            soma += nota[i];
        }
        return (double) soma / 30;
    }

    private double calcularMediaHomens() {
        int soma = 0;
        int cont = 0;
        for (int i = 0; i < 30; i++) {
            if (sexo[i] == 2) {
                soma += nota[i];
                cont++;
            }
        }
        if (cont == 0) {
            return 0;
        }
        return (double) soma / cont;
    }

    private int notaMulherMaisJovem() {
        int menorIdade = Integer.MAX_VALUE;
        int notaMaisJovem = -1;
        for (int i = 0; i < 30; i++) {
            if (sexo[i] == 1) {
                if (idade[i] < menorIdade) {
                    menorIdade = idade[i];
                    notaMaisJovem = nota[i];
                }
            }
        }
        return notaMaisJovem;
    }

    private int mulheres50MaisNotaAcimaMedia(double mediaGeral) {
        int cont = 0;
        for (int i = 0; i < 30; i++) {
            if (sexo[i] == 1 && idade[i] > 50 && nota[i] > mediaGeral) {
                cont++;
            }
        }
        return cont;
    }

}
