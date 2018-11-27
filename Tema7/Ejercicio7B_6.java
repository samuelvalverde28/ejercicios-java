public class Ejercicio7B_6{
  public static void main(String[] arg){
  
  System.out.println("De 60 numeros aleatoris va a decir el minimo y el maximo ");
  
  int[][] num = new int[6][10];   //6 filas 10 columnas
  

  //relleno el arraid num y aux
  boolean repetido;
  int k;
  for (int i= 0;i<6;i++){
    for (int x = 0;x<10;x++){
      do{
      num[i][x] = (int)((Math.random()*1001));
      
      repetido = false;
      for (k=0;k<10*i+x;k++){
        if (num[i][x]==num[i/10][i%10]){
          repetido=true;
          }
        }
      
      
        }while (repetido);
      }
    }
  
  
  //se muestra
  for (int i=0;i<6;i++){
    System.out.println();
    for (int x=0;x<10;x++){
       System.out.print(num[i][x]+" ");
      }
    }
    
    
  //maximo
  int mayor = 0;
  int filaMax = 0;
  int columnaMax = 0;
  for (int i=0;i<6;i++){
    for (int x=0;x<10;x++){
      if (mayor < num[i][x]){
        mayor = num[i][x];
        filaMax = i;
        columnaMax = x;
        }
      }
    }
    
    
  System.out.println();
  System.out.println("El numero maximo "+mayor+" esta en la fila "+(filaMax+1)+" y en la columna "+(columnaMax+1));
  
  //minimo
  int minimo = 1000;
  int filaMin = 0;
  int columnaMin = 0;
  for (int i=0;i<6;i++){
    for (int x=0;x<10;x++){
      if (minimo > num[i][x]){
        minimo = num[i][x];
        filaMin = i;
        columnaMin = x;
        }
      }
    }
    
  System.out.println("El numero maximo "+minimo+" esta en la fila "+(filaMin+1)+" y en la columna "+(columnaMin+1));
  
  
  }
}
