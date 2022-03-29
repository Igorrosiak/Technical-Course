package br.com.senai.model;

import java.util.ArrayList;

public class ItensDoPedido {

    private double total;
    private Produto produto;
    private ArrayList<Produto> produtos;

    public ItensDoPedido(){
        produtos = new ArrayList<>();
    }

    public double getTotal() {
        return total;
    }
    public void setProduto(String nome, double preço, int quantidade){
        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setPreço(preço);
        produto.setQuantidade(quantidade);
        produtos.add(produto);

        total += preço * quantidade;
    }

    @Override
    public String toString() {
        return "\nItensDoPedido: " +
                produtos +
                "\n\nTotal: " + total;
    }
}