import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Entre um caractere: ");
        char sexo = s.nextLine().toUpperCase().charAt(0);



        if (sexo == 'M'){
            System.out.print("Masculino");
        } else if (sexo == 'F') {
            System.out.print("Feminino");
        } else if (sexo == 'I'){
            System.out.print("Não informado");
        } else {
            System.out.print("Entrada Incorreta");
        }

        s.close();
    }
}
