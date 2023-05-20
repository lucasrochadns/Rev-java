package br.com.projeto.capitulo17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Programa05 {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("c:\\exemplo.txt"))){
            String line = bufferedReader.readLine();
            ArrayList<Pessoas> listaPessoas = new ArrayList<>();
            while( line != null){
                String[] lineFull = line.split(",");
                listaPessoas.add(new Pessoas(lineFull[0], Integer.parseInt(lineFull[1].trim())));
                line = bufferedReader.readLine();
            }
            listaPessoas.stream().forEach(System.out::println);
        }catch(IOException message){
            message.printStackTrace();
        }
    }
}
