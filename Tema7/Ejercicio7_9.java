public class Ejercicio7_9{
  public static void main(String[] arg){
    
  System.out.println("Introduce 8 numeros:");
  
  int[] num = new int[8];
  int aux;
  
  for (int i = 0;i<=7;i++){
    num[i] = Integer.parseInt(System.console().readLine());
    }
  
  for (int j = 0;j<=7;j++){
    aux = num[j] % 2;
    if (aux == 0){
      System.out.println(num[j]+" es par");
      } else {
        System.out.println(num[j]+" es impar");
        }
    }
  
  
  
  
  }
}
