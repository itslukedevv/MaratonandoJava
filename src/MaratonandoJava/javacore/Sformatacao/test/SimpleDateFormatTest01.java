package MaratonandoJava.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Sabará' dd 'de' MMM 'de' yyyy 'at' HH:mm:ss z";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
        try {
            System.out.println(sdf.parse("Sabará 25 de nov. de 2025 at 13:41:43 BRT"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
