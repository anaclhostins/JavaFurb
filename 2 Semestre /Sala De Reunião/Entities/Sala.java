package Entities;

import java.util.ArrayList;

public class Sala {

    private int numeroSala;
    private int qntLugar;

    public Sala(int numeroSala, int qntLugar){
        this.numeroSala = numeroSala;
        this.qntLugar = qntLugar;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) throws IllegalArgumentException{
        if (numeroSala < 0){
            throw new IllegalArgumentException("O número da sala não pode ser menor que 0");
        }
        this.numeroSala = numeroSala;
    }

    public int getQntLugar(){
        return qntLugar;
    }

    public void setQntLugar(int qntLugar){
        if (numeroSala < 0){
            throw new IllegalArgumentException("O número de lugares não pode ser menor que 0");
        }
        this.qntLugar = qntLugar;
    }

    @Override
    public String toString() {
        return "Sala de Reunião " + getNumeroSala();
    }
}
