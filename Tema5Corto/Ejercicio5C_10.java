public class Ejercicio5C_10{
  public static void main(String[] arg){
    
  String letra = "";
  String resultado = "";
  
  while (!(letra.equals("salir"))){
    
  System.out.print("Introduce una palabra (acaba con 'salir'): ");
  letra = System.console().readLine();
  
  if (!(letra.equals("salir"))){
    
    resultado = resultado + " " + letra;
    
    }
  

  
  }
  
  System.out.print(resultado);
  
  
  }
}
