import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.println("Deseja fazer relatório? \ns(Sim)/ n(Não)");
        char resposta = s.nextLine().charAt(0);
        resposta = Character.toLowerCase(resposta);

        while (resposta == 's') {
            System.out.print("Nome do funcionário: ");
            String nome = s.nextLine();
            System.out.print("Valor do produto: ");
            double valorProduto = s.nextDouble();
            System.out.print("Quantidade vendida:");
            int produtosVendidos = s.nextInt();
            double totalVendas = 0;
            s.nextLine();
            totalVendas = totalVendas + (valorProduto * produtosVendidos);
            System.out.print("Mais algum produto? \ns(SIM) / n(Não)");
            char respostaProdutos = s.nextLine().charAt(0);
            respostaProdutos = Character.toLowerCase(respostaProdutos);
            while (respostaProdutos == 's') {
                System.out.print("Valor do produto: ");
                valorProduto = s.nextDouble();
                System.out.print("Quantidade vendida:");
                produtosVendidos = s.nextInt();
                s.nextLine();
                System.out.println("Mais algum produto? \ns(SIM) / n(Não)");
                respostaProdutos = s.nextLine().charAt(0);
                respostaProdutos = Character.toLowerCase(respostaProdutos);
                totalVendas = totalVendas + (valorProduto * produtosVendidos);
            }
            double salarioVendedor = totalVendas * 0.30;

            System.out.println("Nome: " + nome + "\nTotal de vendas(em R$): "
                    + df.format(totalVendas) + "\nSalário do Vendedor: " + salarioVendedor);
            System.out.println("Deseja digitar os dados de mais um vendedor: \ns(Sim)/ n(Não)");
            resposta = s.nextLine().charAt(0);
            resposta = Character.toLowerCase(resposta);
            s.nextLine();
        }

        s.close();
    }
}
