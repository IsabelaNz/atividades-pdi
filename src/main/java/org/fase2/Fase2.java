package org.fase2;

import java.util.Scanner;

public class Fase2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número para ver a tabuada");
        numero = scanner.nextInt();

        int i;
        for (i = 0; i <= 9; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}
