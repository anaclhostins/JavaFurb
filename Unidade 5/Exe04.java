public class Exe04 {
    public static void main(String[] args) {
        int numerador = 3;
        int denominador = 2;
        int i = 2;
        double resposta = 0;
        for (int s = 0; s < 20; s++) {
            resposta += (double)numerador/denominador;
            numerador = numerador + 2;
            denominador = denominador +i*2;
            i ++;
        }
        System.out.println(resposta);
    }
}
