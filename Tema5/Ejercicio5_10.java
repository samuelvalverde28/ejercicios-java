public class Ejercicio5_10{
  public static void main(String[] arg){
    
    
    int acumulador = 0;
    int sumando;
    
    
    
    do{
      System.out.print("Introduzca los numeros que quieres sumar (un numero negativo para terminar): ");
      sumando = Integer.parseInt(System.console().readLine());
      if (sumando >0){
      acumulador = acumulador + sumando;
    }
      } while (sumando >=0);
    
    System.out.println("La suma de los numeros introducidos es: "+ acumulador);
     
    }
    
  }
