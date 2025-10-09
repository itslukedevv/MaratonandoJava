package MaratonandoJava.introducaoi.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("insira sua idade: ");
        int idade = entrada.nextInt();

        boolean AutorizationForAlcool = idade > 18;

        if (AutorizationForAlcool) {
            System.out.println("Pode beber");
        } else
            System.out.println("Nao pode beber");
    }
}
