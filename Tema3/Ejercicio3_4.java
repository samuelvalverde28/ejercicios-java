import java.util.Scanner;

public class Ejercicio3_4{
  public static void main(String[] arg){
  
  int numero1;
  int numero2;
  int sumaNumero;
  int restaNumero;
  int multiNumero;
  int divNumero;
  
  
  Scanner escanerEntrada = new Scanner(System.in);
  
  
  System.out.print("Introduce los valores para sumar, restar, multiplicar y dividir:");
  
  numero1 = escanerEntrada.nextInt();
  numero2 = escanerEntrada.nextInt();

  sumaNumero = numero1 + numero2;
  restaNumero = numero1 - numero2;
  multiNumero = numero1 * numero2;
  divNumero = numero1 / numero2;
  
  System.out.println("La suma es: "+sumaNumero);
  System.out.println("La resta es: "+restaNumero);
  System.out.println("La multiplicacion es: "+multiNumero);
  System.out.println("La division es: "+divNumero);
    
  }
}
