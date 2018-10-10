import java.util.Scanner;

public class Ejercicio3_1{
  public static void main(String[] arg){
  
 int numero1;
  int numero2;
  int resultado;
  
  String lineaDeEntrada;
  
  System.out.print("Introduce el primer numero: ");
  lineaDeEntrada = System.console().readLine();
  numero1 = Integer.parseInt(lineaDeEntrada);
  
  System.out.print("Introduce el segundo numero: ");
  lineaDeEntrada = System.console().readLine();
  numero2 = Integer.parseInt(lineaDeEntrada);
  
  resultado = numero1 * numero2;
  
  System.out.printf("%d * %d = %d",numero1, numero2, resultado);
    
  }
}
