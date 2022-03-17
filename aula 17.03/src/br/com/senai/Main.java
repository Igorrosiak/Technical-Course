package br.com.senai;

import br.com.senai.model.Caminhao;
import br.com.senai.model.Carro;
import br.com.senai.model.Veiculo;

public class Main {
    public static void main(String[] args) {

        Carro pjo = new Carro();
        pjo.setNome("Civic");
        pjo.setMarca("Honda");
        pjo.setPortas(4);

        Caminhao mercedes = new Caminhao();
        mercedes.setNome("Benz");
        mercedes.setMarca("Mercedes");
        mercedes.setEixos(8);

        System.out.println(pjo);
        System.out.println(mercedes);
    }
}
