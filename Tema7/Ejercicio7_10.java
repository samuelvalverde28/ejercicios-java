public class Ejercicio7_10{
  public static void main(String[] arg){
    
  System.out.println("Se va a generar 20 numeros y te los va a agrupar primero en pares y luego en impares:");
  
  int[] num = new int[20];
  int[] aux = new int[20];
  int contador = 0;
  
  for (int i = 0;i<=19;i++){
    num[i] = (int)((Math.random()*101));
    System.out.print(num[i]+" ");
    }
    
  for (int x = 0;x<=19;x++){
    if (num[x]%2 == 0){
      aux[contador] = num[x];
      contador++;
      }
    }
  
  for (int p = 0;p<=19;p++){
    if (num[p]%2 != 0){
      aux[contador] = num[p];
      contador++;
      }
    }
  System.out.println();
  for (int s = 0;s<=19;s++){
    System.out.print(aux[s]+" ");
    }
  
  
  }
}
