import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Insira a quantidade de paradas ");
        int paradas = s.nextInt();

        double media = 0;
        double quilometragemTotal = 0;

        for (int i = 1; i <= paradas; i++) {
            System.out.println("Parada: " + i);
            System.out.println("Insira a quilometragem: ");
            double km = s.nextDouble();
            System.out.println("Insira a quantidade de combustível: ");
            double litrosGa = s.nextDouble();
            double quilometragemPara = km / litrosGa;
            System.out.println("A quilometragem média da parada é " + quilometragemPara);
            
            quilometragemTotal += quilometragemPara;
        }
        media = quilometragemTotal/paradas;
        System.out.println("A Quilometragem média obtida por litro: " + media);

        s.close();
    }
}
