public class Ejercicio7B_8{
  public static void main(String[] arg){
  System.out.println("Juego del Ajedrez con Alfil");
  
  int[][] num = new int[8][8];   //8 filas 8 columnas
  
  System.out.println("Introduce la posición del Alfil: ");
  String posAl = System.console().readLine();
  int columnaAl = (int)(posAl.charAt(0)-96);   //paso de la cadena de string a numero
  int filaAl = (int)(posAl.charAt(1)-48);
  
  
  System.out.println("El Alfil se puede mover en las siguientes direcciones: ");
  
  for (int i=8;i>=1;i--){  //i = fila
    for (int j=1;j<=8;j++){   //j = columna
      if ((Math.abs(filaAl -i) == Math.abs(columnaAl -j)) && (!((filaAl == i) && (columnaAl == j)))){
        System.out.print((char)(j+96)+ "" +i+" ");
      }
      
    }
  }
  
    
  }
}
