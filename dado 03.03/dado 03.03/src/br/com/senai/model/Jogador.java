package br.com.senai.model;

public class Jogador {

    private int dado1;
    private int dado2;
    private String nome;
    private String resultado;

    public int getDado1() {
        return dado1;
    }
    public void setDado1(int dado1) {
        this.dado1 = dado1;
    }
    public int getDado2() {
        return dado2;
    }
    public void setDado2(int dado2) {
        this.dado2 = dado2;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getResultado() {
        return resultado;
    }
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Jogador: " + nome +
                "\ndado1=" + dado1 +
                "\ndado2=" + dado2 +
                "\nnome='" + nome +
                "\nresultado='" + resultado;
    }
}
