package MaratonandoJava.exercices;

import MaratonandoJava.exercices.classesdosexericicos.carro;

public class exercicioOAB {
    public static void main(String[] args) {

        carro carro1 = new carro();
        carro carro2 = new carro();

        carro1.Modelo = "celta";
        carro1.ano = 2021;
        carro1.Nome = "volkswagen";

        carro2.Modelo = "coca-cola";
        carro2.ano = 2025;
        carro2.Nome = "coca-cola";

        System.out.println(carro1.Modelo + " " + carro1.ano + " " + carro1.Nome);
        System.out.println(carro2.Modelo + " " + carro2.ano + " " + carro2.Nome);

    }
}
