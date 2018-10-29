public class Ejercicio5C_12{
  public static void main(String[] arg){
    
  String letra = "";
  String resultado = "";
  
  for (int i = 1; !(letra.equals("salir")) && i <= 4;i++){
  
  
    
  System.out.print("Introduce una palabra (acaba con 'salir'): ");
  letra = System.console().readLine();
  
  if (!(letra.equals("salir"))){
    
    resultado = letra + " " + resultado;
    
    }
  

  
  }
  
  System.out.print(resultado);
  
  
  }
}
