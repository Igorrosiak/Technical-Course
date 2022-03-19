package br.com.senai.model;

public class Conta {
    //Atributos
    private double saldo;
    private double limite;
    private int numero;

    //Construtor
    public Conta() {limite = 1000;}

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", limite=" + limite +
                ", numero=" + numero +
                '}';
    }

    public void depositar (double valor) {saldo += valor;}
    public double sacar (double valor){
        if (valor <= (saldo + limite)){
            double aux = 0;
            if (valor > saldo){
                aux = valor - saldo;
                saldo = 0;
                limite -= aux;
                return valor;
            } else {
                saldo -= valor;
                return valor;
            }
        } else {
            return 0;
        }
    }
}