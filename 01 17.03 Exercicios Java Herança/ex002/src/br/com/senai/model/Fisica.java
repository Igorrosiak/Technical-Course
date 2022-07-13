package br.com.senai.model;

public class Fisica extends Pessoa{

    private String cpf;
    private String rg;

    public Fisica(String cpf, String rg, String nome, Endereço endereço){
        super(nome, endereço);
        this.cpf = cpf;
        this.rg = rg;
    }
    public Fisica(String cpf, String rg, String nome){
        super(nome);
        this.cpf = cpf;
        this.rg = rg;
    }
    public Fisica(String cpf, String rg){
        this.cpf = cpf;
        this.rg = rg;
    }
    public Fisica(String nome){
        super(nome);
    }
    public Fisica(){}

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCPF: " + cpf + "\nRG: " + rg;
    }
}
