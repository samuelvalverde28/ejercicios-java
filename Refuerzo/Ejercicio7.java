/**
*
*
* @author Samuel Valverde Garcia
*/

public class Ejercicio7{
  public static void main(String[] arg){
    System.out.println("Introduce la longitud del array final, 2 = 2x2(4), 3 = 3x3(9) ...");
    int longitud = Integer.parseInt(System.console().readLine());
    int unidimensional = (longitud*longitud);
    int[] enterosuno = new int[unidimensional];
    
    
    for (int i=0;i<=(unidimensional-1);i++){
      System.out.println("Introduce un numero posicion "+i);
      enterosuno[i] = Integer.parseInt(System.console().readLine());
      }
      
    System.out.println("array unidimensional");
    for (int i=0;i<=(unidimensional-1);i++){
      System.out.print(enterosuno[i]+" ");
      }
    
    cuadricularVector(enterosuno,longitud);
    
    
    
    }
    
  public static int[][] cuadricularVector (int[] enterosuno, int longitud){
    int[][] enterosdos = new int[longitud][longitud];
    
    int contador = 0;
    for (int i=0;i<=(longitud-1);i++){
      for (int x=0;x<=(longitud-1);x++){
        enterosdos[i][x] = enterosuno[contador];
        contador++;
        }
      }
    System.out.println();
    System.out.println("array bidimensional");
    for (int i=0;i<=(longitud-1);i++){
      for (int x=0;x<=(longitud-1);x++){
        System.out.print(enterosdos[i][x]+" ");
        }
        System.out.print("\n");
      }
    
    return enterosdos;
    
    }
    
    
    
    
    
  }
