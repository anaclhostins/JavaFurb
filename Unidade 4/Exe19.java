import java.util.Scanner;

public class Exe19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("X= ");
        float x = s.nextFloat();

        System.out.print("Y= ");
        float y = s.nextFloat();

        if (x == 0 && y == 0) {
            System.out.print("Quadrante 0");
        } else if (x > 0 && y > 0) {
            System.out.print("Quadrante 1");
        } else if (x < 0 && y > 0) {
            System.out.print("Quadrante 2");
        } else if (x < 0 && y < 0) {
            System.out.print("Quadrante 3");
        } else if (x > 0 && y < 0) {
            System.out.print("Quadrante 4");
        } 

        s.close();
        
    }
}
