package MaratonandoJava.javacore.Npolimorfismo.test;

import MaratonandoJava.javacore.Npolimorfismo.dominio.Computador;
import MaratonandoJava.javacore.Npolimorfismo.dominio.Produto;
import MaratonandoJava.javacore.Npolimorfismo.dominio.Tomate;
import MaratonandoJava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("ryzen9", 3000);

        Tomate tomate = new Tomate("AMericano", 20);
        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-------------------");
        CalculadoraImposto.calcularImposto(produto);

    }

}
