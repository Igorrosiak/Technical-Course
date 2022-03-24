package br.com.senai.model;

public class Pessoa {

    private String nome;
    private Endereço endereço;

    public Pessoa(String nome, Endereço endereço){
        this.nome = nome;
        this.endereço = endereço;
    }
    public Pessoa(String nome){
        this.nome = nome;
    }
    public Pessoa(){}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nPessoa: " + nome + endereço;
    }
}
