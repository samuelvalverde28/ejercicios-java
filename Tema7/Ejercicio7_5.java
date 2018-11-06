public class Ejercicio7_5{
  public static void main(String[] arg){
    
  System.out.println("Introduce 10 numeros te digo cual es el maximo y el minimo:");
  
  int[] num = new int[10];
  int maximo = 0;
  int minimo = 999;
  
  for (int i = 0;i<=9;i++){
    num[i] = Integer.parseInt(System.console().readLine());
    }
  
  
  for (int j = 0;j<=9;j++){
    
    if (maximo < num[j]){
      maximo = num[j];
      }
    
    if (minimo > num[j]){
      minimo = num[j];
      }
    
    }
    
    
  for (int x = 0;x<=9;x++){
    System.out.print(num[x]);
    if (num[x] == maximo){
      System.out.print(" es el numero maximo");
      }
      
    if (num[x] == minimo){
      System.out.print(" es el numero minimo");
      }
      
    System.out.println();
    }  
  
  
  
  }
}
