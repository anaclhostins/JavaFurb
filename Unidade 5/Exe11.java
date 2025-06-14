public class Exe11 {
    public static void main(String[] args) {
        
        int biscoitosTotal = 0;
        int biscoito = 1;

        for (int i = 1; i <= 16; i++) {
            biscoitosTotal = biscoitosTotal + biscoito;
            biscoito *=3;
        }
        System.out.println(biscoitosTotal);
    }
}
