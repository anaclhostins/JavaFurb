import java.util.Scanner;

public class Exe16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double mediaMulheres = 0; 
        double mediaGrupo = 0;
        double altura = 1;
        int nmrMulheres = 0;
        int nmrPessoas = 0;
        double alturaMulheres = 0;
        double alturaGrupo = 0;
        
        System.out.println("Insira altura: ");
        altura = s.nextDouble();
        while (altura != 0) {
            s.nextLine();
            System.out.println("Insira o gênero (M/F/O):");
            char genero = s.nextLine().charAt(0);
            genero = Character.toUpperCase(genero);

            if (genero == 'F') {
                nmrMulheres ++;
                alturaMulheres += altura;
            } 

            nmrPessoas++;
            alturaGrupo += altura;
            System.out.println("Insira altura: ");
            altura = s.nextDouble();
        }

        mediaMulheres = alturaMulheres/nmrMulheres;
        mediaGrupo = alturaGrupo/nmrPessoas;

        System.out.println("A média das mulheres é " + mediaMulheres + "\nA média do grupo é " + mediaGrupo);
        s.close();
    }
}