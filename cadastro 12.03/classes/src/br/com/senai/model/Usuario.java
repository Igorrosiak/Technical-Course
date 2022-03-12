package br.com.senai.model;

public class Usuario {

    private String nome;
    private String email;
    private String telefone;
    private String endereço;
    private String cpf;

    //construtor
    public Usuario(){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereço = endereço;
        this.cpf = cpf;
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
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "\nUsuario:\n" +
                "\nNome: " + nome +
                "\nEmail: " + email +
                "\nTelefone: " + telefone +
                "\nEndereço: " + endereço +
                "\nCpf: " + cpf;
    }
}
