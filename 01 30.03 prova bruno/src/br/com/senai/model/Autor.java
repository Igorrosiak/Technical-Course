package br.com.senai.model;

public class Autor extends Pessoa{

    private String id;

    public Autor(String nome, Endereco endereco, String id) {
        super(nome, endereco);
        this.id = id;
    }
    public Autor(){}

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\nID Autor: " + id + "\nAutor: " + super.toString();
    }
}
