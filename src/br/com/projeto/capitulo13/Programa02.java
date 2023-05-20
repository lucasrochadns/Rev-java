package br.com.projeto.capitulo13;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Programa02 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment comment01 = new Comment("Have a nicec Trip! ");
        Comment comment02 = new Comment("Wow that´s awesome!  ");

        Post post01 = new Post(formatter.parse("21/06/2018 13:05:45"), "Traveling to New Zeland", "I'm going to visist this wonderfull country! ", 12);
        post01.addComment(comment01);
        post01.addComment(comment02);

        Comment comment03 = new Comment("Have a nice Rio de Janeiro! ");
        Comment comment04 = new Comment("Visit to Natal! ");

        Post post02 = new Post(formatter.parse("10/06/2019 13:05:45"), "Traveling to Brazil", "I'm going to visist this wonderfull country! ", 1200);
        post02.addComment(comment03);
        post02.addComment(comment04);

        System.out.println(post01);
        System.out.println(post02);
    }
}
