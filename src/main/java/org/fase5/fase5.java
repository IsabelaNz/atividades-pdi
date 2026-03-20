package org.fase5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class fase5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> agendaContatos = new HashMap<>();
        int opcao = 0;
        while (opcao != 5) {
            System.out.println("\n=== Lista de compras ===");
            System.out.println("1 - Adicionar conato");
            System.out.println("2 - Buscar contato");
            System.out.println("3 - Buscar todos");
            System.out.println("4 - Remover contato");
            System.out.println("5 - Sair");
            System.out.print("Digite o que quer fazer: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("Digite o nome do seu contato: ");
                String nomeContato = scanner.nextLine();
                String telefoneContato;
                while (true) {
                    System.out.println("Digite o telefone do seu contato (11 números): ");
                    telefoneContato = scanner.nextLine();
                    if (telefoneContato.matches("\\d{11}")) {
                        break;
                    } else {
                        System.out.println("Telefone inválido! Use exatamente 11 números.");
                    }
                }
                agendaContatos.put(nomeContato.toLowerCase(), telefoneContato);
                System.out.println("Contato adicionado.");
            } else if (opcao == 2) {
                if (agendaContatos.isEmpty()) {
                    System.out.println("Essa agenda de contatos está vazia.");
                } else {
                    System.out.println("Digite o nome do contato:");
                    String nome = scanner.nextLine();

                    if (agendaContatos.containsKey(nome)) {
                        System.out.println("Telefone: " + agendaContatos.get(nome));
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                }
            } else if (opcao == 3) {
                if (agendaContatos.isEmpty()) {
                    System.out.println("Essa agenda de contatos está vazia.");
                } else {
                    for (String nome : agendaContatos.keySet()) {
                        System.out.println(nome + " - " + agendaContatos.get(nome));
                    }
                }
            } else if (opcao == 4) {
                System.out.println("Qual contato você deseja remover ?");
                String removerContato = scanner.nextLine();
                if (agendaContatos.containsKey(removerContato)) {
                    agendaContatos.remove(removerContato);
                    System.out.println("Contato removido");
                } else {
                    System.out.println("Contato não encontrado");
                }
            } else if (opcao == 5) {
                System.out.println("Saindo..");
            } else {
                System.out.println("opção inválida");
            }
        }
    }
}
