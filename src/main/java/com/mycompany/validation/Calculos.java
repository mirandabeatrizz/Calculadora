/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.validation;

/**
 *
 * @author beatriz.miranda
 */
public class Calculos {
    
    public String conta(double valor1, double valor2, String sinal){
        double resultado = 0;
   
        if (sinal.equals("div"))
        {
            resultado = valor1/valor2;
        }
        else if (sinal.equals("mais"))
        {
            resultado = valor1+valor2;
            
        }
        else if (sinal.equals("menos")){
            resultado = valor1-valor2;

        }
        else if (sinal.equals("multi")){
            resultado = valor1*valor2;
        }
        
        return String.valueOf(resultado);
      
    }
   
 
}

