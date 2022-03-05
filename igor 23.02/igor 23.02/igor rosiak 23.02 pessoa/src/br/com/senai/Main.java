package br.com.senai;

import br.com.senai.model.Pessoa;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nHello World\n");

        Pessoa igor = new Pessoa();

        igor.setNome("Igor Luiz Belter Rosiak");
        igor.setDatanascimento("13/06/05");

        System.out.println(igor);

    }
}
