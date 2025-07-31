package M08_DataHora;

//import org.w3c.dom.ls.LSOutput;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class calculosDataHora {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2025-07-18");
        LocalDateTime d05 = LocalDateTime.parse("2025-07-18T16:14:00");
        Instant d06 = Instant.parse("2025-07-18T16:14:00Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);
        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        // calcular duração entre duas data/hora
        Duration t1 = Duration.between(pastWeekLocalDate.atTime(0,0), d04.atTime(0,0));
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
    }
}

