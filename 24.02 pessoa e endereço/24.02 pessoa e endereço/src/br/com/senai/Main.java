package br.com.senai;

import br.com.senai.model.Endereço;
import br.com.senai.model.Pessoa;

public class Main {

    public static void main(String[] args) {

        Endereço endereço = new Endereço();
        Pessoa pessoa = new Pessoa();

        endereço.setCidade("Florianópolis");
        endereço.setBairro("Vargem Grande");
        endereço.setRua("Servidão Braulina Machado");
        endereço.setNumero("51");

        pessoa.setNome("Igor");
        pessoa.setDatanascimento("13/06/2005");
        pessoa.setEndereço(endereço);

        System.out.println(pessoa);


    }
}
