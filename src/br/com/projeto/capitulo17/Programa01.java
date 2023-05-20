package br.com.projeto.capitulo17;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Programa01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        File file = new File("c:\\nomes.txt");
        Scanner scanner = null;
        try{
            scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch(IOException message){
            message.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
