package br.com.senai.model;

import java.util.ArrayList;

public class Biblioteca {

    //Atributos
    private int idbiblioteca;
    private String nomebiblioteca;
    private Livro livro;
    private ArrayList<Livro> arraylivros;
    private Endereco endereco;

    //Construtores
    public Biblioteca(int idbiblioteca, String nomebiblioteca, Endereco endereco) {
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
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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

    public void ImprimirLivrosAutor(Autor nomeautorbuscado){
        System.out.println("\nLivros: ");
        for (int i = 0; i < arraylivros.size(); i++){
            if(arraylivros.get(i).getAutor().getNome().equals(nomeautorbuscado.getNome()))
            System.out.println(arraylivros.get(i).getTitulo()+"\nAutor: "+ arraylivros.get(i).getAutor().getNome());
        }
    }

    //for(int i=0; i < vetorConta.length; i++)
    //{
    //System.out.println("A conta "+vetorConta[i].getIdConta()+ " cont??m o saldo: R$"+vetorConta[i].getSaldo()+"0 ");
    //
    //}

    //Impress??o (toString)
    public void ImprimirBiblioteca(){
        System.out.println("\nID Biblioteca: " + idbiblioteca +
                "\nNome Da Biblioteca: " + nomebiblioteca +
                "\nEndere??o: " + endereco +
                "\n\nLivros: ");

        for (int i = 0; i < arraylivros.size(); i++){
            System.out.println(arraylivros.get(i));
        }
    }
}
