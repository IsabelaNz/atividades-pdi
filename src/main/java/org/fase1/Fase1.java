package org.fase1;

import java.util.Scanner;

public class Fase1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int nota1;
        int nota2;
        double media;

        System.out.println("Digite o nome do aluno:");
        nome = scanner.nextLine();

        System.out.println("Digite a nota 1:");
        nota1 = scanner.nextInt();

        System.out.println("Digite a nota 2:");
        nota2 = scanner.nextInt();

        media = (nota1 + nota2) / 2.0;

        if (media >= 7) {
            System.out.println("O aluno " + nome + " está aprovado com media: " + media);
        } else {
            System.out.println("O aluno " + nome + " está de recuperação com media: " + media);
        }
    }
}