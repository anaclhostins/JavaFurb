import java.util.Scanner;


public class Exe22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println(
                "Os cursos disponíveis são:\n1-Ciência da computação \n2-Licenciatura da Computação \n3-Sistemas da Informação \nQual o curso desejado? ");
        int curso = s.nextInt();

        switch (curso) {
            case 1:
                System.out.print("Bacharel em Ciência da Computação");
                break;
            case 2:
                System.out.print("Licenciado em Computação");
                break;
            case 3:
                System.out.print("Bacharel em Sistemas da Informação");
        }

        s.close();
    }
}
