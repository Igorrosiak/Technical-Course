package br.com.senai;

import br.com.senai.model.Conta;

public class Main {

    public static void main (String args[]) {
        System.out.println("Iniciando Backling");
        Conta conta1 = new Conta();
        conta1.setNumeroAgencia("123-4")
        conta1.setNumeroConta("334476-3")
        System.out.println(conta1.depositar(35));
        System.out.println(conta1.depositar(40));

        if (conta1.sacar(100) <= 0){
            System.out.println("você está sem saldo");
    }
        System.out.println(conta1.toString());

        Conta conta2 = new Conta();
        conta2.setNumeroAgencia("123-4");
        conta2.setNumeroConta("223344-7");
        System.out.println(conta2.depositar(1000));
        System.out.println(conta2.sacar(100));
        System.out.println(conta2.toString());

    }
}
