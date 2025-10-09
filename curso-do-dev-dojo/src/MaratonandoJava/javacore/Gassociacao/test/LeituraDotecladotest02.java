package MaratonandoJava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDotecladotest02 {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
        System.out.println("O grande software de previsao do futuro");
        System.out.println("Digite sua pergunta e eu responderei sim ou nao");
        String pergunta = entrada.nextLine();
        if(pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }
    }
}
