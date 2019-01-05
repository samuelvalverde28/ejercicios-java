/**
*
*
* @author Samuel Valverde Garcia
*/

public class Ejercicio1{
  public static void main(String[] arg){
    System.out.println("Introduce la longitud del array");
    int longitud = Integer.parseInt(System.console().readLine());
    int[] array = new int[longitud];
    
    for (int i=0;i<=(longitud-1);i++){
      System.out.println("Introduce un numero entero");
      array[i] = Integer.parseInt(System.console().readLine());
      }
    
    for (int x=(longitud-1);x>=0;x--){
      System.out.println(array[x]);
      }
    
    }
  
  }
