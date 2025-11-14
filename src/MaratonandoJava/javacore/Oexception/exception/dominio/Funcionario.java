package MaratonandoJava.javacore.Oexception.exception.dominio;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Funcionario extends Pessoa{
    @Override
    public void salvar() throws LoginInvalidoException, IOException {
        System.out.println("salvando funcionario");
    }
}
