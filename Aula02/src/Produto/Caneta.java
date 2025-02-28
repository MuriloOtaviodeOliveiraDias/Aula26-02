package Produto;


public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    
    void tampar(){
        tampada = true;
        
    }
    void destambar(){
        tampada = false;
    }
    void mostrar(){
        modelo = "bic";
        cor = "azul";
        ponta = 0.7f;
        carga = 80;
 
        System.out.println("Dados do Produto " + "\n" + "Modelo "+ modelo +"\n"+"Cor "+ cor +"\n" +
                "Ponta " + ponta+"\n"+"Carga "+carga);
    }
}
