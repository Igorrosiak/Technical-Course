package br.com.senai.model;

public class Aluno extends Pessoa{

    private double nota1;
    private double nota2;
    private double media;

    public Aluno(double nota1, double nota2, String nome){
        super(nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    public Aluno(double nota1, double nota2){
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    public Aluno(String nome){
        super(nome);
    }
    public Aluno(){}

    public  void calcularMedia(){
        media = (nota1 + nota2) / 2;
    }

    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return "\nAluno: " + super.toString() +
                "\nNota1: " + nota1 +
                "\nNota2: " + nota2 +
                "\nMédia: " + media;
    }
}