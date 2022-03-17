package br.com.senai.model;

public class Veiculo {

    private String nome;
    private Marca marca;

    public Veiculo(String nome, Marca marca){
        this.nome = nome;
        this.marca = marca;
    }

    public Marca getMarca() {
        return marca;
    }
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nVeiculo: " +
                "\nNome: " + nome;
    }
}
