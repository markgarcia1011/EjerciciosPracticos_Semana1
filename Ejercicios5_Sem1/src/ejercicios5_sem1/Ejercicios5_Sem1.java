/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios5_sem1;

/**
 *
 * @author ITCA
 */
public class Ejercicios5_Sem1 {

    
    public  static  void  main ( String [] args ) {
        
  double salarioT, sueldo, horas, sueldoH, horasT, renta, rentaT, tiempo, totalF;

         salarioT =  10 ;
         tiempo =  30 ;
         horas =  50 ;
         sueldoH =  0.10 ;
         renta =  0.10 ;
         
         salarioT = salarioT * tiempo;
         horasT = horas * sueldoH;
         totalF = salarioT + horasT;
         rentaT = totalF - renta;
      
        
       System.out.println( " Su salario total es: "  + rentaT);

    }
    
    
}