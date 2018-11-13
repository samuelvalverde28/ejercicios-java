public class Ejercicio7_8{
  public static void main(String[] arg){
    
  System.out.println("Introduce la temperatura media de cada mes de este año:");
  
  int[] num = new int[12];
  int contador = 1;
  
  for (int i = 0;i<=11;i++){
    System.out.print("mes "+contador+": ");
    num[i] = Integer.parseInt(System.console().readLine());
    contador++;
    
    }
  contador = 1;  
  
  for (int x = 0;x<=11;x++){
    System.out.print("mes "+contador+": ");
    contador++;
    
    for (int j = 1;j<=num[x];j++){
      System.out.print("*");
      }
    System.out.print("\n");
    
    }
  
  
  
  }
}
