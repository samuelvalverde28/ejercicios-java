public class Ejercicio7_13{
  public static void main(String[] arg){
    
  System.out.println("100 numeros aleatorios del 0 al 500:");
  
  int[] num = new int[100];
  int maximo = 0;
  int minimo = 999;
  
  for (int i = 0;i<=99;i++){
    num[i] = (int)((Math.random()*501));
    System.out.print(num[i]+" ");
    
    if (num[i] > maximo){
      maximo = num[i];
      }
      
    if (num[i] < minimo){
      minimo = num[i];
      }
      
    
    }
  System.out.println();
  
  System.out.println("¿Qué quieres destacar? (1 - mínimo, 2 - máximo)");  
  int x = Integer.parseInt(System.console().readLine());
  
  if (x == 1){
    
    for (int j = 0;j<=99;j++){
      if (num[j]== minimo){
        System.out.print("**"+num[j]+"** ");
        } else {
          System.out.print(num[j]+" ");
          }
      
      }
    
    }else if (x == 2){
      
      for (int p = 0;p<=99;p++){
        if (num[p]== maximo){
          System.out.print("**"+num[p]+"** ");
          }else{
            System.out.print(num[p]+" ");
            }
        
        }
      
      }
  
  
  
  
  }
}
