import java.util.Scanner; 


public class Exe11{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Insira o ano de nascimento do irmão 1: ");
        int nascimento1 = s.nextInt();

        System.out.print("Insira o ano de nascimento do irmão 2: ");
        int nascimento2 = s.nextInt();

        System.out.print("Insira o ano de nascimento do irmão 3: ");
        int nascimento3 = s.nextInt();

        if (nascimento1==nascimento2 && nascimento2==nascimento3){
        System.out.print("Trigêmeos");
        } else if (nascimento1==nascimento2 || nascimento1==nascimento3 || nascimento2==nascimento3 ){
            System.out.print("Gêmeos");
        } else {
            System.out.print("Apenas irmãos");
        }
        
        s.close();
    }
}