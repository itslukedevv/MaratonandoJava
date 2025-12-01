package MaratonandoJava.javacore.Rdates.teste;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime niver = LocalDateTime.of(2005, Month.JANUARY, 5, 17, 0, 0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(niver, now));
        System.out.println(ChronoUnit.WEEKS.between(niver, now));
        System.out.println(ChronoUnit.MONTHS.between(niver, now));
        System.out.println(ChronoUnit.YEARS.between(niver, now));
        System.out.println(ChronoUnit.DECADES.between(niver, now));
        System.out.println(ChronoUnit.SECONDS.between(niver, now));
        System.out.println(ChronoUnit.MINUTES.between(niver, now));
        System.out.println(ChronoUnit.ERAS.between(niver, now));

    }
}
