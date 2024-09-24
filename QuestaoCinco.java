package com.mycompany.processoseletivo;

/*
    Questao solucionada usando o metodo estatico inverteString que usando o 
    StringBuilder do proprio java vai copiando a String de trás para frente e 
    retorna o resultado
*/

public class QuestaoCinco {
    
    public static String inverteString(String str){
        StringBuilder sb = new StringBuilder();
        
        for(int i = str.length()-1; i>= 0; i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    
}
