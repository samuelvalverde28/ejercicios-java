public class Ejercicio6_5{
  public static void main(String[] arg){
    
    
  System.out.println("Se va a mostrar 50 numeros al azar comprendidos entre 100 y 199 ambos incluidos: ");
  
  int numero;
  int maximo = 0;
  int minimo = 200;
  int aux = 0;
  
  for (int i = 1;i<=50;i++){
  
  numero = (int)((Math.random()*100)+100);
  
  if (numero > maximo){
    maximo = numero;
    }
    
  if (numero < minimo){
    minimo = numero;
    }  
    
  aux = aux + numero;
  
  if (i == 50){
    System.out.print(numero+" \n");
    }else {
      System.out.print(numero+" ");
      }
  
  
  }
  
  System.out.println("El numero maximo es "+maximo);
  System.out.println("El numero minimo es "+minimo);
  aux = aux/50;
  System.out.println("La media de los 50 numeros es "+aux);
  
  }
}
