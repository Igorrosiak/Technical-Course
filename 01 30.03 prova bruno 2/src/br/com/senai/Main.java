package br.com.senai;

import br.com.senai.model.Biblioteca;
import br.com.senai.model.Livro;

public class Main {
    public static void main(String[] args) {

        Biblioteca saraiva = new Biblioteca(1, "");
        saraiva.setLivros(1, "", "");
        saraiva.setLivros(2, "", "");
        saraiva.setLivros(3, "", "");
        saraiva.setLivros(4, "", "");
        saraiva.setLivros(5, "", "");
        saraiva.ImprimirBiblioteca();

        Biblioteca davila = new Biblioteca(2, "");
        davila.setLivros(1, "", "");
        davila.setLivros(2, "", "");
        davila.setLivros(3, "", "");
        davila.setLivros(4, "", "");
        davila.setLivros(5, "", "");
        davila.ImprimirBiblioteca();
    }
}
