package com.joaocarloslima;

public class Refrigerante {

    private String nome;
    private double preco;
    private Sabores sabor;

    public Refrigerante(String nome, double preco, Sabores sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Sabores getSabor() {
        return sabor;
    }

    public void setSabor(Sabores sabor) {
        this.sabor = sabor;
    }

}
