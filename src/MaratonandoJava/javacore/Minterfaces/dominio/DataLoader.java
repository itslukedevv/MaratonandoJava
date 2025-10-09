package MaratonandoJava.javacore.Minterfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;

    void load();

    default void checkPermission() {
        System.out.println("Checking permission");
    }
    public static void retriveMaxDataSize() {
        System.out.println("Dentro do retriveMaxDataSize da interface");
    }
}
