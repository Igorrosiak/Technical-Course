package br.com.senai;

import br.com.senai.model.Caminhao;
import br.com.senai.model.Marca;

public class Main {
    public static void main(String[] args) {

        Marca mercedesbenz = new Marca("Mercedes-Benz", "Marca renomeada " +
                "no mercado por ter carros rápidos, atuais e velozes");

        Caminhao IGOR = new Caminhao("Mercedes", 23, mercedesbenz);

        System.out.println(IGOR);
    }
}
