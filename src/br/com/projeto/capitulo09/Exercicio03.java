package br.com.projeto.capitulo09;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas pessoas serao digitadas? : ");
        int quantity = scanner.nextInt(); scanner.nextLine();
        Pessoa[] vector = new Pessoa[quantity];
        for(int x =0; x < vector.length; x++){
            System.out.println("Dados da primeira pessoa ");

            System.out.printf("Nome: ");
            String name = scanner.nextLine();
            System.out.printf("Idade: ");
            int idade = scanner.nextInt(); scanner.nextLine();
            System.out.printf("Altura: ");
            double altura = scanner.nextDouble();
            Pessoa pessoa = new Pessoa(name, idade, altura);
            vector[x] = pessoa;
            scanner.nextLine();
        }
        double alturaMedia = 0.0;
        int pessoasComMenosDe16Anos = 0;

        for(Pessoa pessoa :  vector){
            System.out.println(pessoa);
            if(pessoa.getIdade() < 16){
                pessoasComMenosDe16Anos += 1;
            }
            alturaMedia += pessoa.getAltura();
        }
        System.out.printf("Altura media: %.2f \nPessoas com menos de 16 anos:  %d ", alturaMedia / vector.length, (pessoasComMenosDe16Anos * 100) / vector.length );
    }
}
