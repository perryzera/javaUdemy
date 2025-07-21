package M08_DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class A02_dataHora_paraTexto {

    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2025-07-18");
        LocalDateTime d05 = LocalDateTime.parse("2025-07-18T16:14:00");
        Instant d06 = Instant.parse("2025-07-18T16:14:00Z");

        // FORMATANDO DATA para sair da forma que foi solicitado "x/xx/xxxx"
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // FORMATANDO DATA e HORA para sair da forma com que foi solicitado "x/xx/xxxx"
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(d04));
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("d05 = " + d05.format(fmt1));
        System.out.println("d05 = " + d05.format(fmt2));

        System.out.println("");

    }
}
