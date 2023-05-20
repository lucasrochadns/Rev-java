package br.com.projeto.capitulo04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

    private static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        leituraDados();
        leituraDados();
    }

    private static void leituraDados() {
        System.out.println("Insira Código da peça");
        Integer codigo01 = entrada.nextInt(); entrada.nextLine();
        System.out.println("Insira Insira a quantidade peças");
        Integer quantidade01 = entrada.nextInt(); entrada.nextLine();
        System.out.println("Insira insira o preço");
        Double preco01 = entrada.nextDouble();
        calcular(codigo01, quantidade01, preco01);
    }

    private static void calcular(Integer codigo, Integer valor01, Double valor02){
        System.out.printf("Número: %d Quantidade %d Preço  %.2f  Valor a Pagar: %.2f \n", codigo, valor01, valor02, (valor01 * valor02));
    }
}
