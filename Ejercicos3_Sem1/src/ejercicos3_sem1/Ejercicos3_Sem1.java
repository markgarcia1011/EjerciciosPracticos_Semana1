/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicos3_sem1;

public  class  Ejercicos3_Sem1 {
    
public  static  void  main ( String [] args ) {

// Declaración de variables

  double salarioTL, renta, rentaTL,sueldoxH, hora, total;


     sueldoxH =  8 ;
     hora =  36 ;
     renta =  0.10 ;

     salarioTL = sueldoxH * hora;
     rentaTL = salarioTL * renta;
     total = salarioTL - rentaTL;

    
     System.out.println( " El salario total es: "  + total);
   }
}
