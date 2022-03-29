package br.com.senai.model;

import java.util.ArrayList;

public class Clube {

    private String nomeclube;
    private ArrayList<Jogador> jogadores;

    public Clube(String nomeclube) {
        this.nomeclube = nomeclube;
    }

    public String getNomeclube() {
        return nomeclube;
    }
    public void setNomeclube(String nomeclube) {
        this.nomeclube = nomeclube;
    }
    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }
    public void setJogadores(){
        ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
        jogadores.add(new Jogador("Bruno", 18));
        jogadores.add(new Jogador("Pet", 21));
        jogadores.add(new Jogador("Diego", 32));
        jogadores.add(new Jogador("Bernardo", 29));
        jogadores.add(new Jogador("Xando", 25));
        jogadores.add(new Jogador("Igor", 18));
        jogadores.add(new Jogador("Gabriel", 35));
        jogadores.add(new Jogador("Gabi Senna", 22));
        jogadores.add(new Jogador("Mauricio", 34));
        jogadores.add(new Jogador("Ary", 23));
        jogadores.add(new Jogador("Matheus", 17));

        for (int i=0; i< jogadores.size(); i++);
    };

    @Override
    public String toString() {
        return "\nClube: " + nomeclube +
                "\nJogadores: " + jogadores;
    }
}
