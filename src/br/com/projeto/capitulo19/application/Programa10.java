package br.com.projeto.capitulo19.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Programa10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o nome do arquivo: ");
        String path = scanner.nextLine();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line = bufferedReader.readLine();
            Map<String, Integer> votacao = new HashMap<>();
            while(line != null){
               String[] lines = line.split(",");
               String name = lines[0];
               Integer voto = Integer.parseInt(lines[1]);

               if(votacao.containsKey(name)){
                   int contagem = votacao.get(name);
                   votacao.put(name, contagem + voto);
               } else{
                   votacao.put(name, voto);
               }
               line = bufferedReader.readLine();
            }
            for(String name : votacao.keySet()){
                System.out.println(name +  " " + votacao.get(name));
            }
        }catch(IOException message){
            message.printStackTrace();
        }
    }
}
