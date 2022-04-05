package br.com.senai.model;

import java.util.ArrayList;

public class Biblioteca {

    //Atributos
    private int idbiblioteca;
    private String nomebiblioteca;
    private Livro livro;
    private ArrayList<Livro> arraylivros;

    //Construtores
    public Biblioteca(int idbiblioteca, String nomebiblioteca) {
        this.idbiblioteca = idbiblioteca;
        this.nomebiblioteca = nomebiblioteca;
        arraylivros = new ArrayList<>();
    }
    public Biblioteca(){}

    //Getters and Setters
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

    //Array Livros
    public void setLivros(int idlivro, String titulo, Autor autor) {
        Livro livro = new Livro();
        livro.setIdlivro(idlivro);
        livro.setTitulo(titulo);
        livro.setAutor(autor);

        arraylivros.add(livro);
    }

    public void ImprimirIdBiblioteca(){
        System.out.println("\nID da Biblioteca " + nomebiblioteca + ": " + getIdbiblioteca());
    }

    public void ImprimirLivrosAutor(Autor autor){
        System.out.println("Nome do Autor: " + autor + "Livros: ");
        for (int i = 0; i < arraylivros.size(); i++){
            if(arraylivros.get(i).getAutor() == autor)
            System.out.println(arraylivros.get(i).getAutor());
        }
    }

    //for(int i=0; i < vetorConta.length; i++)
    //{
    //System.out.println("A conta "+vetorConta[i].getIdConta()+ " contém o saldo: R$"+vetorConta[i].getSaldo()+"0 ");
    //
    //}

    //Impressão (toString)
    public void ImprimirBiblioteca(){
        System.out.println("\nID Biblioteca: " + idbiblioteca +
                "\nNome Da Biblioteca: " + nomebiblioteca +
                "\n\nLivros: ");

        for (int i = 0; i < arraylivros.size(); i++){
            System.out.println(arraylivros.get(i));
        }
    }
}
