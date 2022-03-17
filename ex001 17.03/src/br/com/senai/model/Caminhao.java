package br.com.senai.model;

public class Caminhao extends Veiculo{

    private int qtdEixos;

    public Caminhao(String nome, int qtdEixos, Marca marca){
        super(nome, marca);
        this.qtdEixos = qtdEixos;
    }

    public int getQtdEixos() {
        return qtdEixos;
    }
    public void setQtdEixos(int qtdEixos) {
        this.qtdEixos = qtdEixos;
    }

    @Override
    public String toString() {
        return  "Caminhao: " + getNome() +
                "\nQuantidade de Eixos: " + qtdEixos;
    }
}
