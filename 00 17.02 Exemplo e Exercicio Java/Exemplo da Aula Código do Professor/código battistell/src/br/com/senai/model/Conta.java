package br.com.senai.model;

public class Conta {

    private String numeroAgencia;
    private String numeroConta;
    private double saldo;

    public double depositar(double valor){
        return saldo += valor;
    }

    public double sacar(double valor){
        if (saldo - valor < 0){
            return 0;
        } else {
            return saldo -= valor;
        }
    }

    public String getNumeroAgencia(){
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia){
        this.numeroAgencia = numeroAgencia;
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numeroAgencia='" + numeroAgencia + '\'' +
                ", numeroConta='" + numeroConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
