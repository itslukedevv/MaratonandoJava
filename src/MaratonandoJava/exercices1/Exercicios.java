package MaratonandoJava.exercices1;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 2;
        String senha = " ";
        int somaPar = 0;

        if (n % 2 == 0) {
            System.out.println("é Par ");
        } else {
            System.out.println("é Impar ");
        }

        int n1 = 10;
        for (int i = 1; i <= n1; i++) {
            System.out.print(i);
        }
        int arr[] = {5, 2, 9, 1, 7};

        int maior = arr[0];
        int menor = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];

            if (temp < menor) {
                menor = temp;
            } else if (temp > maior) {
                maior = temp;
            }
        }
        System.out.println(maior);
        System.out.println(menor);


        System.out.println("Digite a senha:");
        senha = sc.nextLine();

        if (!senha.equals("a")) {
            System.out.println("senha incorreta");
            while (!senha.equals("a")) {
                System.out.println("Digite a senha:");
                System.out.println("senha incorreta");
                senha = sc.nextLine();
            }
        }
        System.out.println("sistema logado!");
        sc.close();

        int n2 = 100;

        for (int i = 1; i < n2; i++) {
            if (i % 2 == 0) {
                somaPar += i;
            }
        }
        System.out.println(somaPar);
    }
}

