package br.com.senai.model;

public class IMC {

    private double altura;
    private double peso;
    private double imc;
    private String resultado;

    public String getResultado() {
        return resultado;
    }
    public void calcularResultado() {

        if (imc < 18.5){
            this.resultado = "IMC abaixo do ideal";
        }   else if (imc < 25){
            this.resultado = "Peso Normal";
        }   else if (imc < 30){
            this.resultado = "Acima do Peso";
        }   else {
            this.resultado = "Obeso";
        }
    }
    public void calcularImc() {
        this.imc = peso / Math.pow(altura, 2);
    }
    public double getImc() {
        return imc;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPeso() {
        return peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "\nIMC: " + imc + "\nAltura: " + altura + "\nPeso: " + peso;
    }

}
