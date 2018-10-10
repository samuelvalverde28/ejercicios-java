public class Ejercicio4_6{
  public static void main(String[] arg){
    
  String numero;
  
  System.out.println("Introduzca la altura: ");
  numero = System.console().readLine();
  double numeroh = Double.parseDouble(numero);
  double t;
  double g = 9.81;
  
  
  t = Math.sqrt((2*numeroh)/g);
  
    
  System.out.println("El objeto tarfa en caer "+t+" segundos en caer"); 
  
  
    
  }
}
