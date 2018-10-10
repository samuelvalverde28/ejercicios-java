public class Ejercicio4_20{
  public static void main(String[] arg){
  
  System.out.println("Introduzca un numero para saber si es capicua");
  
  int numero = Integer.parseInt(System.console().readLine());
  
  if (numero==11||numero==22||numero==33||numero==44||numero==55||numero==66||numero==77||numero==88||numero==99){
    System.out.println("Tu numero es capicua");
    }
  
  if (numero >= 100 && numero < 1000){
    if (numero / 100 == numero % 10){
      System.out.println("Tu numero es capicua");
      }
  }
  
  if (numero >= 1000 && numero < 10000){
    if  (((( numero / 10 ) % 10)== (( numero / 100) % 10)) && ((numero / 1000) == (numero % 10))){
      System.out.println("Tu numero es capicua");
      }
  }
  
  if (numero >= 10000 && numero < 100000){
    if (((( numero / 10) % 10)== (( numero / 1000) % 10)) && ((numero / 10000) == (numero % 10))){
      System.out.println("Tu numero es capicua");
      }
  }
  

    
  }
}
