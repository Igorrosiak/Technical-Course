package br.com.senai.model;

public class Cliente extends Pessoa{

    private String email;

    public Cliente(String nome, String cpf, String email, Endereço endereço){
        super(nome, cpf, endereço);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEmail: " + email;
    }
}
