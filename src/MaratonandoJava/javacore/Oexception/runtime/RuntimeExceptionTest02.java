package MaratonandoJava.javacore.Oexception.runtime;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(1, 9));
    }

    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Numero ilegal, nao pode ser 0...");
        }
        return 0;
    }
}
