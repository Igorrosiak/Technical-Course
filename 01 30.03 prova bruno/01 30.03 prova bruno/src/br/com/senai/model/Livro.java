package br.com.senai.model;

public class Livro {

    //Atributos
    private int idlivro;
    private String titulo;
    private Autor autor;

    //Construtores
    public Livro(int idlivro, String titulo, Autor autor) {
        this.idlivro = idlivro;
        this.titulo = titulo;
        this.autor = autor;
    }
    public Livro(){}

    //Getters and Setters
    public int getIdlivro() {
        return idlivro;
    }
    public void setIdlivro(int idlivro) {
        this.idlivro = idlivro;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    //Impressão (toString)
    @Override
    public String toString() {
        return "\nID Livro: " + idlivro +
                ", Titulo: " + titulo +
                ", Autor: " + autor;
    }
}
