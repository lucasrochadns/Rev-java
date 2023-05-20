package br.com.projeto.capitulo10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Exercicio02 {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat formatter01 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatter02 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat formatter03 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        formatter03.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date data01 = formatter01.parse("18/05/2023");
        Date data02 = formatter02.parse("18/05/2023 00:54:33");
        Date data03 = Date.from(Instant.parse("2023-05-18T00:54:33Z"));
        Date data04 = new Date();
        Date data05 = new Date(System.currentTimeMillis());
        Date data06 = new Date(0L);


        System.out.println("data01 " + data01);
        System.out.println("data02 " + data02);
        System.out.println("data02 " + formatter02.format(data02));
        System.out.println("data03 " + data03);
        System.out.println("data04 " + data04);
        System.out.println("data05 " + data05);
        System.out.println("data06 " + data06);

        System.out.println("---------------");

        System.out.println("Data01 " + formatter03.format(data01));
        System.out.println("Data02 " + formatter03.format(data02));
        System.out.println("Data03 " + formatter03.format(data03));
        System.out.println("Data04 " + formatter03.format(data04));
        System.out.println("Data05 " + formatter03.format(data05));

        SimpleDateFormat formatter04 = new SimpleDateFormat("17/05/2023 01:12:55");
        Date data07 = Date.from(Instant.parse("2023-05-18T01:15:33Z"));
        Calendar data08 = Calendar.getInstance();
        data08.setTime(data07);
        data08.add(Calendar.HOUR_OF_DAY, 4);
        data07 = data08.getTime();

        System.out.println(String.format("Data07 " + formatter04.format(data07)));
        int minutes = data08.get(Calendar.MINUTE);
        int hour = data08.get(Calendar.HOUR);
        int year = data08.get(Calendar.YEAR);
        int month = data08.get(Calendar.MONTH);
        int day = data08.get(Calendar.DAY_OF_MONTH);
        System.out.printf("%d %d %d %d %d ", year, month + 1, day, hour, minutes);


    }
}
