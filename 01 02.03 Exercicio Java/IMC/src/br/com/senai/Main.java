package br.com.senai;

import br.com.senai.model.IMC;

public class Main {

    public static void main(String[] args) {

        IMC imc1 = new IMC();

        imc1.setPeso(80);
        imc1.setAltura(1.80);
        imc1.calcularImc();
        imc1.calcularResultado();

        System.out.println(imc1);
    }
}
