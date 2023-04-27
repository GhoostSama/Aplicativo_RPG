package com.example.apprpg;

public class atributos {
    private int forca;
    private int consti;
    private int destreza;
    private int agilidade;
    private int sabedoria;
    private int inteligencia;

    public atributos(int forca, int consti, int destreza, int agilidade, int sabedoria, int inteligencia) {
        this.forca = forca;
        this.consti = consti;
        this.destreza = destreza;
        this.agilidade = agilidade;
        this.sabedoria = sabedoria;
        this.inteligencia = inteligencia;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getConsti() {
        return consti;
    }

    public void setConsti(int consti) {
        this.consti = consti;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getSabedoria() {
        return sabedoria;
    }

    public void setSabedoria(int sabedoria) {
        this.sabedoria = sabedoria;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
}
