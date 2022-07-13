package br.com.senai;

import br.com.senai.model.Conta;

public class Main {
    public static void main(String[] args) {

        Conta conta1 = new Conta();
        conta1.setNumeroAgencia("345-12\n");
        conta1.setNumeroConta("3223-55\n");

        conta1.sacar(23);
        conta1.depositar(53);

        System.out.println(conta1);


    }
}
