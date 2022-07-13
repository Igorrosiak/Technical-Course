package br.com.senai.model;

public class Endereço {

    private String rua;
    private int numero;
    private String bairro;
    private String cep;

    public Endereço(String rua, int numero, String bairro, String cep){
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
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
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "\nRua: " + rua +
                "\nNúmero: " + numero +
                "\nBairro: " + bairro +
                "\nCEP: " + cep;
    }
}
