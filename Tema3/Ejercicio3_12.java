import java.util.Scanner;

public class Ejercicio3_12{
  public static void main(String[] arg){
  
  double primeraNota;
  double porcentajePrimero;
  double porcentajeSegundo;
  double porcentajeFinal;
  double notaNecesaria;
  
  
  String lineaDeEntrada;
  
  System.out.print("Introduce la nota del primer examen: ");
  lineaDeEntrada = System.console().readLine();
  primeraNota = Integer.parseInt(lineaDeEntrada);
  
  System.out.print("¿QUe nota quieres sacar en el trimestre?: ");
  lineaDeEntrada = System.console().readLine();
  notaNecesaria = Integer.parseInt(lineaDeEntrada);
  
  porcentajePrimero = (primeraNota*40)/100;
  porcentajeSegundo = notaNecesaria - porcentajePrimero;
  porcentajeFinal = (porcentajeSegundo*100)/60;
  
  
  System.out.printf("Nota que necesitas sacar en el segundo examen: %.2f\n",porcentajeFinal);
    
  }
}
