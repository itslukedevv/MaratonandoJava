package MaratonandoJava.javacore.Lclassesabstratas.test;

import MaratonandoJava.javacore.Lclassesabstratas.dominio.Dev;
import MaratonandoJava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente Gerente = new Gerente("nami", 5000);
        Dev dev = new Dev("Toya", 12000);

        System.out.println(Gerente);
        System.out.println(dev);
        Gerente.imprime();
        dev.imprime();
    }
}
