package M08_DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class A03_dataHoraGlobal_paraLocal {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2025-07-18");
        LocalDateTime d05 = LocalDateTime.parse("2025-07-18T16:14:00");
        Instant d06 = Instant.parse("2025-07-18T16:14:00Z");

        
    }
}
