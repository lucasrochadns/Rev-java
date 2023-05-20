package br.com.projeto.capitulo19.application;

import br.com.projeto.capitulo19.entities.Product;
import br.com.projeto.capitulo19.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
public class Programa02 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
      try(BufferedReader bufferedReader = new BufferedReader(new FileReader("c:\\product.txt"))){
          String line = bufferedReader.readLine();
          while(line != null){
              String[] lines = line.split(",");
              products.add(new Product(lines[0], Double.parseDouble(lines[1].trim())));
              line = bufferedReader.readLine();
          }
          System.out.println("Todos os produtos :");
          products.stream().forEach(System.out::println);
          System.out.print("Produto mais caro: ");
          System.out.print(CalculationService.max(products));

      }catch(IOException message){
          message.printStackTrace();
      }
    }
}
