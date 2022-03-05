package br.com.senai;

import br.com.senai.model.Veiculo;

public class Main {

    public static void main(String args[]){
        //sout
        System.out.println ("ola batibati");
        Veiculo veiculo = new Veiculo();

        veiculo.setPlaca("DX4-FDF94");

        veiculo.acelerar(40);
        System.out.println(veiculo);
        veiculo.frear(30);
        System.out.println(veiculo);
    }
}
