/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicos2_sem1;

public  class  Ejercicos2_Sem1 {
  public  static  void  main ( String [] args ) {
   // A declaramos variables
    double   dolares, europa, reino_unido, australia, canada, usd;
    
    // Establecemos valores a las variables
    dolares =  100 ;
    europa =  0,70 ;
    reino_unido =  0.61 ;
    australia =  0,95;
    canada =  0,97 ;
    dolar estadounodense =  1,00;
    
      // Realizamos la Conversión
      double conversion1 = dolares * europa;
      System.out.println( " La covensercion de Dolares a la moneda de Europa es : "  + conversion1);
      double conversion2 = dolares * reino_unido;
      System.out.println( " La covensercion de Dolares a la moneda de Reino Unido es : "  + conversion2);
      double conversion3 = dolares * australia;
      System.out.println( " La covensercion de dolares a la moneda de Australia es : "  + conversion3);
      double conversion4 = dolares * canada;
      System.out.println( " La covensercion de dolares a la moneda de Canada es : "  + conversion4);
      double conversion5 = dolares * usd;
      System.out.println( " La covensercion de dolares a la moneda de USD es : "  + conversion5);
      
    
  }
}
