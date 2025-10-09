package MaratonandoJava.javacore.Npolimorfismo.servico;

import MaratonandoJava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memoria");

    }
}
