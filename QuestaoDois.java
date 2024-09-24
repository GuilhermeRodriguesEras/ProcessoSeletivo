package com.mycompany.processoseletivo;

/* Para a solucao desse problema criei a funcao estatica 
   "pertenceSequenciaFibonacci" que recebe o numero desejado como parametro
   e retorna um boolean de acordo se pertence ou nao a sequencia
*/
public class QuestaoDois {
    
    public static boolean pertenceSequenciaFibonacci(int val){
        if(val < 0){
            return false;
        }
        
        int inicialfibo1 = 0, inicialfibo2 = 1;
        
        while(val >= inicialfibo2){
            if(val == inicialfibo1 || val == inicialfibo2){
                return true;
            }
            
            inicialfibo2 += inicialfibo1;
            inicialfibo1 = inicialfibo2 - inicialfibo1; 
        }

        return false;
    }
    
}
