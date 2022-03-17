package br.com.senai.model;

public class Marca {

    public Marca(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }

    private String nome;
    private String descricao;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "\nNome da Marca: " + nome +
                "\nDescricao: " + descricao;
    }
}
