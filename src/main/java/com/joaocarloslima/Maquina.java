package com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;

public class Maquina {

    private double saldo;
    private double totalArrecadado;
    private ArrayList<Refrigerante> refrigerantes = new ArrayList<Refrigerante>();

    public Maquina() {
        this.refrigerantes.add(new Refrigerante("Guaraná Jesus", 2.65, Sabores.COLA));
        this.refrigerantes.add(new Refrigerante("Tota Tola", 2.70, Sabores.LARANJA));
        this.refrigerantes.add(new Refrigerante("Fantão", 2.65, Sabores.UVA));
        this.refrigerantes.add(new Refrigerante("Yago picachu", 2.65, Sabores.GUARANA));
        this.refrigerantes.add(new Refrigerante("Wellington Rato", 2.65, Sabores.LIMAO));
        this.refrigerantes.add(new Refrigerante("Pombo", 2.65, Sabores.UVA));
        this.refrigerantes.add(new Refrigerante("Tatu bola", 2.65, Sabores.LARANJA));
        this.refrigerantes.add(new Refrigerante("Pica milagrosa", 2.65, Sabores.UVA));
        this.refrigerantes.add(new Refrigerante("Oleo", 2.65, Sabores.COLA));
        this.refrigerantes.add(new Refrigerante("tiquinho", 2.65, Sabores.GUARANA));
    };

    public void adicionarRefrigerante(Refrigerante refrigerante) {
        this.refrigerantes.add(refrigerante);
    }

    public void inserirDinheiro(double dinheiro) {
        this.saldo += dinheiro;
    }

    public void sacarDinheiro() {
        saldo = 0;
    }

    public void comprarRefrigerante(Refrigerante refrigerante) {
        if (this.saldo >= refrigerante.getPreco()) {
            this.saldo -= refrigerante.getPreco();
            refrigerantes.remove(refrigerante);
            this.totalArrecadado += refrigerante.getPreco();
        } else {
            throw new RuntimeException("Saldo insuficiente");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTotalArrecadado() {
        return totalArrecadado;
    }

    public void setTotalArrecadado(double totalArrecadado) {
        this.totalArrecadado = totalArrecadado;
    }

    public ArrayList<Refrigerante> getRefrigerantes() {
        return refrigerantes;
    }

    public void setRefrigerantes(ArrayList<Refrigerante> refrigerantes) {
        this.refrigerantes = refrigerantes;
    }

}
