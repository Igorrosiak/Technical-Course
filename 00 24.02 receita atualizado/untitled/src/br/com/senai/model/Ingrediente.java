package br.com.senai.model;

public class Ingrediente {
    private String nome;
    private int quantidade;
    private String unidadeDeMedida;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getUnidadeDeMedida() {
        return unidadeDeMedida;
    }
    public void setUnidadeDeMedida(String unidadeDeMedida) {
        this.unidadeDeMedida = unidadeDeMedida;
    }

    @Override
    public String toString() {
        return  "\n" + nome +
                "\n quantidade= " + quantidade + ", " +
                "unidade De Medida= " + unidadeDeMedida ;
    }
}