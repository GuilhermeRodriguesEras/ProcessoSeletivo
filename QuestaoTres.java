package com.mycompany.processoseletivo;

import java.util.ArrayList;

/*
    Como não houve muitas regras de como criar, fiz a questao 3 como uma classe
    que recebe pelo construtor um ArrayList de Dias (classe simples, somente com
    o campo do dia e faturamento tal qual no arquivo json), e que implementa as 
    funcoes menorFaturamento, maiorFaturamento e diasSuperiorMedia para as 
    questoes solicitas
*/

public class QuestaoTres {
    
    private final ArrayList<Dia> diasMes;

    public QuestaoTres(ArrayList<Dia> diasMes) {
        this.diasMes = diasMes;
    }
            
    public double menorFaturamento(){
        double min = Double.MAX_VALUE;
        
        for(Dia dia : diasMes){
            if(dia.getFaturamento() != 0 && dia.getFaturamento() < min){
                min = dia.getFaturamento();
            }
        }
        return min;
    }
    
    public double maiorFaturamento(){
        double max = Double.MIN_VALUE;
        
        for(Dia dia : diasMes){
            if(dia.getFaturamento() > max){
                max = dia.getFaturamento();
            }
        }
        return max;
    }
  
    private double media(){
        int numDias = 0;
        double sum = 0;
        
        for(Dia dia : diasMes){
            if(dia.getFaturamento() > 0){
                numDias += 1;
                sum += dia.getFaturamento();
            }
        }
        return sum/numDias;
    }
    
    public int diasSuperiorMedia(){
        double media = this.media();
        int count = 0;
        
        for(Dia dia : diasMes){
            if(dia.getFaturamento() > media){
                count += 1; 
            }
        }
        return count;
    }
    
}
