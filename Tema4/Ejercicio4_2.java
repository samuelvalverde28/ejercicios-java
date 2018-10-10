public class Ejercicio4_2{
  public static void main(String[] arg){
  String linea;
  
  System.out.println("Introduce una hora:");
  
  linea = System.console().readLine();
  int numero = Integer.parseInt(linea);
  
  if ((numero >= 6) &&  (numero <=12)){
    System.out.println("Buenas dias");
    }else if ((numero >=13) &&  (numero <=20)) { 
    System.out.println("Buenas tardes");
     }else if ((numero >= 21) ||  (numero <=5)) {
       System.out.println("Buenas noches");
       }else {
            System.out.println("Te has es quivocado de numero");
          }
    
    
  }
}
