package MaratonandoJava.javacore.Npolimorfismo.test;

import MaratonandoJava.javacore.Npolimorfismo.dominio.Computador;
import MaratonandoJava.javacore.Npolimorfismo.dominio.Produto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("ryzen9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto);
    }

}
