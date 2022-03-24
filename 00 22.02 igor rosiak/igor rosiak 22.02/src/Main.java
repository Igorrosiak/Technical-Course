public class Main {
    public static void main (String []args){
        System.out.println("Hello world");

        //criar um objeto do tipo carro

        Carro p = new Carro();

        //atribuição dos valores nos atributos

        p.id = 102030;
        p.ano = 2010;
        p.cor = "azul";
        p.modelo = "compass";
        p.placa = "HDK20F3";

        p.Imprimir();
        p.ImprimirModelo();
    }
}
