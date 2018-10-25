public class Ejercicio5C_1{
  public static void main(String[] arg){
    
  System.out.print("Hasta que numero quieres mostrar: ");
  int numero = Integer.parseInt(System.console().readLine());
  
  for (int i = 0;i <= numero;i++){
    
    System.out.print(i);
    if (i != numero){
      System.out.print(" - ");
      }
    
    }
  
  
  
  
  }
} 
