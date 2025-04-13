import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Insira quantidade de latas de 350ml: ");
        double latas = s.nextDouble();

        System.out.print("Insira quantidade de garrafas de 600ml: ");
        double garrafas600 = s.nextDouble();

        System.out.print("Insira quantidade de garrafas de 2L: ");
        double garrafas2 = s.nextDouble();

        double litroscomprados = (latas*0.35)+(garrafas600*0.6)+(garrafas2*2);

        System.out.print("O total de litros comprados foi de "+litroscomprados +"L");

        s.close();
    }
}
