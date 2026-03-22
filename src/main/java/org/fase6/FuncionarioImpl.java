package org.fase6;

public record FuncionarioImpl(String getNomeFuncionario, Double salarioFuncionario) implements Funcionario {

    public Double calcularBonus() {
        return salarioFuncionario * 0.1;
    }
}
