public class Ejercicio7B_2{
  public static void main(String[] arg){
  
  System.out.println("Introduce 20 numeros enteros");
  
  int[][] num = new int[4][5];   //4 filas 5 columnas
  int[][] aux = new int [5][6];

  
  for (int i= 0;i<4;i++){
    for (int x = 0;x<5;x++){
      num[i][x] = Integer.parseInt(System.console().readLine());
      aux[i][x] = num[i][x];
      }
    }
  //relleno el arraid num y aux
  
  for (int i=0;i<4;i++){
    for (int x=0;x<5;x++){
        aux[i][5] += num[i][x];
      }
    }
  //se calcula la suma de las filas en la columna 6
  
  
  for (int i=0;i<6;i++){
    for (int x=0;x<4;x++){
        aux[4][i] += aux[x][i];
      }
    }
  //se calcula la suma de las columnas en la fila 5
  
  
  
  
  for (int i=0;i<5;i++){
    System.out.println();
    for (int x=0;x<6;x++){
       System.out.print(aux[i][x]+" ");
      }
    }
  //se muestra
  
  
  }
}
