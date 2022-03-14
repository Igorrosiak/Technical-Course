package br.com.senai.model;

public class Pagamento {

    private String cartão;
    private String boleto;
    private int valor;

    public Pagamento(String cartão, String boleto, int valor) {
        this.cartão = cartão;
        this.boleto = boleto;
        this.valor = valor;
    }

    public String getCartão() {
        return cartão;
    }
    public void setCartão(String cartão) {
        this.cartão = cartão;
    }
    public String getBoleto() {
        return boleto;
    }
    public void setBoleto(String boleto) {
        this.boleto = boleto;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Forma de Pagamento{" +
                "cartão='" + cartão + '\'' +
                ", boleto='" + boleto + '\'' +
                ", valor=" + valor +
                '}';
    }
}
