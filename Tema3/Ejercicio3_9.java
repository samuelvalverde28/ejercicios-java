import java.util.Scanner;

public class Ejercicio3_9{
  public static void main(String[] arg){
  
  double radio;
  double altura;
  double resultado;
  double pi = 3.14;
  
  String lineaDeEntrada;
  
  System.out.print("Introduce el radio del cono: ");
  lineaDeEntrada = System.console().readLine();
  radio = Integer.parseInt(lineaDeEntrada);
  
  System.out.print("Introduce la altura del cono: ");
  lineaDeEntrada = System.console().readLine();
  altura = Integer.parseInt(lineaDeEntrada);
  
  
  
  resultado = (pi*(radio*radio)*altura)/3;
  
  System.out.printf("El volumen del cono es: "+resultado);
    
  }
}
