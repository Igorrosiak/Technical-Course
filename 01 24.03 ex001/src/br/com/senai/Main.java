package br.com.senai;

import br.com.senai.model.Cliente;
import br.com.senai.model.Endereço;

public class Main {
    public static void main(String[] args) {

        Cliente igor = new Cliente("Igor Rosiak", "4320948309", "Igorluizbelterrosiak@gmail.com", new Endereço("Braulina Machado", 51));

        System.out.println(igor);

    }
}
