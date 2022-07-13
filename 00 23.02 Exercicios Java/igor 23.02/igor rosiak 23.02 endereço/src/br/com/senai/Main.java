package br.com.senai;

import br.com.senai.model.Endereço;

public class Main {

    public static void main(String[] args) {

        Endereço endereço = new Endereço();

        endereço.setCidade("Florianópolis");
        endereço.setBairro("Vargem Grande");
        endereço.setRua("Servidão Braulina Machado");
        endereço.setNumero("51");

        System.out.println(endereço);

    }
}
