public class Ejercicio4_19{
  public static void main(String[] arg){
  
  System.out.println("Introduzca un numero para decirte los digitos que tiene");
  
  int numero = Integer.parseInt(System.console().readLine());
  
  if (numero < 10){
  System.out.println("Tu ultimo numero tiene 1 digito");
    } else if (numero >= 10 && numero < 100){
      System.out.println("Tu ultimo numero tiene 2 digitos");
      } else if (numero >= 100 && numero < 1000){
        System.out.println("Tu ultimo numero tiene 3 digitos");
        } else if (numero >= 1000 && numero < 10000){
          System.out.println("Tu ultimo numero tiene 4 digitos");
          } else if (numero >= 10000 && numero < 100000){
            System.out.println("Tu ultimo numero tiene 5 digitos");
            } else {
             System.out.println("he dicho 5 digitos");
              }
  }
}
