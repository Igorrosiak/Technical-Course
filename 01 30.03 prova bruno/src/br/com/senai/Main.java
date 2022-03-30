package br.com.senai;

import br.com.senai.model.Biblioteca;
import br.com.senai.model.Livro;

public class Main {
    public static void main(String[] args) {

        Biblioteca paranaense = new Biblioteca(1, "Biblioteca Paranaense");
        paranaense.setLivros(1, "No Seu Olhar", "Nicholas Sparks");
        paranaense.setLivros(2, "Fogo e Sangue", "George R. R. Martin");
        paranaense.setLivros(3, "E Não Sobrou Nenhum", "Agatha Christie");
        paranaense.setLivros(4, "Harry Potter", "J.K Rowling");
        paranaense.setLivros(5, "O Último Reino", "Bernard Cornwell");
        paranaense.ImprimirBiblioteca();

        Biblioteca catarinense = new Biblioteca(2, "Biblioteca Catarinense");
        catarinense.setLivros(1, "It a Coisa", "Stephen King");
        catarinense.setLivros(2, "O Pequeno Principe", "Antoine de Saint-Exupéry");
        catarinense.setLivros(3, "Percy Jackson, O Ladrão de Raios", "Rick Riordan");
        catarinense.setLivros(4, "Percy Jackson, O Mar de Monstros", "Rick Riordan");
        catarinense.setLivros(5, "Percy Jackson, A Maldição do Titã", "Rick Riordan");
        catarinense.ImprimirBiblioteca();
    }
}
