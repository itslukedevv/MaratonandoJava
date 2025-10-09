package MaratonandoJava.javacore.Bintroducaometodos.dominio;

import java.util.Scanner;


public class Calculadora {
    Scanner scanner = new Scanner(System.in);


    public void somaDoisNumeros() {
        System.out.println(10 + 10);

    }

    public void subtraiDoisNumeros() {
        System.out.println(20 - 11);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public int divideDoisNumeros(double num1, double num2) {
        while (num2 == 0) {
            System.out.println("insira um numero diferente de 0");
            num2 = scanner.nextDouble();
        }
        return (int) (num1 / num2);
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("nao existe divisao por zero");
        } else {
            System.out.println(num1 / num2);
        }
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
