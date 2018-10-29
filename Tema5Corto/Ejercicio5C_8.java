public class Ejercicio5C_8{
  public static void main(String[] arg){
  
  
  int numero = 1;
  
  do{
    
    
  System.out.print("Introduce un numero entero (0 para salir): ");
  numero = Integer.parseInt(System.console().readLine());
  
  if (numero != 0){
    
  int aux = numero;
  int resultado = aux * aux;
  
  
  System.out.println("El cuadrado de "+numero+" es "+resultado);
    
    }
  
  
  
    } while (numero != 0);
  
  }
}
