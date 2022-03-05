package br.com.senai;

import br.com.senai.model.Receita;

public class Main {
    public static void main (String [] args){
        Receita receita1 = new Receita();
        receita1.setNome("Bolo de chocolate");
        receita1.setDescricao("Bolo da vovó");
        receita1.setIngrediente("chocolate", 200, "g");
        receita1.setIngrediente("farinha", 500, "g");
        receita1.setIngrediente("ovos", 3, "unidade");
        receita1.setIngrediente("Açúcar", 2, "xícaras");
        System.out.println(receita1);
    }
}