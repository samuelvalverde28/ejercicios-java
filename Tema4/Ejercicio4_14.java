public class Ejercicio4_14{
  public static void main(String[] arg){
  
  System.out.println("Introduzca el numero para saber si es divisible entre 2 y 5: ");
  
  int numero = Integer.parseInt(System.console().readLine());
  int resnumeropar;
  int resnumerocinco;
  
  resnumeropar = numero % 2;
  resnumerocinco = numero % 5;
  
  if (resnumeropar == 1){
    System.out.println("el numero es impar");
    } else {
      System.out.println("el numero es par");
      }
      
  if (resnumerocinco == 1){
    System.out.println("el numero no es divisible entre 5");
    } else {
      System.out.println("el numero es divisible entre 5");
      }
    
  }
}
