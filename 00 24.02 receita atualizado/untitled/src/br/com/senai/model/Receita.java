package br.com.senai.model;

import java.util.ArrayList;

public class Receita {
    private String nome;
    private String descricao;
    private Ingrediente ingrediente;
    private ArrayList<Ingrediente> ingredientes;

    public Receita(){
        ingredientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;}
    public void setNome(String nome) {
        this.nome = nome;}
    public String getDescricao() {
        return descricao;}
    public void setDescricao(String descricao) {
        this.descricao = descricao;}
    public Ingrediente getIngrediente() {
        return ingrediente;}
    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;}

    public void setIngrediente(String nome, int qtde, String UM){
        Ingrediente ingrediente = new Ingrediente();
        ingrediente.setNome(nome);
        ingrediente.setQuantidade(qtde);
        ingrediente.setUnidadeDeMedida(UM);

        ingredientes.add(ingrediente);
    }

    @Override
    public String toString() {
        return "Receita: " + nome +
                "\n desrição: " + descricao +
                "\n Lista de ingredientes: " + ingredientes +
                '.';
    }
}