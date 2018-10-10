public class Ejercicio4_18{
  public static void main(String[] arg){
  
  System.out.println("Introduzca el numero para decirte el primer valor ");
  
  int numero = Integer.parseInt(System.console().readLine());
  int resnumero;
  
  if (numero < 10){
  resnumero = numero;
  System.out.println("Tu ultimo numero es: "+resnumero);
    } else if (numero < 100){
      resnumero = numero / 10;
      System.out.println("Tu ultimo numero es: "+resnumero);
      } else if (numero < 1000){
        resnumero = numero / 100;
        System.out.println("Tu ultimo numero es: "+resnumero);
        } else if (numero < 10000){
          resnumero = numero / 1000;
          System.out.println("Tu ultimo numero es: "+resnumero);
          } else if (numero < 100000){
            resnumero = numero / 1000;
            System.out.println("Tu ultimo numero es: "+resnumero);
            } 
  

    
  }
}
