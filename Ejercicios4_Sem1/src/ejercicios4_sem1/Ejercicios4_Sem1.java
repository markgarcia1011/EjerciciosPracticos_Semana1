/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios4_sem1;

public  class  Ejercicios4_Sem1 {
    

    public  static  void  main ( String [] args ) {

   double  AFPT , AFPE , pagoAFP, pagoT, pagoF, salario,  sueldo;


        salario =  500 ;
        AFPT =  0,06 ;
        AFPE  =  0,065 ;
        pagoAFP = sueldo *  AFPT ;

            pagoT = sueldo *  AFPE ; pagoF = pagoAFP + pagoT;
        System.out.println("");
        System.out.println( " Usted esta pagando a AFP la cantidad de: "  + pagoF);
    }

}