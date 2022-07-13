package br.com.senai.model;

public class Caminhao extends Veiculo{

    private int qtdEixos;

    public Caminhao(String nome, int qtdEixos, Marca marca){
        super(nome, marca);
        this.qtdEixos = qtdEixos;
    }
    public Caminhao(String nome, Marca marca){
        super(nome, marca);
    }
    public Caminhao(String nome, int qtdEixos){
        super(nome);
        this.qtdEixos = qtdEixos;
    }
    public Caminhao(Marca marca, int qtdEixos){
        super(marca);
        this.qtdEixos = qtdEixos;
    }
    public Caminhao(){}

    public int getQtdEixos() {
        return qtdEixos;
    }
    public void setQtdEixos(int qtdEixos) {
        this.qtdEixos = qtdEixos;
    }

    @Override
    public String toString() {
        return  "\nCaminhao: " + getNome() +
                "\nQuantidade de Eixos: " + qtdEixos +
                "\nMarca: " + getMarca();
    }
}
