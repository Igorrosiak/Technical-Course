package br.com.senai.model;

public class ItensDoPedido {

    private double total;
    private int quantidade;
    private Produto produto;

    public ItensDoPedido(double total, int quantidade, Produto produto){
        this.total = total;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "ItensDoPedido:\n" + produto +
                "Total: " + total +
                "Quantidade: " + quantidade;
    }
}
