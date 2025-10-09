package MaratonandoJava.javacore.Npolimorfismo.test;

import MaratonandoJava.javacore.Npolimorfismo.dominio.Computador;
import MaratonandoJava.javacore.Npolimorfismo.dominio.Televisao;
import MaratonandoJava.javacore.Npolimorfismo.dominio.Tomate;
import MaratonandoJava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC1", 11000);
        Tomate tomate = new Tomate("Tomate", 10);
        Televisao tv = new Televisao("samsung 50\" ", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------------");
        CalculadoraImposto.calcularImposto(tv);


    }
}
