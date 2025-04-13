import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Entre uma vogal: ");
        char vogal = s.nextLine().toUpperCase().charAt(0);

        if (vogal == 'A'||vogal =='E'||vogal =='I'||vogal =='O'||vogal =='U'){
            System.out.print("É vogal.");
        } else {
            System.out.print("Não é vogal.");
        }
        
        s.close();
}
}