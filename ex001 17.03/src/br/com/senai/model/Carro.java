package br.com.senai.model;

public class Carro extends Veiculo{

    private int portas;

    public Carro(String nome, int portas, Marca marca){
        super(nome, marca);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public String toString() {
        return "Carro: " + super.toString() +
                "\nPortas:" + portas;
    }
}
