public class Ejercicio4_5{
  public static void main(String[] arg){
    
  double resultado;
    
  String ayb;
  
  System.out.println("Introduzca el valor de a: ");
  ayb = System.console().readLine();
  double numeroa = Double.parseDouble(ayb);
  
  System.out.print("Introduce el valor de b: ");
  ayb = System.console().readLine();
  double numerob = Double.parseDouble(ayb);
  
  
  resultado = (0 - numerob) / numeroa;
  
  
  if (numeroa == 0){
    
    System.out.println("Esa ecuación no tiene resultado real"); 
    
    } else {
      
      System.out.println("X = "+ resultado); 
      
      }
  
  
    
  }
}
