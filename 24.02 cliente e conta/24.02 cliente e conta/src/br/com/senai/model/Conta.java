package br.com.senai.model;

public class Conta {

    private double saldo;
    private double limite;
    private int numero;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public String toString(){
        return "\nSaldo: " + saldo
                + "\nLimite: " + limite
                + "\nNúmero " + numero;
    }
}
