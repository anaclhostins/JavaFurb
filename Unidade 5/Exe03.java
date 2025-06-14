public class Exe03 {
    public static void main(String[] args) {
        double resposta = 0;
        for (int denominador = 1; denominador <=100;denominador++){
            resposta += 1.0/denominador;
        }
        System.out.println(resposta);
    }
}
