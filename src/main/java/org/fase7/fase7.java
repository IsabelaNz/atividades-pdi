package org.fase7;

import java.util.ArrayList;
import java.util.Scanner;

public class fase7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Usuario> usuarios = new ArrayList<>();
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("1- Cadastrar usuário");
            System.out.println("2- Listar usuários");
            System.out.println("3- Remover usuários");
            System.out.println("4- Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("Digite o nome:");
                String nome = scanner.nextLine();

                System.out.println("Digite a idade:");
                int idade = scanner.nextInt();
                scanner.nextLine();

                Usuario usuario = new UsuarioImpl(nome, idade);

                usuarios.add(usuario);

                System.out.println("Usuário cadastrado!");
            }

            else if (opcao == 2) {
                if (usuarios.isEmpty()) {
                    System.out.println("Nenhum usuário cadastrado.");
                } else {
                    for (Usuario u : usuarios) {
                        System.out.println(
                                u.getNomeUsuario() + " - " + u.getIdadeUsuario()
                        );
                    }
                }
            }

            else if (opcao == 3) {
                System.out.println("Digite o nome para remover:");
                String nomeRemover = scanner.nextLine();

                usuarios.removeIf(u -> u.getNomeUsuario().equalsIgnoreCase(nomeRemover));

                System.out.println("Usuário removido (se existia).");
            }

            else if (opcao ==4) {
                System.out.println("Saindo..");
            } else {
                System.out.println("Opção inválida");
            }


        }
    }
}
