package MaratonandoJava.introducaoi.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String categoria;

        System.out.print("Insira sua idade: ");
        int idade = entrada.nextInt();

        if (idade < 15) {
            categoria = "Infantil";
        } else if (idade >= 15 && idade < 18 ) {
            categoria = "Juvenil";
        } else {
            categoria = "Adulto";
        }

        System.out.println("sua categoria é: " + categoria);

    }
}
