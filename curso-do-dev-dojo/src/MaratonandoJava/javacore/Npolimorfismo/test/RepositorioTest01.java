package MaratonandoJava.javacore.Npolimorfismo.test;

import MaratonandoJava.javacore.Npolimorfismo.repositorio.Repositorio;
import MaratonandoJava.javacore.Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio= new RepositorioMemoria();
        repositorio.salvar();
    }
}
