package MaratonandoJava.javacore.Oexception.exception.test;

import MaratonandoJava.javacore.Oexception.exception.dominio.Funcionario;
import MaratonandoJava.javacore.Oexception.exception.dominio.LoginInvalidoException;
import MaratonandoJava.javacore.Oexception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComException01 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Funcionario f1 = new Funcionario();


        try {
            f1.salvar();
        } catch (LoginInvalidoException e ) {
            e.printStackTrace();
        }
    }
}
