package org.fase4;

import java.util.ArrayList;
import java.util.Scanner;

public class Fase4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\n=== Lista de compras ===");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Listar itens");
            System.out.println("3 - Remover item");
            System.out.println("4 - Sair");
            System.out.print("Digite o que quer fazer: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("Digite o nome do item: ");
                String item = scanner.nextLine();
                lista.add(item);
                System.out.println("item adicionado");
            } else if (opcao == 2) {
                if (lista.isEmpty()) {
                    System.out.println("Lista vazia");
                } else {
                    System.out.println("lista: ");
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(i + "- " + lista.get(i));
                    }
                }
            } else if (opcao == 3) {
                System.out.println("Digite o nome do item que você quer remover: ");
                String itemRemovido = scanner.nextLine();
                if (lista.remove(itemRemovido)) {
                    System.out.println("item removido");
                } else {
                    System.out.println("Item não encontrado");
                }
            } else if (opcao == 4) {
                System.out.println("saindoo");
            } else {
                System.out.println("opção inválida");
            }
        }
    }
}