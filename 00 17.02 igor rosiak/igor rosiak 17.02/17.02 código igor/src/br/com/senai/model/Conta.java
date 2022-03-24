package br.com.senai.model;

//Nome de classe sempre maiusculo
public class Conta {

    //atributos = caracteristicas do objeto
    private String numeroAgencia;
    private String numeroConta;
    private double saldo;

    //métodos
    public double depositar(double valor){
        return saldo += valor;
    }

    public double sacar(double valor){
        if (saldo - valor < 0){
            return -150;
        } else {
            return saldo -= valor;
        }

    }

    public double getSaldo(){
        return saldo;
    }
}


