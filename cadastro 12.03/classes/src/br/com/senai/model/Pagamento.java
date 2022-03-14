package br.com.senai.model;

public class Pagamento {

    private String fdpg;
    private int valor;

    public String getFdpg() {
        return fdpg;
    }
    public void setFdpg(String fdpg) {
        this.fdpg = fdpg;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = 4000;
    }

    @Override
    public String toString() {
        return "\nForma de Pagamento: " + fdpg +
                "\nValor: " + valor;
    }
}
