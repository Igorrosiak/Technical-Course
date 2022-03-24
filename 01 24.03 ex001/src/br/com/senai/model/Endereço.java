package br.com.senai.model;

public class Endereço {

    private String rua;
    private int numero;

    public Endereço(String rua, int numero){
        this.rua = rua;
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "\nEndereço: " +
                "Rua " + rua +
                "\nNumero: " + numero;
    }
}
