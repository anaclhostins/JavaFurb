public class Exe10 {
    public static void main(String[] args) {
    
        int numeroFinal2 = 0;
        int numeroFinal1 = 0;
        
        for(int cent = 0; cent < 100; cent++) {
             for (int dez = 0; dez <100; dez++) {
               int soma = cent + dez;
                numeroFinal2 = soma*soma;//(int) Math.pow(soma, 2);
                numeroFinal1 = (cent*100) + dez;
                if (numeroFinal2 == numeroFinal1){
                    System.out.println(numeroFinal2);
                }
            }
        }
    }
}
