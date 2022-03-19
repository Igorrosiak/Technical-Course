package br.com.senai.model;

public class Professor extends Pessoa{

    private double horasTrabalhadas;
    private double valorHora;
    private double salario;

    public Professor(String nome, double horasTrabalhadas, double valorHora){
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }
    public Professor(double horasTrabalhadas, double valorHora){
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public Professor(String nome){
        super(nome);
    }
    public Professor(){}

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario() {
        salario = getHorasTrabalhadas() * getValorHora();
    }

    @Override
    public String toString() {
        return "\nProfessor: " + super.toString() +
                "\nHoras Trabalhadas: " + horasTrabalhadas +
                "\nValor por Hora: " + valorHora +
                "\nSalário: " + salario;
    }
}
