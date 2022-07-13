package br.com.senai.model;

public class Endereço {

    private String cidade;
    private String bairro;
    private String rua;
    private String numero;

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getRua() {
        return rua;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Endereço{" +
                "cidade= '" + cidade + '\'' +
                ", bairro= '" + bairro + '\'' +
                ", rua= '" + rua + '\'' +
                ", numero= '" + numero + '\'' +
                '}';
    }
}
