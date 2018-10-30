public class Ejercicio6_6{
  public static void main(String[] arg){
    
    
  System.out.println("Tienes que adivinar el numero secreto al azar en 5 intentos: ");
  
  int contador = 5;
  boolean aux = false;
  int numero = (int)(Math.random()*101);

  
  while (contador != 0 && aux != true){
    
    System.out.println("Introduce el numero secreto: ");
    int adivina = Integer.parseInt(System.console().readLine());
    
    if (adivina == numero){
      aux = true;
      System.out.println("Has acertado");
      } else {
        
        contador--;
        if (numero > adivina){
          System.out.println("El numero secreto es mas grande");
          }
        if (numero < adivina){
          System.out.println("El numero secreto es mas pequeño");
          }
        System.out.println("Te quedan "+contador+" intentos");
        
        }
    
    }
  
  
  
  }
}
