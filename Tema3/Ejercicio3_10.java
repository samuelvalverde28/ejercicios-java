import java.util.Scanner;

public class Ejercicio3_10{
  public static void main(String[] arg){
  
  int Mb;
  int Kb;
  
  
  String lineaDeEntrada;
  
  System.out.print("Introduce los Mb para pasarlo a Kb: ");
  lineaDeEntrada = System.console().readLine();
  Mb = Integer.parseInt(lineaDeEntrada);
  
  
  Kb = Mb*1024;
  
  System.out.printf("Kb: "+Kb);
    
  }
}
