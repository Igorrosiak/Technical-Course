package br.com.senai.model;

//Classe
public class Veiculo {
    //atributos
    private int velocidade;
    private String placa;
    //métodos da classe
    public void acelerar(int valor){
        velocidade += valor;
    }
    public void frear(int valor){
        velocidade -= valor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "velocidade=" + velocidade +
                ", placa='" + placa + '\'' +
                '}';
    }
}
