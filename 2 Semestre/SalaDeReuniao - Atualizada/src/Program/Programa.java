package Program;

import Entities.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public Programa() {

        Scanner scanner = new Scanner(System.in);
        ReservaMes reservaMes = new ReservaMes();

        ArrayList<Sala> salas = new ArrayList<>();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        Sala sala1 = new Sala(1,5);
        Sala sala2 = new Sala(2,10);
        Sala sala3 = new Sala(3,15);
        salas.add(sala1);
        salas.add(sala2);
        salas.add(sala3);

        Cargo cargo1 = new Cargo("Software Developer");
        Cargo cargo2 = new Cargo("Tech Lead");
        Cargo cargo3 = new Cargo("Gerente");
        Cargo cargo4 = new Cargo("Estagiário");

        Funcionario funcionario1 = new Funcionario("José", cargo1, 200,100);
        Funcionario funcionario2 = new Funcionario("Maria", cargo2, 201, 101);
        Funcionario funcionario3 = new Funcionario("Pedro", cargo3, 202,102);
        Funcionario funcionario4 = new Funcionario("Julia", cargo4, 203, 103);
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);
        funcionarios.add(funcionario4);


        System.out.println("======= MENU =======");
        System.out.println("Selecione uma das opções: ");
        System.out.println("1 - Fazer nova reserva");
        System.out.println("2 - Alterar Data/Horário da Reserva");
        System.out.println("3 - Alterar Participante");
        System.out.println("4 - Listar Reserva");
        System.out.print("5 - Sair");
        int opcao = scanner.nextInt();

        while (opcao != 5) {
            switch (opcao) {
                case 1:
                    System.out.println("======= NOVA RESERVA =======");
                    System.out.println("Insira o id da Reunião: ");
                    int idReuniao = scanner.nextInt();


                    System.out.println("Insira o número da sala desejada: ");
                    for (Sala sala : salas) {
                        System.out.println("Sala de Reunião " + sala.getNumeroSala() + " - Número de Lugares: " + sala.getQntLugar());
                    }
                    int nmrSala = scanner.nextInt();
                    Sala salaEscolhida = buscarSala(salas, nmrSala);


                    System.out.print("Digite a data e hora (dd/MM/yyyy HH:mm): ");
                    scanner.nextLine(); // limpar buffer
                    String input = scanner.nextLine();

                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
                    LocalDateTime dataHora = LocalDateTime.parse(input, formatter);

                    System.out.println("Insira o id do funcionário responsável: ");
                    for (Funcionario funcionario : funcionarios) {
                        System.out.println(funcionario.getId() + " - " + funcionario.getNome());
                    }
                    int idFuncionarioResponsavel = scanner.nextInt();
                    Funcionario funcionarioResposavel = buscarFuncionario(funcionarios, idFuncionarioResponsavel);

                    Reserva reserva = new Reserva(idReuniao, dataHora, salaEscolhida, funcionarioResposavel);
                    reservaMes.adicionarReserva(reserva);

                    mostrarMenu();
                    opcao = scanner.nextInt();
                    break;

            }

        }
            reservaMes.mostrarReservas();
        scanner.close();
    }

    public void mostrarMenu() {
        System.out.println("\n--- SISTEMA DE RESERVA DE SALAS ---");
        System.out.println("1 - Cadastrar funcionário");
        System.out.println("2 - Cadastrar sala");
        System.out.println("3 - Criar reserva");
        System.out.println("4 - Adicionar funcionário em reserva");
        System.out.println("5 - Listar reservas");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    public Sala buscarSala(ArrayList<Sala> salas, int idReuniao){
        for(Sala sala: salas){
            if (sala.getNumeroSala() == idReuniao){
                return sala;
            }
        }
        return null;
    }

    public Funcionario buscarFuncionario (ArrayList<Funcionario> funcionarios, int idFuncionario){
        for (Funcionario funcionario: funcionarios){
            if(funcionario.getId() == idFuncionario){
                return funcionario;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Programa programa = new Programa();
    }
}