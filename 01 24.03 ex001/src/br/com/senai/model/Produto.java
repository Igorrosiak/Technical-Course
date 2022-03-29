package br.com.senai.model;

public class Produto {

    private String nome;
    private double preço;
    private int quantidade;

    public Produto(){}
    public Produto(String nome, double preço){
        this.nome = nome;
        this.preço = preço;
    }
    public Produto(String nome, double preço, int quantidade) {
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreço() {
        return preço;
    }
    public void setPreço(double preço) {
        this.preço = preço;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return  "\nProduto: " + nome +
                "\nPreço: " + preço +
                "\nQuantidade: " + quantidade;
    }
}
