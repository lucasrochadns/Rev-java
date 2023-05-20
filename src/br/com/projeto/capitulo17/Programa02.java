package br.com.projeto.capitulo17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Programa02 {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("c:\\nomes.txt"))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException message) {
            message.printStackTrace();
        }
    }
}
