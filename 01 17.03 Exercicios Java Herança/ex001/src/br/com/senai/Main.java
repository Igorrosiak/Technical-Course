package br.com.senai;

import br.com.senai.model.Caminhao;
import br.com.senai.model.Carro;
import br.com.senai.model.Marca;

public class Main {
    public static void main(String[] args) {

        Marca mercedesbenz = new Marca("Mercedes-Benz", "Marca renomeada " +
                "no mercado por ter carros rápidos, atuais e velozes");

        Caminhao Ipiranga = new Caminhao("Mercedes", 23, mercedesbenz);
        Carro Petrobras = new Carro("I30", 4, mercedesbenz);


        System.out.println(Ipiranga);
        System.out.println(Petrobras);
    }
}
