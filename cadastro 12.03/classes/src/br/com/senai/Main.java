package br.com.senai;

import br.com.senai.model.Usuario;

public class Main {

    public static void main(String[] args) {

        Usuario igor = new Usuario();
        igor.setNome("Igor Luiz Belter Rosiak");
        igor.setEmail("Igorluizbelterrosiak@gmail.com");
        igor.setTelefone("48-9-8842-5374");
        igor.setEndereço("Braulina Machado, 51");
        igor.setCpf("129.078.329.22");

        System.out.println(igor);
    }
}
