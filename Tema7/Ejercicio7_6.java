public class Ejercicio7_6{
  public static void main(String[] arg){
    
  System.out.println("Introduce 15 numeros y se van a desplazar todos 1:");
  
  int[] num = new int[15];
  int[] num2 = new int[15];
  int aux;
  
  for (int i = 0;i<=14;i++){
    num[i] = Integer.parseInt(System.console().readLine());
    }
  
  aux = num[14];
  
  
  for (int j = 1;j<=14;j++){
    num2[j] = num[j-1];
    }
  num2[0] = aux;
  
  for (int x = 0;x<=14;x++){
    System.out.println(num2[x]);
    }
  
  
  
  }
}
