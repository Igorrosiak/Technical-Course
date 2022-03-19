package br.com.senai;

import br.com.senai.model.Endereço;
import br.com.senai.model.Fisica;
import br.com.senai.model.Juridica;

public class Main {

    public static void main(String[] args) {

    Endereço casaigor = new Endereço("Braulina Machado", 51, "Vargem Grande", "328420394");

    Juridica igoreireli = new Juridica("Igor Rosiak", casaigor, "12231", "3244");

    Fisica igorrsk = new Fisica("1293956345", "34255", "Igor Rosiak", casaigor);

        System.out.println(igoreireli);
        System.out.println(igorrsk);
    }
}
