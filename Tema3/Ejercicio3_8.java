import java.util.Scanner;

public class Ejercicio3_8{
  public static void main(String[] arg){
  
  double horas;
  double resultado;
  
  String lineaDeEntrada;
  
  System.out.print("Introduce las horas de trabajo de la semana: ");
  lineaDeEntrada = System.console().readLine();
  horas = Integer.parseInt(lineaDeEntrada);
  
  
  
  resultado = horas*12;
  
  System.out.printf("El salario a la semana es: "+resultado);
    
  }
}
