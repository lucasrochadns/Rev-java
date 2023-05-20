package br.com.projeto.capitulo18.application;

import br.com.projeto.capitulo18.entities.People;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.List;
public class Programa03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<People> peoples = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("c:\\people.txt"))){
            String line = bufferedReader.readLine();
            while(line != null){
                String[] lines = line.split(",");
                peoples.add(new People(lines[0].trim(), Double.parseDouble(lines[1].trim())));
                line = bufferedReader.readLine();
            }
            Collections.sort(peoples);
            peoples.stream().forEach(System.out::println);
        }catch(IOException message){
           message.printStackTrace();
        }
    }
}
