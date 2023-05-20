package br.com.projeto.capitulo08;

import java.util.Locale;

public class Exercicio08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int[][] matriz = new int[3][3];
        for(int contadorX = 0; contadorX < 3; contadorX++){
            for(int contadorY = 0; contadorY < 3; contadorY++){
                matriz[contadorX][contadorY] = contadorX + 2 + contadorY + 1;
            }
        }
        int cont = 0;
        for(int contadorX = 0; contadorX < 3; contadorX++){
            for(int contadorY = 0; contadorY < 3; contadorY++){
                System.out.printf(" %d ", matriz[contadorX][contadorY]);
                if(matriz[contadorX][contadorY] < 0){
                    cont++;
                }
            }
            System.out.println();
        }
        System.out.println("Diagonal principal");
        for(int x = 0; x < 3; x++){
            System.out.printf(" %d", matriz[x][x]);
        }
        System.out.printf("\nNumeros Negativos QT: %d", cont);
    }
}
