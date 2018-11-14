public class Ejercicio7_12{
  public static void main(String[] arg){
    
  System.out.println(" ");
  
  int[] num = new int[10];
  
  for (int i = 0;i<=9;i++){
    System.out.print("Indique el valor de la posicion "+i+": ");
    num[i] = Integer.parseInt(System.console().readLine());
    }
    
  System.out.print("indice ");
  for (int i=0;i<=9;i++){
    System.out.printf("%4d",i);
    } 
    System.out.println();
    System.out.print("valor  ");
  for (int i = 0;i<=9;i++){
    System.out.printf("%4d",num[i]);
    }
  
  System.out.println();
  
  int posInicial =0;
  int posFinal = 0;
  
  boolean bucle = false;
  while (bucle == false){
  System.out.print("Introduce el numero de posicion inicial: ");
  posInicial = Integer.parseInt(System.console().readLine());
  System.out.print("Introduce el numero de posicion donde quieres que se coloque el valor de la posicion "+posInicial+": ");
  posFinal = Integer.parseInt(System.console().readLine());
  
  if (posInicial < posFinal){
    bucle = true;
    } else {
      System.out.println("Introduce el numero inicial menor que el final");
      }
  }
  
  
  int numFinal = num[9];
  
  for (int i=9;i>=(posFinal+1);i--){
    num[i] = num[i-1];
    }
  
  num[posFinal] = num[posInicial];
  
  for (int i=num[posInicial];i>=1;i--){
    num[i] = num[i-1];
    }
  num[0] = numFinal;
  

  
  System.out.print("indice ");
  for (int i=0;i<=9;i++){
    System.out.printf("%4d",i);
    } 
    System.out.println();
    System.out.print("valor  ");
  for (int i = 0;i<=9;i++){
    System.out.printf("%4d",num[i]);
    }
  
  
  }
}
