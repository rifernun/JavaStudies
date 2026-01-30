package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program1 {
    public static void main(String[] args){

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        //formata com fuso horario do local que esta rodando o programa
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());


//        LocalDate d01 = LocalDate.now(); //sem hora
//        LocalDateTime d02 = LocalDateTime.now(); //com hora
//        Instant d03 = Instant.now(); //data-hora global

//        LocalDate d04 = LocalDate.parse("2026-01-23");
//        LocalDateTime d05 = LocalDateTime.parse("2026-01-23T13:28:10");
//        Instant d06 = Instant.parse("2026-01-23T13:28:10-03:00");
//
//        LocalDate d07 = LocalDate.parse("23/01/2026", fmt1);
//        LocalDate d08 = LocalDate.parse("23/01/2026 13:20", fmt2);
//
//        LocalDate d09 = LocalDate.of(2025,01,20);
//        LocalDateTime d10 = LocalDateTime.of(2025,01,20, 1, 30, 20);

        LocalDate d04 = LocalDate.parse("2026-01-23");
        LocalDateTime d05 = LocalDateTime.parse("2026-01-23T13:28:10");
        Instant d06 = Instant.parse("2026-01-23T13:28:10Z");

        LocalDate r01 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r02 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("r01 = " + r01);
        System.out.println("r02 = " + r02);
        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mes = " + d04.getMonthValue());
        System.out.println("d04 ano = " + d04.getYear());


        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 minute = " + d05.getMinute());



//        System.out.println("d04 = " + d04.format(fmt1)); // 23/01/2026
//        System.out.println("d05 = " + d05.format(fmt2)); // 23/01/2026 13:28
//        System.out.println("d06 = " + fmt3.format(d06)); // 23/01/2026 10:28
    }
}
