package br.com.projeto.capitulo20.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Programa07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("INSIRA O CAMINHO: ");
        String path = scanner.nextLine();
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("c:\\log.txt", false))){
            bufferedWriter.write("Teste");
            bufferedWriter.newLine();
        }catch(IOException message){
            message.printStackTrace();
        }

        scanner.close();
    }
}
