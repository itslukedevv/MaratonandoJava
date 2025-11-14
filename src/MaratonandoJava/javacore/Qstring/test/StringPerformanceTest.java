package MaratonandoJava.javacore.Qstring.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30_000);
        long fim = System.currentTimeMillis();

        System.out.println("Time taken stringNormal: " + (fim - inicio) + "ms");


        inicio = System.currentTimeMillis();
        concatStringBuilder(1_000000);
        fim = System.currentTimeMillis();

        System.out.println("Time taken stringBuilder: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(1_000000);
        fim = System.currentTimeMillis();

        System.out.println("Time taken stringBuffer: " + (fim - inicio) + "ms");

    }

    private static void concatString(int tamanho) {
        String texto = "Ola mundo!";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }

    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }

    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }

    }
}
