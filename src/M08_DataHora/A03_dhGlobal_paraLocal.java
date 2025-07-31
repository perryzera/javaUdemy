package M08_DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class A03_dhGlobal_paraLocal {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2025-07-18");
        LocalDateTime d05 = LocalDateTime.parse("2025-07-18T16:14:00");
        Instant d06 = Instant.parse("2025-07-18T16:14:00Z");

        // vai converter o meu Instant para uma data local considerando o fuso-horário do meu computador
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);
        System.out.println("________________________");
        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 dia = " + d04.getMonthValue());
        System.out.println("d04 dia = " + d04.getYear());
        System.out.println("________________________");
        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 minuto = " + d05.getMinute());
        System.out.println("d05 segundo = " + d05.getSecond());

    }
}
