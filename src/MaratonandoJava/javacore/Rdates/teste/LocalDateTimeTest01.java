package MaratonandoJava.javacore.Rdates.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2022, Month.AUGUST,6);
        LocalDate date1 = LocalDate.parse("2022-02-06");
        LocalTime time = LocalTime.of(9,45,21);
        LocalTime time1 = LocalTime.parse("09:45:00");
        System.out.println(localDateTime);
        System.out.println(date1);
        System.out.println(time1);
        LocalDateTime ldt1 = date.atTime(time1);
        System.out.println(ldt1);

    }
}