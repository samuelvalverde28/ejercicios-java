import java.util.Scanner;

public class Ejercicio3_11{
  public static void main(String[] arg){
  
  double Mb;
  double Kb;
  
  
  String lineaDeEntrada;
  
  System.out.print("Introduce los Kb para pasarlo a Mb: ");
  lineaDeEntrada = System.console().readLine();
  Kb = Integer.parseInt(lineaDeEntrada);
  
  
  Mb = Kb/1024;
  
  System.out.printf("Mb: "+Mb);
    
  }
}
