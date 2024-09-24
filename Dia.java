package com.mycompany.processoseletivo;

public class Dia {
    private final int dia;
    private final double faturamento;

    public Dia(int dia, double faturamento) {
        this.dia = dia;
        this.faturamento = faturamento;
    }

    public int getDia() {
        return dia;
    }

    public double getFaturamento() {
        return faturamento;
    }
    
}
