package br.com.senai.model;

public class Caminhao extends Veiculo{

    private int eixos;

    public Caminhao(){}
    public Caminhao(String nome, String marca){
        super(nome, marca);
    }

    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEixos: " + eixos;
    }
}
