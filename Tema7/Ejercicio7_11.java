public class Ejercicio7_11{
  public static void main(String[] arg){
    
  System.out.println("Introduce 10 numeros por teclado despues se van a ordenador por numeros primos primero");
  
  int[] num = new int[10];
  int[] aux = new int[10];
  int contador = 0;
  int contadorPrimo = 0;
  
  for (int i = 0;i<=9;i++){
    System.out.print("Introduce el valor en la posicion "+i+": ");
    num[i] = Integer.parseInt(System.console().readLine());
    contadorPrimo = 0;
    for (int j = 1;j<=num[i];j++){
      if (num[i]%j == 0){
        contadorPrimo++;
        }
      }
    if (contadorPrimo <= 2){
      aux[contador] = num[i];
      contador++;
      }
    
    }
    
  for (int i=0;i<=9;i++){
    contadorPrimo = 0;
    for (int j = 1;j<=num[i];j++){
      if (num[i]%j == 0){
        contadorPrimo++;
        }
      }
    if (contadorPrimo >= 3){
      aux[contador] = num[i];
      contador++;
      }
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
  System.out.println();
  
  System.out.print("indice ");
  for (int i=0;i<=9;i++){
    System.out.printf("%4d",i);
    } 
    System.out.println();
    System.out.print("valor  ");
  for (int i = 0;i<=9;i++){
    System.out.printf("%4d",aux[i]);
    }
  
  
  }
}
