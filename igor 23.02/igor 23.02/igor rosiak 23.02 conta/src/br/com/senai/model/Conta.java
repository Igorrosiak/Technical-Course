package br.com.senai.model;

//Classe conta
public class Conta {

    //Atributos
    private String numeroAgencia;
    private String numeroConta;
    private double saldo;

    public double sacar(double valor){
        return saldo -= valor;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    //Construtor
    public Conta(){
        saldo = 1000;
    }

    //Métodos
    public void setNumeroAgencia(String numeroAgencia){
        this.numeroAgencia = numeroAgencia;
    }

    public String getNumeroAgencia(){return numeroAgencia;}

    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    public String getNumeroConta(){return numeroConta;}

    //toString
    public String toString() {

    return "Agência: " + numeroAgencia +
            "Conta: " + numeroConta +
            "Saldo: " + saldo;

    }

}
