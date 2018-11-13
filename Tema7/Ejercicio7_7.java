public class Ejercicio7_7{
  public static void main(String[] arg){
    
  System.out.println("100 numeros aleatorios del 0 al 20:");
  
  int[] num = new int[100];
  
  
  for (int i = 0;i<=99;i++){
    num[i] = (int)((Math.random()*101));
    System.out.print(num[i]+" ");
    }
  System.out.println();
  
  System.out.println("Introduce dos numero ");  
  int x = Integer.parseInt(System.console().readLine());
  int y = Integer.parseInt(System.console().readLine());
  
  for (int j = 0;j<=99;j++){
    if (num[j]==x){
      num[j] = y;
      System.out.print("'"+num[j]+"' ");
      }else{
        System.out.print(num[j]+" ");
        }
    }
  
  
  
  
  
  }
}
