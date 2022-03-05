package br.com.senai.model;

public class Pessoa {

    private String nome;
    private String datanascimento;
    private Endereço endereço;

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", datanascimento='" + datanascimento + '\'' +
                ", endereço=" + endereço +
                '}';
    }
}
