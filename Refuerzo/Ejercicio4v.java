/**
*
*
* @author Samuel Valverde Garcia
*/

public class Ejercicio4v{
  public static void main(String[] arg){
    System.out.println("Introduce la longitud de los arrays");
    int longitud = Integer.parseInt(System.console().readLine());
    int[] enteros = new int[longitud];
    String[] palabras = new String[longitud];
    String[] alternativa = new String[longitud];
    
    for (int i=0;i<=(longitud-1);i++){
      System.out.println("Introduce una palabra");
      palabras[i] = System.console().readLine();
      boolean salir= false;
      while (!salir){
        System.out.println("Introduce un numero entero compredido entre 0 y "+(longitud-1)+" y no se repita");
        enteros[i] = Integer.parseInt(System.console().readLine());
        int contador = 0;
        for (int x=0;x<=(longitud-1);x++){
          if (enteros[i] == enteros [x]){
            contador++;
            }
          }
        if (contador <2){
          salir = true;
          }
        }
      }
      
    //for(int i=0;i<=(longitud-1);i++){
    //  System.out.println(palabras[i]+" "+enteros[i]);
    //  }
      
      
    for(int i=0;i<=(longitud-1);i++){
      for(int x=0;x<=(longitud-1);x++){
        if (enteros[x]==i){
          alternativa[i] = palabras[x];
          }
        }
      }
    for (int i=0;i<=(longitud-1);i++){
      System.out.println(alternativa[i]);
      } 
    }  
  }  
