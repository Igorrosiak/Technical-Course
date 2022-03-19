package br.com.senai.model;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private String email;
    private String telefone;

    public Pessoa(String nome, String sobrenome, String email, String telefone){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.telefone = telefone;
    }
    public Pessoa(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    public Pessoa(){}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
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

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nSobrenome: " + sobrenome +
                "\nEmail: " + email +
                "\nTelefone: " + telefone;
    }
}
