import java.util.Scanner;

public class Ejercicio3_3{
  public static void main(String[] arg){
  
  double euros;
  double pesetas;
  
  
  Scanner escanerEntrada = new Scanner(System.in);
  
  
  System.out.print("Introduce el valor en pesetas para pasarlo a euros: ");
  
  pesetas = escanerEntrada.nextDouble();
  
  euros = pesetas*0.006009;
  
  System.out.print(euros);
    
  }
}
