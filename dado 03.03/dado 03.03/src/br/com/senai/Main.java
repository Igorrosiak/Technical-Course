package br.com.senai;

import br.com.senai.model.Jogador;

public class Main {

    public static void main(String[] args) {

        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();

        jogador1.setNome("Cleber");
        jogador2.setNome("João");

        System.out.println(jogador1);
        System.out.println(jogador2);
    }
}





