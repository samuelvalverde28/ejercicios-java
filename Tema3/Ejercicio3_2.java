import java.util.Scanner;

public class Ejercicio3_2{
  public static void main(String[] arg){
  
  double euros;
  double pesetas;
  
  
  String lineaDeEntrada;
  
  System.out.print("Introduce el valor en euros para pasarlo a pesetas: ");
  lineaDeEntrada = System.console().readLine();
  euros = Integer.parseInt(lineaDeEntrada);
  
  
  
  pesetas = euros * 166.386;
  
  System.out.println(pesetas);
    
  }
}
