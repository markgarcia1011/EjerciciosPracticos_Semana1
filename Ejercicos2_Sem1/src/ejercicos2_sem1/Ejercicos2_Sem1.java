
package ejercicos2_sem1;

public  class  Ejercicos2_Sem1 {
   public static void main(String[] args) {
  
    double  dolares, europa, reino_u, australia, canada, usd;
    
    dolares = 100;
    europa = 0.70;
    reino_u = 0.61;
    australia = 0.95;
    canada = 0.97;
    usd = 1.00;
    
      double conversion1 = dolares * europa;
      System.out.println("La covensercion de Dolares a la moneda de Europa es : " + conversion1); 
      double conversion2 = dolares * reino_u;
      System.out.println("La covensercion de Dolares a la moneda de Reino Unido es : " + conversion2); 
      double conversion3 = dolares * australia;
      System.out.println("La covensercion de dolares a la moneda de Australia es : " + conversion3); 
      double conversion4 = dolares * canada;
      System.out.println("La covensercion de dolares a la moneda de Canada es : " + conversion4); 
      double conversion5 = dolares * usd;
      System.out.println("La covensercion de dolares a la moneda  de USD es : " + conversion5); 
 
  } 
  
}
