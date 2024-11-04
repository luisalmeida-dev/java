package org.example.dateAndTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateAndTime {
    static LocalDateTime localDateTime = LocalDateTime.now();
    static LocalDateTime localDateTimeParse = LocalDateTime.parse("2015-02-20T06:30:00");
    static LocalDateTime localDateTimeOf = LocalDateTime.of(2000, Month.OCTOBER, 7, 10, 7, 30);

    static LocalDate localDate = LocalDate.now();
    static LocalDate localDateOf = LocalDate.of(2000, 10, 7);
    static LocalDate localDateParse = LocalDate.parse("2000-10-07");

    static LocalTime localTime = LocalTime.now();
    static LocalTime localTimeParse = LocalTime.parse("10:07");
    static LocalTime localTimeOf = LocalTime.of(10, 7, 0);

    static ZoneId zoneId = ZoneId.of("Asia/Tokyo");

    static ZoneOffset offset = ZoneOffset.of("+02:00");

    public static void main(String[] args) {
        System.out.println("Usos do LocalDate:\n");

        //LocalDate
        System.out.println("LocalDate: " + localDate);
        System.out.println("LocalDate.of: " + localDateOf);
        System.out.println("LocalDate.parse: " + localDateParse);

        System.out.println("Data atual: " + localDate + " -> Data + 1 dia: " + localDate.plusDays(1));
        System.out.println("Data atual: " + localDate + " -> Data menos um mes: " + localDate.minusMonths(1));

        System.out.println("Dia da semana: " + localDate.getDayOfWeek());
        System.out.println("Dia do mes: " + localDate.getDayOfMonth());

        System.out.println("É ano bissexto? " + localDate.isLeapYear());
        System.out.println(localDate + " é antes de 2016-06-12? " + localDate.isBefore(LocalDate.parse("2016-06-12")));
        System.out.println(localDate + " é depois de 2016-04-20? " + localDate.isAfter(LocalDate.parse("2016-04-20")));

        System.out.println("LocalDateTime do comeco do dia: " + localDate.atStartOfDay());
        System.out.println("LocalDate do comeco do mes:" + LocalDate.parse("2016-04-20").with(TemporalAdjusters.firstDayOfMonth()));

        //LocalTime
        System.out.println("\nUsos do LocalTime:\n");
        System.out.println("LocalTime: " + localTime);
        System.out.println("LocalTimeOf: " + localTimeOf);
        System.out.println("LocalTimeParse: " + localTimeParse);

        System.out.println("Horario atual: " + localTime + " -> Horario + 1 hora: " + localTime.plusHours(1));

        System.out.println("Get da hora: " + localTime.getHour());
        System.out.println(localTime + " é antes de 12:30? " + localTime.isBefore(LocalTime.parse("12:30")));

        System.out.println("Tempo maximo: " + LocalTime.MAX);
        System.out.println("Tempo minimo: " + LocalTime.MIN);
        System.out.println("Meia noite: " + LocalTime.MIDNIGHT);

        //LocalDateTime
        System.out.println("\nUsos do LocalDateTime:\n");

        System.out.println("LocalDateTime: " + localDateTime);
        System.out.println("LocalDateTimeParse: " + localDateTimeParse);
        System.out.println("LocalDateTimeOf: " + localDateTimeOf);

        System.out.println("Data e tempo atual: " + localDateTime + " -> Data e tempo + 1 dia: " + localDateTime.plusDays(1));
        System.out.println("Data e tempo atual: " + localDateTime + " -> Data e tempo + menos 8 horas: " + localDateTime.minusHours(8));

        System.out.println("Get de mes da data: " + localDateTime.getMonth());

        //ZonedDateTime
        System.out.println("\nUsos do ZonedDateTime:\n");

        System.out.println("ZoneId: " + zoneId);
        System.out.println("Lista de fuso-horarios disponiveis: " + ZoneId.getAvailableZoneIds());

        System.out.println("LocalDateTime convertido para ZonedDateTime: " + ZonedDateTime.of(localDateTime, zoneId));
        System.out.println("ZonedDateTimeParse: " + ZonedDateTime.parse("2015-05-03T10:15:30+01:00[Europe/Paris]"));

        System.out.println("Data e tempo com OFFSET: " + OffsetDateTime.of(localDateTime, offset));

        //Period e Duration
        System.out.println("\nUsos do Period e Duration:\n");
        System.out.println("Data atual: " + localDate + " -> Data + 5 dias utilizando Period: " + localDate.plus(Period.ofDays(5)));
        System.out.println("Get de dias utilizando period: " + Period.between(localDate, localDateOf).getDays());
        System.out.println("Diferenca utilizando unidade especifica: " + ChronoUnit.YEARS.between(localDateOf, localDate));

        System.out.println("Hora atual: " + localTime + " -> Hora + 30 segundos: " + localTime.plus(Duration.ofSeconds(30)));
        System.out.println("Duracao entre dois instantes em segundos: " + Duration.between(localTime, localTimeOf).getSeconds());
        System.out.println("Duracao utilizando unidade especifica: " + ChronoUnit.MINUTES.between(localTime, localTimeOf));

        //Formatacao de Data e Tempo
        System.out.println("\nFormatacao de data e tempo:\n");

        System.out.println("LocalDateTimeOf atual: " + localDateTimeOf + " -> LocalDateTimeOf formatado para padrao ISO_DATE: " + localDateTimeOf.format(DateTimeFormatter.ISO_DATE));
        System.out.println("LocalDateTime atual: " + localDateTime + " -> LocalDateTime formatacao personalido 'yyyy/MM/dd': " + localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}