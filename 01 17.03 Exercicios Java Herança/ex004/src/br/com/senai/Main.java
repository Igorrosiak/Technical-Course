package br.com.senai;

import br.com.senai.model.Aluno;
import br.com.senai.model.Professor;

public class Main {
    public static void main(String[] args) {

        Professor pigor = new Professor("Igor Rosiak", 23, 43);
        pigor.setSalario();

        Aluno aigor = new Aluno(7, 9, "Igor Rosiak");
        aigor.calcularMedia();

        System.out.println(aigor);
        System.out.println(pigor);
    }
}
