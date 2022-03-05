package br.com.senai.model;

public class Cliente {

    private String nome;
    private String cpf;
    private Conta conta;

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Conta getConta() {
        return conta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome
                + "\nCPF: " + cpf + conta;
    }
}
