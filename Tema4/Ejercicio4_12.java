public class Ejercicio4_12{
  public static void main(String[] arg){
    
    int nota = 0;
    
    
  System.out.println("¿100 en binario es igual a 50 en decimal?: ");
  String preg1 = System.console().readLine();
   if (preg1.equals("no")){
     nota++;
     } else {
       System.out.println("te has esquivocado, al respuesta correcta es no");
       }
  
  System.out.println("¿100 en binario es igual a 3 en decimal?: ");
  String preg2 = System.console().readLine();
   if (preg2.equals("si")){
     nota++;
     } else {
       System.out.println("te has esquivocado, al respuesta correcta es si");
       }  
       
  System.out.println("¿1000 en binario es igual a 500?: ");
  String preg3 = System.console().readLine();
   if (preg3.equals("no")){
     nota++;
     } else {
       System.out.println("te has esquivocado, al respuesta correcta es no");
       }
       
  System.out.println("¿1000 en bianrio es igual a 9?: ");
  String preg4 = System.console().readLine();
   if (preg4.equals("no")){
     nota++;
     } else {
       System.out.println("te has esquivocado, al respuesta correcta es no");
       } 
       
  System.out.println("¿1000 en bianrio es igual a 8?: ");
  String preg5 = System.console().readLine();
   if (preg5.equals("si")){
     nota++;
     } else {
       System.out.println("te has esquivocado, al respuesta correcta es si");
       } 
  
  System.out.println("¿10 en binario es A en hexadecimal?: ");
  String preg6 = System.console().readLine();
   if (preg6.equals("si")){
     nota++;
     } else {
       System.out.println("te has esquivocado, al respuesta correcta es si");
       }   
       
    System.out.println("¿15 en binario es G en hexadecimal?: ");
  String preg7 = System.console().readLine();
   if (preg7.equals("no")){
     nota++;
     } else {
       System.out.println("te has esquivocado, al respuesta correcta es no");
       } 
                             
  System.out.println("¿F en hexadecimal es igual a 15 en decimal?: ");
  String preg8 = System.console().readLine();
   if (preg8.equals("si")){
     nota++;
     } else {
       System.out.println("te has esquivocado, al respuesta correcta es si");
       } 
       
  System.out.println("¿#FFFFFF es el color blanco?: ");
  String preg9 = System.console().readLine();
   if (preg9.equals("si")){
     nota++;
     } else {
       System.out.println("te has esquivocado, al respuesta correcta es si");
       }      
       
  System.out.println("¿#FFFFFF es el color negro?: ");
  String preg10 = System.console().readLine();
   if (preg10.equals("no")){
     nota++;
     } else {
       System.out.println("te has esquivocado, al respuesta correcta es no");
       }      
   
  System.out.println("Tu nota final es "+nota); 
    
  }
}
