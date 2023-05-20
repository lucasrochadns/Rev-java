package br.com.projeto.capitulo17;

import java.io.*;

public class Programa03 {
    public static void main(String[] args) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("c:\\nomes.txt", true))){
            String[] nomes = new String[]{"Luciene José dos Santos", "Vicente Jose da Rocha", "Samuel Rocha dos Santos", "Meirielle Rocha dos Santos"};
            for(String lines : nomes){
                bufferedWriter.write(lines);
                bufferedWriter.newLine();
            }
        }catch(IOException message){
            message.printStackTrace();
        }
    }
}
