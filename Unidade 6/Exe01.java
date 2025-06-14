import java.util.Scanner;

public class Exe01 {

    public Exe01(){
        Scanner s = new Scanner(System.in);
        int numeros[] = new int[10];
        // int[] valores = new int[10];
        ler(numeros,s);
        escrever(numeros);
        s.close();
    }

    public static void main(String[] args) {
        new Exe01();
    }

    private void ler(int[] numeros, Scanner s) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = s.nextInt();
        }
    }
    private void escrever(int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}