package br.com.projeto.capitulo19.application;

import br.com.projeto.capitulo19.entities.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Date;

public class Programa06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o caminho do arquivo: ");
        String path = scanner.nextLine();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line = bufferedReader.readLine();
            Set<User> userLog = new HashSet<>();
            while(line != null){
                String[] lines = line.split(" ");
                userLog.add(new User(lines[0], Date.from(Instant.parse(lines[1]))));
                line = bufferedReader.readLine();
            }
            userLog.stream().forEach(System.out::println);
        }catch(IOException message){
           message.printStackTrace();
        }
    }
}
