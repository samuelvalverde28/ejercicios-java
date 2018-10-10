import java.util.Scanner;

public class Ejercicio3_6{
  public static void main(String[] arg){
  
  int base;
  int altura;
  int resultado;
  
  String lineaDeEntrada;
  
  System.out.print("Introduce la base: ");
  lineaDeEntrada = System.console().readLine();
  base = Integer.parseInt(lineaDeEntrada);
  
  System.out.print("Introduce la altura: ");
  lineaDeEntrada = System.console().readLine();
  altura = Integer.parseInt(lineaDeEntrada);
  
  resultado = base * (altura/2);
  
  System.out.printf("El area del triangulo es: "+resultado);
    
  }
}
