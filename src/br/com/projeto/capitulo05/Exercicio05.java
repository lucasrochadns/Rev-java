package br.com.projeto.capitulo05;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Codigo -- Especificação   -- PREÇO \n");
        System.out.println("1     -- Cachorro quente -- R$ 4.00 ");
        System.out.println("2     -- x Salada        -- R$ 4.50 ");
        System.out.println("3     -- X Bacon         -- R$ 5.00 ");
        System.out.println("4     -- Torrada Simples -- R$ 2.00 ");
        System.out.println("5     -- Refrigerante    -- R$ 1.50 ");
        System.out.printf("\n\nInsira codigo: ");
        Integer valor01 = entrada.nextInt(); entrada.nextLine();
        System.out.printf("\nInsira quantidade: ");
        Integer valor02 = entrada.nextInt();entrada.nextLine();

        switch (valor01){
            case 1:
                System.out.printf("CODIGO: %d  QT: = %.2f", valor01,  valor02 * 4.00);
                break;
            case 2:
                System.out.printf("CODIGO: %d QT: = %.2f", valor01, valor02 * 4.50);
                break;
            case 3:
                System.out.printf("CODIGO: %d QT: = %.2f", valor01,  valor02 * 5.00);
                break;
            case 4:
                System.out.printf("CODIGO: %d QT: = %.2f", valor01, valor02 * 2.00);
                break;
            case 5:
                System.out.printf("CODIGO: %d QT: = %.2f", valor01 , valor02 * 1.50);
                break;
            default:
                System.out.println("Codigo invalido");
        }


    }
}
