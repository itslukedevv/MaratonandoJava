package MaratonandoJava.javacore.Minterfaces.test;

import MaratonandoJava.javacore.Minterfaces.dominio.DataLoader;
import MaratonandoJava.javacore.Minterfaces.dominio.DatabaseLoader;
import MaratonandoJava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader loader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        loader.load();
        fileLoader.load();
        System.out.println(" ");

        loader.remove();
        fileLoader.remove();
        System.out.println(" ");

        loader.checkPermission();
        fileLoader.checkPermission();
        System.out.println(" ");

        DataLoader.retriveMaxDataSize();
        DatabaseLoader.retriveMaxDataSize();

    }
}
