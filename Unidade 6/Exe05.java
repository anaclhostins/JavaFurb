import java.util.Scanner;

public class Exe05 {
    // Construtor - Mesmo nome da classe e inicializa a classe
    public Exe05() {
        Scanner teclado = new Scanner(System.in);
        String[] respostaM = new String[5];
        String[] respostaR = new String[5];

        System.out.println("Respostas da moça(SIM, NÃO OU IND): ");
        lerRespostas(respostaM, teclado);
        System.out.println("Respostas do Rapaz(SIM, NÃO OU IND): ");
        lerRespostas(respostaR, teclado);

        int somaAfinidade = calcularAfinidade(respostaM, respostaR);

        /*
         * System.out.println("Respostas do rapaz(SIM, NÃO ou IND): ");
         * for (int i = 0; i < perguntas.length; i++) {
         * System.out.println(perguntas[i]);
         * respostaR[i] = s.next();
         * }
         */

        /*
         * System.out.println("Respostas do moça(SIM, NÃO ou IND): ");
         * for (int i = 0; i < perguntas.length; i++) {
         * System.out.println(perguntas[i]);
         * respostaM[i] = s.next();
         * }
         */

        /*
         * int somaAfinidade = 0;
         * for (int i = 0; i < respostaM.length;i++){
         * if (respostaM[i].equalsIgnoreCase(respostaR[i])){
         * somaAfinidade = somaAfinidade += 3;
         * } else if (!respostaM[i].equalsIgnoreCase(respostaR[i])){
         * somaAfinidade -= 2;
         * } else {
         * somaAfinidade +=1;
         * }
         * }
         */

        if (somaAfinidade == 15) {
            System.out.println("Casem");
        } else if (somaAfinidade < 15 && somaAfinidade > 9) {
            System.out.println("Vocês tem muito em comum!");
        } else if (somaAfinidade < 10 && somaAfinidade > 4) {
            System.out.println("Talvez não dê certo!");
        } else if (somaAfinidade < 5 && somaAfinidade >= 0) {
            System.out.println("Vale um encontro.");
        } else if (somaAfinidade < 0 && somaAfinidade < -9){
            System.out.println("Melhor não perder tempo");
        } else {
            System.out.println("Vocês se odeiam!");
        }
        teclado.close();
    }

    public static void main(String[] args) {
        new Exe05(); // Chama o construtor
    }

    private void lerRespostas(String[] respostas, Scanner teclado) {
        String[] perguntas = { "Gosta de música sertaneja?", "Gosta de futebol?", "Gosta de seriados?",
                "Gosta de redes sociais?", "Gosta da Oktoberfest?" };
        for (int i = 0; i < perguntas.length; i++) {
            do {
            System.out.println(perguntas[i]);
            respostas[i] = teclado.next();
            } while ((!respostas[i].equalsIgnoreCase("SIM")) && (!respostas[i].equalsIgnoreCase("NAO"))
                    && (!respostas[i].equalsIgnoreCase("IND")));
                
        }
    }

    private int calcularAfinidade(String[] respostaM, String[] respostaR) {
        int somaAfinidade = 0;
        for (int i = 0; i < respostaM.length; i++) {
            if (respostaM[i].equalsIgnoreCase(respostaR[i])) {
                somaAfinidade = somaAfinidade += 3;
            } else if (!respostaM[i].equalsIgnoreCase(respostaR[i])) {
                somaAfinidade -= 2;
            } else {
                somaAfinidade += 1;
            }
        }
        return somaAfinidade;
    }
}