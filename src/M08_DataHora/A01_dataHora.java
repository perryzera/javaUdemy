package M08_DataHora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class A01_dataHora {

    public static void main(String[] args) {
        // ACEITAR outro formato de DATA e HORA
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // DATA de agora
        LocalDate d01 = LocalDate.now();
        // DATA + HORA de agora
        LocalDateTime d02 = LocalDateTime.now();
        // DATA + HORA de agora
        Instant d03 = Instant.now();
        // DATA específica
        LocalDate d04 = LocalDate.parse("2025-07-19");
        // DATA e HORA específica
        LocalDateTime d05 = LocalDateTime.parse("2025-05-09T05:30:05");
        // DATA e HORA global específica
        Instant d06 = Instant.parse("2025-05-09T18:30:00Z");
        // DATA e HORA com fuso-horário
        Instant d07 = Instant.parse("2025-05-09T18:30:00-04:00");
        // DATA com o formato escolhido
        LocalDate d08 = LocalDate.parse("20/07/2025", fmt1);
        // DATA e HORA com o formato escolhido
        LocalDateTime d09 = LocalDateTime.parse("20/07/2025 01:30", fmt2);
        // DATA com o formato escolhido
        LocalDate d10 = LocalDate.of(2025, 07, 18);
        // DATA e HORA com o formato escolhido
        LocalDateTime d11 = LocalDateTime.of(2025, 07, 18,16, 30);

        System.out.println("d01 = " + d01.toString());
        System.out.println("d02 = " + d02.toString());
        System.out.println("d03 = " + d03.toString());
        System.out.println("d04 = " + d04.toString());
        System.out.println("d05 = " + d05.toString());
        System.out.println("d06 = " + d06.toString());
        System.out.println("d07 = " + d07.toString());
        System.out.println("d08 = " + d08.toString());
        System.out.println("d09 = " + d09.toString());
        System.out.println("d10 = " + d10.toString());
        System.out.println("d11 = " + d11.toString());

    }
}