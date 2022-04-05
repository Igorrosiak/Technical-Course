package br.com.senai;

import br.com.senai.model.Autor;
import br.com.senai.model.Biblioteca;
import br.com.senai.model.Endereco;
import br.com.senai.model.Livro;

public class Main {
    public static void main(String[] args) {

        Autor RickRiordan = new Autor("Rick Riordan", new Endereco("1", "88000-001", 1), "000");
        Autor Henrique = new Autor("Henrique Lima", new Endereco("2", "88000-002", 2), "001");
        Autor Castro = new Autor("Lucas Catro", new Endereco("3", "88000-003", 3), "002");
        Autor Bandeira = new Autor("Bruno Bandeira", new Endereco("4", "88000-004", 4), "003");

        Biblioteca paranaense = new Biblioteca(1, "Biblioteca Paranaense");
        paranaense.setLivros(1, "No Seu Olhar", Castro);
        paranaense.setLivros(2, "Fogo e Sangue", Henrique);
        paranaense.setLivros(3, "E Não Sobrou Nenhum", RickRiordan);
        paranaense.setLivros(4, "Harry Potter", Henrique);
        paranaense.setLivros(5, "O Último Reino", Castro);
        paranaense.ImprimirBiblioteca();

        Biblioteca catarinense = new Biblioteca(2, "Biblioteca Catarinense");
        catarinense.setLivros(1, "It a Coisa", Castro);
        catarinense.setLivros(2, "O Pequeno Principe", Henrique);
        catarinense.setLivros(3, "Percy Jackson, O Ladrão de Raios", RickRiordan);
        catarinense.setLivros(4, "Percy Jackson, O Mar de Monstros", Bandeira);
        catarinense.setLivros(5, "Percy Jackson, A Maldição do Titã", RickRiordan);
        catarinense.ImprimirBiblioteca();

        paranaense.ImprimirIdBiblioteca();
        catarinense.ImprimirIdBiblioteca();

        catarinense.ImprimirLivrosAutor(RickRiordan);
    }
}
