package br.com.senai;

import br.com.senai.model.Conta;

public class Main {

    public static void main (String args[]) {
        System.out.println("oi");
        Conta conta1 = new Conta();
        conta1.depositar(40);
        conta1.depositar(40);
        System.out.println(conta1.getSaldo());
        if (conta1.sacar(100) == -150){
            System.out.println("voce está sem saldo");
        }else {
            System.out.println(conta1.getSaldo());
        }

    }
}
