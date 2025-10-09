package MaratonandoJava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("digite seu nome abaixo: ");
        String nome = entrada.nextLine();
        System.out.println("Digite sua idade");
        int idade = entrada.nextInt();
        System.out.println("Digite seu sexo");
        char sexo = entrada.next().charAt(0);

        while (sexo != 'm' && sexo != 'f') {
            System.out.println("Caractere invalido, tente novamente.");
            sexo = entrada.next().charAt(0);
        }


        System.out.println("------------------------");
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(sexo);

        entrada.close();


    }


}
