/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios6_sem1;

public class Ejercicios6_Sem1 {

 
importar  java.texto.DecimalFormat ;
importar  java.texto.NumberFormat ;

    public  static  void  main ( String [] args ) {
        Number formato =  new  DecimalFormat ( "#0.00" );
         double promedio, ev1, ev2, ev3, ev4, ev5;
         
         ev1 =  8,0  *  0,25 ;
         ev2 =  7,5  *  0,15 ;
         ev3 =  9,0  *  0,15 ;
         ev4 =  8,0  *  0,20 ;
         ev5 =  9,0  *  0,25 ;
         
         promedio = ev1 + ev2   + ev3 + ev4 + ev5;
         
              System.out.println( " Su promedio final del ciclo es: "  + formato.format(promedio));
    }
}
