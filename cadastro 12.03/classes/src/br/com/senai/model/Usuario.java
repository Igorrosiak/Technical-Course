package br.com.senai.model;

public class Usuario {

    private String nome;
    private String email;
    private String telefone;

    //construtor
    public Usuario(String n, String e, String t){
        this.nome = n;
        this.email = e;
        this.telefone = t;
    }

    //getter and setter
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
