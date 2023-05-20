package br.com.projeto.capitulo10;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;


public class Exercicio01 {
    public static void main(String[] args) {
        /*Formatar data Observação Analisar a Documentação */
        DateTimeFormatter formatter01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate data01 = LocalDate.now();
        LocalDateTime data02 = LocalDateTime.now();
        Instant data03 = Instant.now();
        LocalDate data04 = LocalDate.parse("2023-05-17");
        LocalDateTime data05 = LocalDateTime.parse("2023-05-17T23:33:30");
        Instant data06 = Instant.parse("2023-05-17T23:30:30Z");
        Instant data07 = Instant.parse("2023-05-17T23:30:30-03:00");
        LocalDate data08 = LocalDate.parse("20/07/2023", formatter01);
        LocalDateTime data09 = LocalDateTime.parse("20/07/2023 01:30", formatter02);
        LocalDate data10 = LocalDate.of(2023, 5, 17);
        LocalDateTime data11 = LocalDateTime.of(2023, 05, 17, 23, 45, 11);

        System.out.println("Data01 " + data01);
        System.out.println("Data02 " + data02);
        System.out.println("Data03 " + data03);
        System.out.println("Data04 " + data04);
        System.out.println("Data05 " + data05);
        System.out.println("Data06 " + data06);
        System.out.println("Data07 " + data07);
        System.out.println("Data08 " + data08);
        System.out.println("Data09 " + data09);
        System.out.println("Data10 " + data10);
        System.out.println("Data11 " + data11);

        /*Operações de datas Data -> Texto */

        DateTimeFormatter formatter03 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter04 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        /*Formatar data para data default system Instant precisa de fuso horario*/
        DateTimeFormatter formatter05 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
        DateTimeFormatter formatter06 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("Data04 " + data04.format(formatter03));
        System.out.println("Data04 " + formatter03.format(data04));
        System.out.println("Data05 " + formatter03.format(data05));
        System.out.println("Data05 " + formatter04.format(data05));
        System.out.println("Data06 " + formatter05.format(data06));
        System.out.println("Data06 " + formatter06.format(data06));

        /*Global para Local*/
        /*Tem que informar o Time Zone*/

        for(String fuso : ZoneId.getAvailableZoneIds()){
            System.out.println(fuso);
        }

        LocalDate data12 = LocalDate.ofInstant(data06, ZoneId.systemDefault());
        LocalDate data13 = LocalDate.ofInstant(data06, ZoneId.of("Portugal"));
        LocalDateTime data14 = LocalDateTime.ofInstant(data06, ZoneId.systemDefault());
        LocalDateTime data15 = LocalDateTime.ofInstant(data06, ZoneId.of("Portugal"));


        System.out.println("Data12 " + data12);
        System.out.println("Data13 " + data13);
        System.out.println("Data14 " + data14);
        System.out.println("Data15 " + data15);
        System.out.println("Dia Data12 " + data12.getDayOfMonth());
        System.out.println("Mês Data12 " + data12.getMonth());
        System.out.println("Ano Data12 " + data12.getYear());
        System.out.println("Hora Data15 " + data15.getHour());
        System.out.println("Minutos Data15 " + data15.getMinute());

        /*Instanciar Novas Datas Dias/Mês/Ano a mais*/

        LocalDate data16 = data12.minusDays(7);
        LocalDate data17 = data12.plusDays(7);
        LocalDateTime data18 = data14.plusDays(5);
        LocalDateTime data19 = data14.minusDays(5);
        Instant data20 = data06.minus(7, ChronoUnit.DAYS);
        Instant data21 = data06.plus(7, ChronoUnit.DAYS);

        System.out.println("Data16 " + data16);
        System.out.println("Data17 " + data17);
        System.out.println("Data18 " + data18);
        System.out.println("Data19 " + data19);
        System.out.println("Data20 " + data20);
        System.out.println("Data21 " + data21);

        Duration duracaoData01 = Duration.between(data18, data19);
        Duration duracaoData02 = Duration.between(data16.atTime(0, 0), data17.atTime(0, 0));
        Duration duracaoData03 = Duration.between(data16.atStartOfDay(), data17.atStartOfDay());
        Duration duracaoData04 = Duration.between(data06, data06.plus(10, ChronoUnit.DAYS));

        System.out.println("Duracao01 " + duracaoData01.toDays());
        System.out.println("Duracao02 " + duracaoData02.toDays());
        System.out.println("Duracao03 " + duracaoData03.toDays());
        System.out.println("Duracao04 " + duracaoData04.toDays());
    }
}
