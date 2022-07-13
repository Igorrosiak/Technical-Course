package br.com.senai;

import br.com.senai.model.Cliente;
import br.com.senai.model.Conta;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Conta conta = new Conta();

        cliente.setCpf("129.078.329.21");
        cliente.setNome("Igor Rosiak");
        cliente.setConta(conta);

        conta.setSaldo(1000);
        conta.setNumero(12345);
        conta.setLimite(2000);

        System.out.println(cliente);

    }
}
