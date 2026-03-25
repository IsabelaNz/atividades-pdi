package org.fase7;

public class UsuarioImpl implements Usuario{

    private String nome;
    private Integer idade;

    public UsuarioImpl(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String getNomeUsuario() {
        return nome;
    }

    @Override
    public Integer getIdadeUsuario() {
        return idade;
    }
}
