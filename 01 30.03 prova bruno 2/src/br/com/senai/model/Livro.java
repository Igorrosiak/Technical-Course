package br.com.senai.model;

public class Livro {

    //Atributos
    private String autor;
    private String titulo;
    private int idlivro;


    //Construtores
    public Livro(int idlivro, String titulo, String autor) {
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
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    //Impressão (toString)
    @Override
    public String toString() {
        return "ID Livro: " + idlivro +
                ", Titulo: " + titulo +
                ", Autor: " + autor;
    }
}
