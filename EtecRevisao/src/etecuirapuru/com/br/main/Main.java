package etecuirapuru.com.br.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner LerOQueUsuarioDigita = new Scanner(System.in);
        String nomeUsuario;

        System.out.println("Digite seu nome: ");
        nomeUsuario = LerOQueUsuarioDigita.next();

        int rmAluno;
        System.out.println("Digite seu RM: ");
        rmAluno = LerOQueUsuarioDigita.nextInt();

        String isQuerIrEmboraCedo;
        System.out.println("Quer ir embora mais cedo? (S - N) ");
        isQuerIrEmboraCedo = LerOQueUsuarioDigita.next();
        
        if(isQuerIrEmboraCedo.toLowerCase().equals("s")){
            isQuerIrEmboraCedo = "Sim";
        }else{
            isQuerIrEmboraCedo = "Não";
        }
        
        
        System.out.println("");
        System.out.println("---- INFORMAÇÕES ALUNO ----");
        System.out.println("");
        System.out.println("Nome: " + nomeUsuario
                + "\nRM: " + rmAluno + 
                "\nPretende sair cedo: " + isQuerIrEmboraCedo
        );
        System.out.println("");
        System.out.println("---- ---- ----");
        System.out.println("");

    }
}
