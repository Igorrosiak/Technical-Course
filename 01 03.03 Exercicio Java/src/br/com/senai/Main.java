package br.com.senai;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o seu peso: ");
        double peso = Double.parseDouble(entrada.nextLine());
        System.out.print("Informe sua altura: ");
        double altura = Double.parseDouble(entrada.nextLine());

        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);

        if(imc < 16){
            System.out.println("Sua classificação é Magreza grave");
        }
        else if((imc >= 16) && (imc < 17)){
            System.out.println("Sua classificação é Magreza moderada");
        }
        else if((imc >= 17) && (imc < 18.5)){
            System.out.println("Sua classificação é Magreza leve");
        }
        else if((imc >= 18.5) && (imc < 25)){
            System.out.println("Sua classificação é Saudável");
        }
        else if((imc >= 25) && (imc < 30)){
            System.out.println("Sua classificação é Sobrepeso");
        }
        else if((imc >= 30) && (imc < 35)){
            System.out.println("Sua classificação é Obesidade Grau I");
        }
        else if((imc >= 35) && (imc < 40)){
            System.out.println("Sua classificação é Obesidade Grau II");
        }
        else{
            System.out.println("Sua classificação é Obesidade Grau III (mórbida)");
        }

        System.out.println("\n");
    }
}
