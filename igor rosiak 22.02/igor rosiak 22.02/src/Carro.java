public class Carro {

    //atributos
    public int id;
    public int ano;
    public String modelo;
    public String placa;
    public String cor;

     public void Imprimir(){
         System.out.println("cor: " + cor
                 +"\nano: " + ano
                 +"\nmodelo: " + modelo
                 +"\nplaca: " + placa
                 +"\nid: " + id);
     }

     public void ImprimirModelo(){
         System.out.println(modelo);
     }

    }

