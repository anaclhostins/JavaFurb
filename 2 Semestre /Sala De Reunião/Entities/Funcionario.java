package Entities;

public class Funcionario {

    private String nome;
    private Cargo cargo;
    private int ramal;
    private int id;

    public Funcionario(String nome, Cargo cargo, int ramal, int id) {
        setNome(nome);
        setCargo(cargo);
        setRamal(ramal);
        setId(id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("O nome não pode ser vazio");
        }
        this.nome = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo){
        if (cargo == null){
            throw new IllegalArgumentException("O cargo não pode estar vazio");
        }
        this.cargo = cargo;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) throws IllegalArgumentException {
        if (ramal < 0){
            throw new IllegalArgumentException("O ramal não pode ser menor que 0");
        }
        this.ramal = ramal;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) throws IllegalArgumentException {
        if(id < 0){
            throw new IllegalArgumentException("O ID do Funcionário não pode ser menor que 0");
        }
        this.id = id;
    }

    @Override
    public String toString() {
        return "Funcionario" +
                "\nNome:" + nome +
                "\nCargo:" + cargo +
                "\nRamal: " + ramal +
                "\nId: " + id;
    }
}
