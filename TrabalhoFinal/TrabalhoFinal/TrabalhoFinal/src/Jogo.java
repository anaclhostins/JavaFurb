// Jogo.- Caça ao Tesouro 
// Autoras: Ana Clara e Jéssica

/* IMPLEMENTAÇÃO:
1. Classe Jogo
FLUXO: iniciar() → inicializa tudo → loop de jogadas → exibe resultado final.
 então só precisa chamar o método iniciar() para começar o jogo e o unico retrono é a vitoria. 
/*    
 * JOGO: 
 * Passo 1:  iniciarTabuleiro(); colocarTesouro();
 * 
 * Passo 2: atualiza a cada jogada com: 
 *          verificaVitoria() --> se n venceu, continua o loop
            trajeto() '*' nas casas já passadas pelo jogador
            exibirTabuleiro()  exibe P para posicao atual do jogador, * posições passadas e  - para as casas vazias
            novaJogada()  lê a jogada do usuario e atualiza a posição do jogador se for válida
* 
* Passo 3: exibirTabuleiro() cria o tabuleiro com o jogador em 0, 0

* Passo 4: sorteia a posição do tesouro com colocarTesouro()
           
* Passo 4: verificaVitoria() se o jogador encontrou o tesouro, exibe a mensagem de vitória e o número de jogadas.
  * TABULEIRO 
 * - variável tabuleiro do tipo char[][], que representa o tabuleiro do jogo.
 * - metodo iniciarTabuleiro() - inicializa o tabuleiro com 8 linhas e 8 colunas, preenchendo todas as posições com '-'.
 * - metodo exibirTabuleiro() - exibe o tabuleiro no terminal, mostrando a posição do jogador (P) e as casas já percorridas (*), além do tesouro (T) se encontrado.
   - variável linha e coluna, que representam a posição do jogador no tabuleiro iniciando com 0.0 mostrando P para o jogador.
 * - demais posições do tabuleiro são preenchidas com '.' para representar casas vazias.
 *   
 * TESOURO -  Posicionar Tesouro - posição do tesouro no tabuleiro.
 * -  colocarTesouro() - coloca o tesouro em uma posição aleatória do tabuleiro.
 * - variaveis linha e coluna usam .random() para gerar números aleatórios entre 0 e 7, para colocar o tesouro. 
 * - verifica se o tesouro está na posição 0.0 e se sim, chama o método novamente para gerar uma nova posição aleatória.
 *     
 * NOVA JOGADA 
 *  - le e valida a direção que o jogador deseja se mover.
 *  -  while para verificar se a direção é válida (N, S, L, W) e se não for, solicita uma nova direção.
 *    - valida se tiver dentro do limite do tabuleiro. 
 *    - valida se ainda n foi percorrida
 *  - variável linhaJogador e colunaJogador, são atualizadas.
 *  - atualiza a nova posição do jogador para o metodo posicaoJogador().
 *         
 * TRAJETO E JOGADAS - controla o número de jogadas do jogador e onde o jogador já passou.  
 * - variável localização do tipo int, que representa o onde o jogador já passou e registra a posição do jogador no vetor trajeto.
 * - vetor trajetoria, que representa o percurso do jogador no tabuleiro. 
 * - atualiza o vetor trajeto 
 * - variável jogadas do tipo int, que representa o número de jogadas do jogador.
 * - atualiza o numero de jogadas
 * 
 * VERIFICAR VITÓRIA:  
 * Verificação de Vitória - verifica se o jogador encontrou o tesouro.
 * Metodo: verificarVitoria() - verifica se o jogador encontrou o tesouro.
 * - variável vitoria do tipo boolean, que percorre o tabuleiro a cada jogada e verifica se o jogador encontrou o tesouro.
 * - retorna true se o jogador encontrou o tesouro e false se não encontrou pra o metodo iniciar() continuar o loop de jogadas.
 */

import java.util.Scanner;

public class Jogo {
    private char[][] tabuleiro;

    // Posição do jogador e do tesouro
    private int linhaJogador, colunaJogador;
    private int linhaTesouro, colunaTesouro;

    private int jogadas; // contador de jogadas
    private String[] trajeto; // vetor de String para registrar cada passo
    private int qtddTrajeto; // quantas jogadas já foram feitas e onde
    private Scanner scanner;
    private boolean vitoria;
    private String[] direcoes;

    public void iniciar() {

        // INICIAR VARIAVEIS
        scanner = new Scanner(System.in);
        trajeto = new String[64];
        direcoes = new String[64];

        qtddTrajeto = 0; // controla o tamanho do vetor trajeto
        jogadas = 0; // mostra o numero de jogadas do jogador
        // ambos crescem juntos a cada jogada valida, as jogadas invalidas não
        // incrementam o contador de jogadas!

        vitoria = false;

        // CHAMA OS MÉTODOS PARA INICIAR O TABULLEIRO E SORTEAR A POSIÇAO DO TESOURO
        iniciarTabuleiro();
        colocarTesouro();

        // ATUALIZA O JOGO A CADA JOGADA COM:
        while (!verificaVitoria()) {
            trajeto();
            exibirTabuleiro();
            novaJogada();

            if (verificaEncurralado()) {
                trajeto();
                exibirTabuleiro();
                System.out.println("\nGame Over! Você ficou sem movimentos possíveis.");
                mostrarTrajeto();
                return; // encerra o método iniciar()
            }
        }

        // EXIBE QUANDO O JOGADOR ENCONTRA O TESOURO E QUANTAS JOGADAS FORAM FEITAS
        trajeto();
        exibirTabuleiro();
        System.out.println("\nParabéns! Você encontrou o tesouro em " + jogadas + " jogadas!");
        mostrarTrajeto();
        scanner.close();
    }

    public void iniciarTabuleiro() {
        tabuleiro = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tabuleiro[i][j] = '-';
            }
        }
        linhaJogador = 0;
        colunaJogador = 0;
        tabuleiro[0][0] = 'P'; // P é a posição do jogador, que inicia em 0, 0
    }

    private void colocarTesouro() { // Sorteia a posição do tesouro no inicio do jogo
        do {
            linhaTesouro = (int) (Math.random() * 8);
            colunaTesouro = (int) (Math.random() * 8);
        } while (linhaTesouro == 0 && colunaTesouro == 0);
        // fiz ele ressortear se o tesouro estiver em 0,0 pq se não o jogador ganha sem
        // jogar...
    }

    public void exibirTabuleiro() { // Exibe o tabuleiro no terminal
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == linhaJogador && j == colunaJogador) {
                    System.out.print("P ");
                } else if (vitoria && i == linhaTesouro && j == colunaTesouro) {
                    System.out.print("T "); // T é o tesouro encontrado, só é exibido se o jogador venceu
                } else {
                    System.out.print(tabuleiro[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public void novaJogada() { // Lê a direção que o jogador deseja se mover e atualiza a posição do jogador

        boolean movimentoValido = false;

        // VERIFICA SE O MOVIMENTO É VÁLIDO
        while (!movimentoValido) { // verifica se o movimento pedido é válido
            System.out.print("Digite a direção (W=acima, S=abaixo, A=esquerda, D=direita): ");
            String direcao = scanner.nextLine().trim().toUpperCase();

            int dLinha = 0, dColuna = 0;
            if (direcao.equals("W"))
                dLinha = -1;
            else if (direcao.equals("S"))
                dLinha = 1;
            else if (direcao.equals("A"))
                dColuna = -1;
            else if (direcao.equals("D"))
                dColuna = 1;
            else {
                System.out.println("Direção inválida! Use N, S, W ou L."); // Se a enrada for invalida
                continue;
            }

            int novaLinha = linhaJogador + dLinha;
            int novaColuna = colunaJogador + dColuna;

            // verifica se a nova posição está dentro dos limites do tabuleiro
            if (novaLinha < 0 || novaLinha >= 8 || novaColuna < 0 || novaColuna >= 8) {
                System.out.println("Movimento fora dos limites!");
                continue;
            }
            // verifica se a nova posição já foi percorrida, ai deixei como não pode passar
            // novamente, pra ele ter chance de perder
            if (tabuleiro[novaLinha][novaColuna] == '*') {
                System.out.println("Você já percorreu essa posição!");
                continue;
            }

            // marca a casa antiga como percorrida *
            tabuleiro[linhaJogador][colunaJogador] = '*';

            // atualiza posição e registra no vetor
            linhaJogador = novaLinha;
            colunaJogador = novaColuna;
            trajeto[qtddTrajeto] = "(" + linhaJogador + "," + colunaJogador + ")";
            direcoes[qtddTrajeto] = direcao;
            qtddTrajeto++; // adiciona a jogada ao trajeto
            jogadas++; // incrementa a contagem de jogadas

            // Mostra a nova posicao do jogador e o número de jogadas
            System.out.println("Posição do Jogador: (" + linhaJogador + "," + colunaJogador + ")");
            System.out.println("Número de jogadas: " + jogadas + "\n");

            movimentoValido = true;
        }
    }

    public void trajeto() { // percorre apenas as posições preenchidas em trajeto[]
        for (int i = 0; i < qtddTrajeto; i++) {
            String jogadaPassada = trajeto[i]; // cada String está no formato "(l,c)"
            char linhaChar = jogadaPassada.charAt(1); // l é a linha que tá na posicição 1
            char colunaChar = jogadaPassada.charAt(3); // c é a coluna que tá na posicição 3
            int l = linhaChar - '0';
            int c = colunaChar - '0';
            tabuleiro[l][c] = '*'; // marca as casas já percorridas com '*'
        }
    }

    public boolean verificaVitoria() { // se P (jogador) e T (tesouro) estiverem na mesma posição
        vitoria = (linhaJogador == linhaTesouro && colunaJogador == colunaTesouro);
        if (vitoria) {
            tabuleiro[linhaTesouro][colunaTesouro] = 'T';
        }
        return vitoria;
    }

    private void mostrarTrajeto() { // Mostra o trajeto completo do jogador até o tesouro
        String caminho = ""; // Resultado trajeto percorrido
        System.out.print("Trajeto completo: ");
        for (int i = 0; i < qtddTrajeto; i++) {
            if (direcoes[i].equals("W")) {
                caminho += "Cima, ";
            } else if (direcoes[i].equals("S")) {
                caminho += "Abaixo, ";
            } else if (direcoes[i].equals("D")) {
                caminho += "Direita, ";
            } else {
                caminho += "Esquerda, ";
            }
        }

        System.out.print(caminho.substring(0, caminho.length() - 2));
    }

    private boolean verificaEncurralado() {
        int[][] direcoes = {
                { -1, 0 }, // cima
                { 1, 0 }, // baixo
                { 0, -1 }, // esquerda
                { 0, 1 } // direita
        };

        for (int[] d : direcoes) {
            int novaLinha = linhaJogador + d[0];
            int novaColuna = colunaJogador + d[1];

            // verifica se está dentro dos limites
            if (novaLinha >= 0 && novaLinha < 8 && novaColuna >= 0 && novaColuna < 8) {
                // verifica se a posição ainda não foi visitada
                if (tabuleiro[novaLinha][novaColuna] == '-') {
                    return false; // ainda há movimento possível
                }
            }
        }

        return true; // nenhum movimento válido disponível
    }
}