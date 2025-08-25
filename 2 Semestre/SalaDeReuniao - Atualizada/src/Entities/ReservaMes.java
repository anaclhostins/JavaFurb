package Entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReservaMes {

    private List<Reserva> reservas;

    public ReservaMes() {
        reservas = new ArrayList<>();
    }

    public void adicionarReserva(Reserva reserva){
        reservas.add(reserva);
    }

    public void removerReserva(int idReserva){
       for(Reserva reserva: reservas){
           if (idReserva == reserva.getId()){
               reservas.remove(reserva);
           }
       }
    }

    public void mostrarReservas(){
        int i = 1;
        for (Reserva reserva: reservas){
            System.out.println("Reserva " + i);
            System.out.println(reserva);
            i += 1;
        }
    }



    public void Realocar(int id, LocalDateTime dataNova) {
        for (Reserva i : reservas) {
            if (i.getId() == id) {
                i.setDataHora(dataNova);
            }
        }
    }

}



