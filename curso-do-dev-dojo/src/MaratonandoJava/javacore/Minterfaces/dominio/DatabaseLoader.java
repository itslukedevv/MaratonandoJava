package MaratonandoJava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Loading data from database...");

    }

    @Override
    public void remove() {
        System.out.println("Removing data from database...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permission in database...");
    }

    public static void retriveMaxDataSize() {
        System.out.println("Dentro do retriveMaxDataSize na classe DatabaseLoader...");
    }
}
