package br.com.senai.model;

public class Cliente extends Pessoa{

    private String dataCadastro;

    public Cliente(String dataCadastro, String nome, String sobrenome, String email, String telefone){
        super(nome, sobrenome, telefone, email);
        this.dataCadastro = dataCadastro;
    }
    public Cliente(String dataCadastro){
        this.dataCadastro = dataCadastro;
    }
    public Cliente(){}

    public String getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "\nCliente: " + super.toString() + "\nData de Cadastro: " + dataCadastro;
    }
}
