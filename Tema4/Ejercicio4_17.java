public class Ejercicio4_17{
  public static void main(String[] arg){
  
  System.out.println("Introduzca el numero para decirte el ultimo valor ");
  
  int numero = Integer.parseInt(System.console().readLine());
  int resnumero;
  
  resnumero = numero % 10;
  
  System.out.println("Tu ultimo numero es: "+resnumero);
    
    
  }
}
