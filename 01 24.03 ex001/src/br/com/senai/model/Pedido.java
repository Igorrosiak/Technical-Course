package br.com.senai.model;

import java.util.Date;

public class Pedido {

    private String data;
    private ItensDoPedido itensdopedido;
    private Cliente cliente;

    public Pedido(String data, ItensDoPedido itensdopedido, Cliente cliente) {
        this.data = data;
        this.itensdopedido = itensdopedido;
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public ItensDoPedido getItensdopedido() {
        return itensdopedido;
    }
    public void setItensdopedido(ItensDoPedido itensdopedido) {
        this.itensdopedido = itensdopedido;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "\nPedido: " +
                "\n\nData: " + data +
                "\n\nCliente: " + cliente +
                "\n\n" + itensdopedido;

    }
}
