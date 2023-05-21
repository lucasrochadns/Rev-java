package br.com.projeto.capitulo22.application;

import br.com.projeto.capitulo22.entities.Aluno;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Programa04 {
    public static void main(String[] args) {
        Consumer<Aluno> imprimir = p -> System.out.printf("Nome: %s Media: %.2f \n", p.getNome(), p.getMedia());
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("c:\\notasAlunos.txt"))){
            String line = bufferedReader.readLine();
            List<Aluno> alunos = new ArrayList<>();
            while(line != null){
                String[] lines = line.split(",");
                double n1 = Double.parseDouble(lines[1].trim());
                double n2 = Double.parseDouble(lines[2].trim());
                double n3 = Double.parseDouble(lines[3].trim());
                alunos.add(new Aluno(lines[0]));
                alunos.get(alunos.size() - 1).addNotas(n1);
                alunos.get(alunos.size() - 1).addNotas(n2);
                alunos.get(alunos.size() - 1).addNotas(n3);
                line = bufferedReader.readLine();
            }
            alunos.forEach(imprimir);
        }catch(IOException message){
            message.printStackTrace();
        }
    }
}
