import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int dia = s.nextInt();

        System.out.print("Digite o mês: ");
        int mes = s.nextInt();

        System.out.print("Digite o ano: ");
        int ano = s.nextInt();

        if (dia > 0 && dia < 32 && mes > 0 && mes<13 && ano>0){
            if (mes ==1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 11){
                System.out.print("Válida");
            } else if (mes !=2 && dia < 31){
                System.out.print("Válida");
            } else if (mes == 2 && dia < 29){
                System.out.print("Válida");
            }else if (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 !=0)){
                System.out.print("Válida");
            }else {
                System.out.print("Não válida");
            } 
          
        } else {
            System.out.print("Não válida");
        }
        
        s.close();
    }
}
