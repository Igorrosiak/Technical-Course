package br.com.senai.model;

public class Livro {

    private String titulo;
    private String autor;
    private String editora;
    private int ano;


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEditora() {
        return editora;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "'Livro: " + titulo + '\'' +
                "Autor: " + autor + '\'' +
                "Editora: " + editora + '\'' +
                "Ano: " + ano
                ;
    }
}
