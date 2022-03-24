package br.com.senai;

import br.com.senai.model.Cliente;
import br.com.senai.model.Conta;

public class Main {
    public static void main (String [] args){
        Conta conta = new Conta();
        conta.setNumero(123);
        conta.depositar(200);
        conta.depositar(400);
        conta.sacar(300);

        Cliente cliente = new Cliente();
        cliente.setNome("João");
        cliente.setCpf("142.987.568-45");
        cliente.setConta(conta);
        System.out.println(cliente);
    }
}
