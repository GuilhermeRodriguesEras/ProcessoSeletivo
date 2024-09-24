package com.mycompany.processoseletivo;

import java.util.ArrayList;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        
        System.out.println(QuestaoDois.pertenceSequenciaFibonacci(20));
        System.out.println(QuestaoDois.pertenceSequenciaFibonacci(21));
        
        ArrayList<Dia> dias = new ArrayList<>();
        dias.add(new Dia(1, 10.2));
        dias.add(new Dia(2, 0));
        dias.add(new Dia(3, 10000.234));
        
        QuestaoTres q3 = new QuestaoTres(dias);
        System.out.println(q3.menorFaturamento());
        System.out.println(q3.maiorFaturamento());
        System.out.println(q3.diasSuperiorMedia());
        
        QuestaoQuatro.percentualMensal();
        
        System.out.println(QuestaoCinco.inverteString("ABCDEFG"));
        
    }
}
