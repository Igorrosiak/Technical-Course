package br.com.senai.model;

public class Carro extends Veiculo{

    private int portas;

    public Carro(String nome, int portas, Marca marca){
        super(nome, marca);
        this.portas = portas;
    }
    public Carro(String nome, int portas){
        super(nome);
        this.portas = portas;
    }
    public Carro(String nome, Marca marca){
        super(nome, marca);
    }
    public Carro(int portas, Marca marca){
        super(marca);
        this.portas = portas;
    }
    public Carro(){}

    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public String toString() {
        return  "\nCarro: " + super.toString() +
                "\nPortas: " + portas;
    }
}
