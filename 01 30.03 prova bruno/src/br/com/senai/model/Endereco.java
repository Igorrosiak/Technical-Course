package br.com.senai.model;

public class Endereco {

    private String id;
    private String cep;
    private int numero;

    public Endereco(String id, String cep, int numero){
        this.id = id;
        this.cep = cep;
        this.numero = numero;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return  id +
                "\nCEP: " + cep +
                "\nNumero: " + numero;
    }
}
