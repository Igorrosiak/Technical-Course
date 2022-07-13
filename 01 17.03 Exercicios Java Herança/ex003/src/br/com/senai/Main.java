package br.com.senai;

import br.com.senai.model.Cliente;
import br.com.senai.model.Funcionario;
import br.com.senai.model.Pessoa;

public class Main {

    public static void main(String[] args) {

        Funcionario figor = new Funcionario("Limpeza", 30, 50,
                "Igor Luiz", "Belter Rosiak", "igorluizbelterrosiak", "988425345");

        Cliente cigor = new Cliente("13/06/2021", "igor luiz",
                "belter rosiak", "igorluizbelterrosiak@gmail.com", "988425374");

        System.out.println(figor);
        System.out.println(cigor);
    }
}
