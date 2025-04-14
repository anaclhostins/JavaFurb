import java.util.Scanner;

public class AnaClara_Q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Escreva a primeira idade:");
        int idade1 = s.nextInt();
        System.out.print("Escreva a segunda idade:");
        int idade2 = s.nextInt();
        System.out.print("Escreva a terceira idade:");
        int idade3 = s.nextInt();

        int maior = 0;
        int meio = 0;
        int menor = 0;
        if (idade1 > idade2 && idade1 > idade3) {
            maior = idade1;
            if (idade2 > idade3) {
                menor = idade3;
                meio = idade2;
            } else {
                menor = idade2;
                meio = idade3;
            }
        }

        if (idade2 > idade1 && idade2 > idade3) {
            maior = idade2;
            if (idade1 > idade3) {
                menor = idade3;
                meio = idade1;
            } else {
                menor = idade1;
                meio = idade3;
            }
        }

        if (idade3 > idade1 && idade3 > idade2) {
            maior = idade3;
            if (idade2 > idade1) {
                menor = idade1;
                meio = idade2;
            } else {
                menor = idade2;
                meio = idade1;
            }
        }

        String respostaMa = "";
        if (maior >= 16) {
            if (maior >= 21) {
                System.out.print("O de " + maior + " anos. Está na lista de restrição?");
                boolean listaRe = s.nextBoolean();
                if (listaRe) {
                    respostaMa = "Entrada Negada";
                } else {
                    System.out.println("Qual o traje? \n1-Social \n2-Esporte Chique \n3-Outro");
                    int traje = s.nextInt();
                    if (traje == 1 || traje == 2) {
                        respostaMa = "Entrada Liberada";
                    } else if (traje == 3) {
                        respostaMa = "Entrada Negada";
                    }
                }
            } else {
                System.out.print("O de " + maior + " anos. Possui responsável VIP?");
                boolean responsaVIP = s.nextBoolean();
                if (responsaVIP) {
                    System.out.println("Qual o traje? \n1-Social \n2-Esporte Chique \n3-Outro");
                    int traje = s.nextInt();
                    if (traje == 1 || traje == 2) {
                        respostaMa = "Entrada Liberada";
                    } else if (traje == 3) {
                        respostaMa = "Entrada Negada";
                    }
                } else {
                    respostaMa = "Entrada Negada";
                }
            }
        } else {
            respostaMa = "Entrada Negada";
        }

        String respostaMei = "";
        if (meio >= 16) {
            if (meio >= 21) {
                System.out.print("O de " + meio + " anos. Está na lista de restrição?");
                boolean listaRe = s.nextBoolean();
                if (listaRe) {
                    respostaMei = "Entrada Negada";
                } else {
                    System.out.println("Qual o traje? \n1-Social \n2-Esporte Chique \n3-Outro");
                    int traje = s.nextInt();
                    if (traje == 1 || traje == 2) {
                        respostaMei = "Entrada Liberada";
                    } else if (traje == 3) {
                        respostaMei = "Entrada Negada";
                    }
                }
            } else {
                System.out.print("O de " + meio + " anos. Possui responsável VIP?");
                boolean responsaVIP = s.nextBoolean();
                if (responsaVIP) {
                    System.out.println("Qual o traje? \n1-Social \n2-Esporte Chique \n3-Outro");
                    int traje = s.nextInt();
                    if (traje == 1 || traje == 2) {
                        respostaMei = "Entrada Liberada";
                    } else if (traje == 3) {
                        respostaMei = "Entrada Negada";
                    }
                } else {
                    respostaMei = "Entrada Negada";
                }
            }
        } else {
            respostaMei = "Entrada Negada";
        }

        String respostaMen = "";
        if (menor >= 16) {
            if (menor >= 21) {
                System.out.print("O de " + menor + " anos. Está na lista de restrição?");
                boolean listaRe = s.nextBoolean();
                if (listaRe) {
                    respostaMen = "Entrada Negada";
                } else {
                    System.out.println("Qual o traje? \n1-Social \n2-Esporte Chique \n3-Outro");
                    int traje = s.nextInt();
                    if (traje == 1 || traje == 2) {
                        respostaMen = "Entrada Liberada";
                    } else if (traje == 3) {
                        respostaMen = "Entrada Negada";
                    }
                }
            } else {
                System.out.print("O de " + menor + " anos. Possui responsável VIP?");
                boolean responsaVIP = s.nextBoolean();
                if (responsaVIP) {
                    System.out.println("Qual o traje? \n1-Social \n2-Esporte Chique \n3-Outro");
                    int traje = s.nextInt();
                    if (traje == 1 || traje == 2) {
                        respostaMen = "Entrada Liberada";
                    } else if (traje == 3) {
                        respostaMen = "Entrada Negada";
                    }
                } else {
                    respostaMen = "Entrada Negada";
                }
            }
        } else {
            respostaMen = "Entrada Negada";
        }

        System.out.print("Participante " + menor + " anos - " + respostaMen + "\nParticpante " + meio + " anos - "
                + respostaMei + "\nParticipante " + maior + " anos - " + respostaMa);

        s.close();
    }
}
