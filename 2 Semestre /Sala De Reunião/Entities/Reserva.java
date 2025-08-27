package Entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Reserva {

    private int id;
    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraFim;
    private Sala sala;
    private List<Funcionario> listaFuncionarios;

    public Reserva(int id, LocalDateTime dataHoraInicio,LocalDateTime dataHoraFim, Sala sala, Funcionario funcionario){
        listaFuncionarios = new ArrayList<>();
        setId(id);
        setDataHoraInicio(dataHoraInicio);
        setDataHoraFim(dataHoraFim);
        setSala(sala);
        listaFuncionarios.add(funcionario);
    }

    // id
    public int getId(){
        return id;
    }

    public void setId(int id) throws IllegalArgumentException{
        if (id < 0){
            throw new IllegalArgumentException("O id da sala não pode ser menor que 0");
        }
        this.id = id;
    }


    // data Inicio
    public LocalDateTime getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(LocalDateTime dataHoraInicio) throws IllegalArgumentException {
        if (dataHoraInicio == null){
            throw new IllegalArgumentException("O horário não é válido");
        }
        this.dataHoraInicio = dataHoraInicio;
    }

    // data Fim
    public LocalDateTime getDataHoraFim() {
        return dataHoraFim;
    }

    //TODO - fazer data de inicio e fim igual - fim somente pedir hora
    public void setDataHoraFim(LocalDateTime dataHoraFim) throws IllegalArgumentException {
        if (dataHoraFim == null){
            throw new IllegalArgumentException("O horário não é válido");
        }
        this.dataHoraFim = dataHoraFim;
    }

    public LocalDateTime getHoraFim() {
        return dataHoraFim;
    }

    public void setHoraFim(LocalDateTime dataHoraFim) throws IllegalArgumentException {
        if (dataHoraFim == null){
            throw new IllegalArgumentException("O horário não é válido");
        }
        this.dataHoraFim = dataHoraFim;
    }
    // sala
    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }



    // funcionário
    public List<Funcionario> getListaFuncionarios(){
        return listaFuncionarios;
    }

    public boolean adicionarFuncionario(int id){
        for(Funcionario funcionario: listaFuncionarios){
            if (id == funcionario.getId()){
                listaFuncionarios.add(funcionario);
                return true;
            }
        }
        return false;
    }


    public void RemoverFunc(String nome) {
        for (Funcionario i : listaFuncionarios) {
            if (i.getNome().equals(nome)) {
                listaFuncionarios.remove(i);
            }
        }
    }


    // to string
    public String toString() {
        String funcionariosStr = "";
        for (Funcionario f : listaFuncionarios) {
            funcionariosStr += "- " + f.getNome() + "\n";
        }

        return "\nId: " + id +
                "\nData e Horário de início da Reserva: " + dataHoraInicio +
                "\nData e Horário de fim da Reserva: " + dataHoraFim +
                "\nSala: " + sala +
                "\nLista de Funcionários:\n" + funcionariosStr;
    }
}
