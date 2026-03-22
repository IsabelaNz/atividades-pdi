package org.fase6;

import java.util.List;

public class Fase6 {
    public static void main(String[] args) {

        List<Funcionario> funcionarios = List.of(
                new FuncionarioImpl("Isabela", 5000.0),
                new FuncionarioImpl("Marcelo", 6000.0)
        );

        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.getNomeFuncionario());
            System.out.println("Bônus: " + f.calcularBonus());
            System.out.println("-------------------");
        }
    }
}