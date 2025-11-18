package MaratonandoJava.javacore.Rdates.teste;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date d = new Date();
        d.setTime(d.getTime()+3_600_000);
        System.out.println(d);

    }
}
