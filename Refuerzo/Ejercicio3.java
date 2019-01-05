/**
*
*
* @author Samuel Valverde Garcia
*/

public class Ejercicio3{
  public static void main(String[] arg){
    System.out.println("Introduce la longitud del array");
    int longitud = Integer.parseInt(System.console().readLine());
    int[] array = new int[longitud];
    
    for (int i=0;i<=(longitud-1);i++){
      System.out.println("Introduce un numero entero");
      array[i] = Integer.parseInt(System.console().readLine());
      }
    
    System.out.println("Array normal normal");
    for (int x=0;x<=(longitud-1);x++){
      System.out.println(array[x]);
      }
    
    System.out.println("Array normal inverso");
    for (int x=(longitud-1);x>=0;x--){
      System.out.println(array[x]);
      }
    
    int aux;
    for (int x=0;x<array.length/2;x++){
      aux = array[x];
      array[x]= array[array.length-1-x];
      array[array.length-1-x] = aux;
      }
    
    System.out.println("Array inverso normal");
    for (int x=0;x<=(longitud-1);x++){
      System.out.println(array[x]);
      }
    
    System.out.println("Array inverso inverso");
    for (int x=(longitud-1);x>=0;x--){
      System.out.println(array[x]);
      }
    
    
    }
  
  }
