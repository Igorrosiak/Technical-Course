package br.com.senai.model;

public abstract class Veiculo {
    private String nome;
    private String marca;

    public Veiculo(){}
    public Veiculo(String nome){
        this.nome = nome;
    }
    public Veiculo(String nome, String marca){
        this.nome = nome;
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "\nVeiculo: " +
                "\nNome: " + nome +
                "\nMarca: " + marca;
    }
}
