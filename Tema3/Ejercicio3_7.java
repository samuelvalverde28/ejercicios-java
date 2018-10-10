import java.util.Scanner;

public class Ejercicio3_7{
  public static void main(String[] arg){
  
  double factura1;
  double factura2;
  double factura3;
  double resultado;
  double ivafactura1;
  double ivafactura2;
  double ivafactura3;
  
  String lineaDeEntrada;
  
  System.out.print("Introduce el 1º importe: ");
  lineaDeEntrada = System.console().readLine();
  factura1 = Integer.parseInt(lineaDeEntrada);
  
  System.out.print("Introduce el 2º importe: ");
  lineaDeEntrada = System.console().readLine();
  factura2 = Integer.parseInt(lineaDeEntrada);
  
  System.out.print("Introduce el 3º importe: ");
  lineaDeEntrada = System.console().readLine();
  factura3 = Integer.parseInt(lineaDeEntrada);
  
  ivafactura1= factura1*1.21;
  ivafactura2= factura2*1.21;
  ivafactura3= factura3*1.21;
  
  
  resultado = ivafactura1 + ivafactura2 + ivafactura3;
  
  System.out.printf("El importe total es: "+resultado);
    
  }
}
