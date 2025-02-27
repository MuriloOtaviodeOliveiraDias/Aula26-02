package Murilo.metodo;

import java.util.Scanner;

public class Calculadora {
    

    
    void adicao(){
        Scanner x = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor");
        int valor1 = x.nextInt();
        
        System.out.println("Digite o segundo valor");
        int valor2 = x.nextInt();

        int resultado = valor1 + valor2;
        
        System.out.println("O valor da soma é: " + resultado);
    }
    void subtracao(){
        Scanner x = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor");
        int valor1 = x.nextInt();
        
        System.out.println("Digite o segundo valor");
        int valor2 = x.nextInt();
        
        int resultado = valor1 - valor2;
 
        System.out.println("O valor da subtração é: " + resultado);
    }
    void multipicacao(){
        Scanner x = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor");
        int valor1 = x.nextInt();
        
        System.out.println("Digite o segundo valor");
        int valor2 = x.nextInt();
        
        int resultado = valor1 * valor2;
    
        System.out.println("O valor da multiplicação é: " + resultado);
    }
    void divisao(){
        
        Scanner x = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor");
        int valor1 = x.nextInt();
        
        System.out.println("Digite o segundo valor");
        int valor2 = x.nextInt();

        int resultado = valor1 / valor2;
        
        System.out.println("O valor da divisão é: " + resultado);
    }
    
}
