package com.mycompany.processoseletivo;

public class QuestaoQuatro {
    
    public static void percentualMensal(){
        double[] vals = new double[]{67836.43, 36678.66, 29229.88, 
                                     27165.48, 19849.53};
        String[] estados = new String[]{"SP", "RJ", "MG", "ES", "Outros"};
        
        double total = 0;
        
        for(double v : vals){
            total += v;
        }
        
        for(int i = 0; i< vals.length; i++){
            System.out.printf("%s teve: %.2f%% de  percentual de representacao \n", 
                    estados[i] ,vals[i]*100/total);
        }
        
       
    }
    
}
