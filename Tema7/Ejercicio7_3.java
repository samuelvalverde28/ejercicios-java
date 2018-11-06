public class Ejercicio7_3{
  public static void main(String[] arg){
    
  System.out.println("Introduce 10 numeros para luego ponerlos al reves:");
  
  int[] num = new int[10];
  
  
  for (int i = 0;i<=9;i++){
    num[i] = Integer.parseInt(System.console().readLine());
    }
  
  
  for (int j = 9;j>=0;j--){
    
    System.out.println(num[j]);
    
    }
  
  
  
  }
}
