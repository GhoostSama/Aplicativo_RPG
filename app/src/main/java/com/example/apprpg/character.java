package com.example.apprpg;

public class character {
    private String nome;
    private int vida;
    private int ac;

    public character(String nome, int vida, int ac) {
        this.nome = nome;
        this.vida = vida;
        this.ac = ac;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }
}
