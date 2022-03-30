package br.com.senai.model;

import java.util.ArrayList;

public class Biblioteca {

    private String nomebiblioteca;
    private int idbiblioteca;
    private Livro livro;
    private ArrayList<Livro> arraylivros;

    public Biblioteca(int idbiblioteca, String nomebiblioteca) {
        this.idbiblioteca = idbiblioteca;
        this.nomebiblioteca = nomebiblioteca;
        arraylivros = new ArrayList<>();
    }

    public int getIdbiblioteca() {
        return idbiblioteca;
    }
    public void setIdbiblioteca(int idbiblioteca) {
        this.idbiblioteca = idbiblioteca;
    }
    public String getNomebiblioteca() {
        return nomebiblioteca;
    }
    public void setNomebiblioteca(String nomebiblioteca) {
        this.nomebiblioteca = nomebiblioteca;
    }
    public Livro getLivro() {
        return livro;
    }
    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    public ArrayList<Livro> getLivros() {
        return arraylivros;
    }

    public void setLivros(int idlivro, String titulo, String autor) {
        Livro livro = new Livro();
        livro.setIdlivro(idlivro);
        livro.setTitulo(titulo);
        livro.setAutor(autor);

        arraylivros.add(livro);
    }

    //Impressão (toString)
    public void ImprimirBiblioteca(){
        System.out.println("\nBiblioteca = " + nomebiblioteca +
                "\nId Biblioteca = " + nomebiblioteca +
                "\n\nLivros = ");

        for (int i = 0; i < arraylivros.size(); i++){
            System.out.println(arraylivros.get(i));
        }
    }
}
