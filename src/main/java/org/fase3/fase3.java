package org.fase3;

import java.util.Scanner;

public class fase3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] notas = new int[5];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();
        }

        int maiorNota = notas[0];
        int menorNota = notas[0];
        int soma = 0;

        for (int nota : notas) {
            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }
            soma += nota;
        }
        
        double media = (double) soma / notas.length;

        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
        System.out.println("Média: " + media);
    }
}
