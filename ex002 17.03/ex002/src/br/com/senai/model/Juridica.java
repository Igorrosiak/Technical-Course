package br.com.senai.model;

public class Juridica extends Pessoa{

    private String cnpj;
    private String ie;

    public Juridica(String nome, Endereço endereço,String cnpj, String ie){
        super(nome, endereço);
        this.ie = ie;
        this.cnpj = cnpj;
    }
    public Juridica(String nome, String cnpj, String ie){
        super(nome);
        this.cnpj = cnpj;
        this.ie = ie;
    }
    public Juridica(String nome, String ie){
        super(nome);
        this.ie = ie;
    }
    public Juridica(String cnpj){
        this.cnpj = cnpj;
    }
    public Juridica(){}

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getIe() {
        return ie;
    }
    public void setIe(String ie) {
        this.ie = ie;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCNPJ: " + cnpj + "\nIE: " + ie;
    }
}
