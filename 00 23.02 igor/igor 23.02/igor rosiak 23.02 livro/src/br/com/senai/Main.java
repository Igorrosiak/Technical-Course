package br.com.senai;

import br.com.senai.model.Livro;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nHello World\n");

        Livro itacoisa = new Livro();

        itacoisa.setTitulo("It a Coisa\n");
        itacoisa.setAutor("Stephen King\n");
        itacoisa.setEditora("Saraiva\n");
        itacoisa.setAno(1968);

        System.out.println(itacoisa);

    }
}
