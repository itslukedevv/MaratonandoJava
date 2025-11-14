package MaratonandoJava.javacore.Oexception.exception.test;

import MaratonandoJava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }
    private static void logar() throws LoginInvalidoException {
        Scanner sc = new Scanner(System.in);
        String usernameDB = "goku";
        String passwordDB = "ssj";

        System.out.println("Digite seu username: ");
        String username = sc.nextLine();
        System.out.println("Digite sua password: ");
        String password = sc.nextLine();
        if (!username.equals(usernameDB) || !password.equals(passwordDB)) {
            throw new LoginInvalidoException("Usuario ou senha invalidos");
        }
        System.out.println("Usuario logado com sucesso!");
    }
}
