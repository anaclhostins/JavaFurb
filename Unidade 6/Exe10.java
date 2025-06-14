import java.util.Scanner;

public class Exe10 {
    public Exe10() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o tamanho do vetor: ");
        int n = teclado.nextInt();
        while (n < 0 || n > 50) {
            System.out.println("Valor incorreto. Tente Novamente!");
            n = teclado.nextInt();
        }
        int valores[] = new int[n];
        int tamanhoAtual = 0;

        int opcao = 0;
        do {
            System.out.println("---------- MENU --------");
            System.out.println("Insira a opção do menu: ");
            System.out.println("1 - Incluir valor");
            System.out.println("2 - Pesquisar valor");
            System.out.println("3 - Alterar valor");
            System.out.println("4 - Excluir valor");
            System.out.println("5 - Mostrar valores");
            System.out.println("6 - Ordenar valores");
            System.out.println("7 - Inverter valores");
            System.out.println("8 - Sair do sistema");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("---------- Incluir Valor --------");
                    tamanhoAtual = incluirValor(valores, tamanhoAtual, teclado);
                    break;
                case 2:
                    System.out.println("---------- Buscar Valor --------");
                    buscar(valores, teclado, tamanhoAtual);
                    break;
                case 3:
                    System.out.println("---------- Alterar Valor --------");
                    alterar(valores, tamanhoAtual, teclado);
                    break;
                case 4:
                    System.out.println("---------- Excluir Valor --------");
                    tamanhoAtual = excluirValor(valores, tamanhoAtual, teclado);
                    break;
                case 5:
                    System.out.println("---------- Mostrar Valores --------");
                    mostrar(valores, tamanhoAtual);
                    break;
                case 6:
                    System.out.println("---------- Ordenar Valores --------");
                    ordenar(valores, tamanhoAtual);
                    break;
                case 7:
                    System.out.println("---------- Inverter Valores --------");
                    inverter(valores, tamanhoAtual);
                    break;
                case 8:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Error! Tente novamente.");
                    break;
            }
        } while (opcao != 8);

        teclado.close();
    }

    public static void main(String[] args) {
        new Exe10();
    }

    private int incluirValor(int[] valores, int tamanhoAtual, Scanner teclado) {
        if (tamanhoAtual < valores.length) {
            System.out.print("Informe o valor a incluir: ");
            int valor = teclado.nextInt();
            valores[tamanhoAtual] = valor;
            tamanhoAtual++;
            System.out.println("Valor incluído com sucesso!");
        } else {
            System.out.println("Vetor cheio! Não é possível incluir o valor.");
        }
        return tamanhoAtual;
    }

    private void buscar(int[] valores, Scanner teclado, int tamanhoAtual) {
        System.out.println("Insira o valor para pesquisa: ");
        int valor = teclado.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < tamanhoAtual; i++) {
            if (valores[i] == valor) {
                System.out.println("O valor " + valor + " está na posição " + i + " no vetor");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Valor não encontrado!");
        }

    }

    private int alterar(int[] valores, int tamanhoAtual, Scanner teclado) {
        System.out.print("Informe o número a ser alterado: ");
        int valorTrocar = teclado.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < tamanhoAtual; i++) {
            if (valores[i] == valorTrocar) {
                System.out.print("Informe o novo valor para substituir: ");
                int novoValor = teclado.nextInt();
                valores[i] = novoValor;
                encontrado = true;
                System.out.println("Número alterado com sucesso!");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Número não encontrado no valores!");
        } else {
            System.out.println("Vetor atualizado: ");
            for (int i = 0; i < tamanhoAtual; i++) {
                System.out.println(valores[i]);
            }
        }
        return tamanhoAtual;
    }

    private int excluirValor(int[] valores, int tamanhoAtual, Scanner teclado) {
        System.out.print("Informe o valor a excluir: ");
        int valorExcluir = teclado.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < tamanhoAtual; i++) {
            if (valores[i] == valorExcluir) {
                for (int j = i; j < tamanhoAtual - 1; j++) {
                    valores[j] = valores[j + 1];
                }
                tamanhoAtual--;
                System.out.println("Valor excluído com sucesso!");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Valor não encontrado no valores!");
        } else {
            System.out.println("Vetor atualizado: ");
            for (int i = 0; i < tamanhoAtual; i++) {
                System.out.println(valores[i]);
            }
        }
        return tamanhoAtual;
    }

    private void mostrar(int[] valores, int tamanhoAtual) {
        for (int i = 0; i < tamanhoAtual; i++) {
            System.out.println(valores[i]);
        }
    }

    private void ordenar(int[] valores, int tamanhoAtual) {
        for (int i = 0; i < tamanhoAtual - 1; i++) {
            for (int j = 0; j < valores.length - 1 - i; j++) {
                if (valores[j] > valores[j + 1]) {
                    int aux = valores[j];
                    valores[j] = valores[j + 1];
                    valores[j + 1] = aux;
                }
            }
        }
        System.out.println("Vetor ordenado: ");
        for (int i = 0; i < tamanhoAtual; i++) {
            System.out.println(valores[i]);
        }
    }

    private void inverter(int valores[], int tamanhoAtual) {
        int temp = 0;
        for (int i = 0; i < tamanhoAtual; i++) {
            for (int x = 0; x < i; x++) {
                temp = valores[i];
                valores[i] = valores[x];
                valores[x] = temp;
            }
        }
        System.out.println("Vetor invertido: ");
        for (int i = 0; i < tamanhoAtual; i++) {
            System.out.println(valores[i]);
        }
    }

}
