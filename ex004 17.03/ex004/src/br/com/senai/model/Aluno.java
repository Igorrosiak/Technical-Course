package br.com.senai.model;

public class Aluno extends Pessoa{

    private String nota1;
    private String nota2;

    public Aluno(String nota1, String nota2, String nome){
        super(nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    public Aluno(String nota1, String nota2){
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    public Aluno(String nome){
        super(nome);
    }
    public Aluno(){}

    public  void calcularMedia(double nota1, double nota2){
        media = (nota1 + nota2 /2);
    }

    public String getNota1() {
        return nota1;
    }
    public void setNota1(String nota1) {
        this.nota1 = nota1;
    }
    public String getNota2() {
        return nota2;
    }
    public void setNota2(String nota2) {
        this.nota2 = nota2;
    }

    @Override
    public String toString() {
        return "\nAluno: " + super.toString() +
                "\nNota1: " + nota1 +
                "\nNota2: " + nota2 +
                "\nMédia: ";
    }
}
