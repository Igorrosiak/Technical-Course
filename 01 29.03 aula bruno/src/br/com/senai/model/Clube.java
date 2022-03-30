package br.com.senai.model;

import java.util.ArrayList;

public class Clube {

    private String nomeclube;
    private Jogador jogador;
    private ArrayList<Jogador> arrayjogadores;

    public Clube(String nomeclube){
        this.nomeclube = nomeclube;
        arrayjogadores = new ArrayList<>();
    }
    public Clube(){
        arrayjogadores = new ArrayList<>();
    }

    public String getNomeclube() {
        return nomeclube;
    }
    public void setNomeclube(String nomeclube) {
        this.nomeclube = nomeclube;
    }
    public Jogador getJogador() {
        return jogador;
    }
    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public ArrayList<Jogador> getArrayjogadores() {
        return arrayjogadores;
    }

    public void setJogadores(){
        arrayjogadores.add(new Jogador("Igor Rosiak", 19));
        arrayjogadores.add(new Jogador("Bruno", 18));
        arrayjogadores.add(new Jogador("Igor Rosiak", 19));
        arrayjogadores.add(new Jogador("Pet", 21));
        arrayjogadores.add(new Jogador("Diego", 32));
        arrayjogadores.add(new Jogador("Bernardo", 29));
        arrayjogadores.add(new Jogador("Xando", 25));
        arrayjogadores.add(new Jogador("Gabriel", 35));
        arrayjogadores.add(new Jogador("Gabi Senna", 22));
        arrayjogadores.add(new Jogador("Mauricio", 34));
        arrayjogadores.add(new Jogador("Ary", 23));
        arrayjogadores.add(new Jogador("Matheus", 17));
    }

    public void imprimir(){
        System.out.println("\nClube: " + nomeclube);
        arrayjogadores.forEach(e -> System.out.println(e));
    }
}
