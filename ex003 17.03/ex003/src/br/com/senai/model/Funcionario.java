package br.com.senai.model;

public class Funcionario extends Pessoa{

    private String funcao;
    private double salario;

    public Funcionario(String funcao, double qtdeHoras, double valorHora, String nome, String sobrenome, String email, String telefone){
        super(nome, sobrenome, email, telefone);
        this.funcao = funcao;
        this.setSalario(qtdeHoras, valorHora);
    }

    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double valorHora, double qtdeHoraTrabalhada) {
        salario = valorHora * qtdeHoraTrabalhada;
    }

    @Override
    public String toString() {
        return "\nFuncionário: " + super.toString() + "\nFunção: " + funcao +
                "\nSalário: " + salario;
    }
}
