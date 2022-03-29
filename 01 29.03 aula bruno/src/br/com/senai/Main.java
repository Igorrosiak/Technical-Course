package br.com.senai;

import br.com.senai.model.Clube;
import br.com.senai.model.Pessoa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        ArrayList<Pessoa> numero = new ArrayList<Pessoa>();
//
//        numero.add(new Pessoa("Anna", 18));
//        numero.add(new Pessoa("Breno", 21));
//        numero.add(new Pessoa("Carla", 17));

//        for (int i=0; i< numero.size(); i++){
//            System.out.println(numero.get(i));
//        }

    Clube flamengo = new Clube("Flamengo");
    flamengo.getJogadores();
    flamengo.setJogadores();

    System.out.println(flamengo);

    }
}
