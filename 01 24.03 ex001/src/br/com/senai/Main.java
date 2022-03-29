package br.com.senai;

import br.com.senai.model.*;

public class Main {
    public static void main(String[] args) {

        Cliente igor = new Cliente("Igor Rosiak", "4320948309", "Igorluizbelterrosiak@gmail.com", new Endereço("Braulina Machado", 51));

        ItensDoPedido itens = new ItensDoPedido();
        itens.setProduto("Cenoura Roxa", 20, 2);
        itens.setProduto("Banana Azul", 35, 3);
        itens.setProduto("Maçã Verde", 32, 4);
        itens.setProduto("Cebola Rosa", 10, 2);
        itens.setProduto("Pera Roxa", 5, 2);

        Pedido meuperu = new Pedido("23/10/2020", itens, igor);

        System.out.println(meuperu);
    }
}
