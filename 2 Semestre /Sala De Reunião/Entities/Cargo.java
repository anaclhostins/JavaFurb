package Entities;

public class Cargo {

    private String cargo;

    public Cargo() {
    }

    public Cargo(String cargo) {
        setCargo(cargo);   // usa o setter no construtor
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) throws IllegalArgumentException{
        if (cargo == null || cargo.trim().isEmpty()){
            throw new IllegalArgumentException("Cargo não pode ser nulo");
        }

        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Cargo: " + cargo;
    }
}