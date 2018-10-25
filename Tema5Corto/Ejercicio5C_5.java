public class Ejercicio5C_5{
  public static void main(String[] arg){
    
  System.out.print("Introduce un numero: ");
  int numero = Integer.parseInt(System.console().readLine());
  
  

  for (int i = 1;i <= numero;i++){
    
    System.out.print(i);
    System.out.print("\n");
    
    for (int j = 1; j<=i;j++){
      System.out.print(" ");
      }
    
  
    }

  
   System.out.println();
  
  for (int h = 1;h <= numero; h++){
    int aux = 1;
    for (int l = 1;l<=h;l++){
      System.out.print(aux);
      aux++;
      }
     
     System.out.print("\n");
    
    for (int k = 1; k<=h;k++){
      System.out.print(" ");
      }
    
    
    }
  
  System.out.println();
  
  for (int p = 1;p <= numero; p++){
    int aux = numero;
    for (int l = 1;l<=p;l++){
      System.out.print(aux);
      aux--;
      }
     
     System.out.print("\n");
    
    for (int k = 1; k<=p;k++){
      System.out.print(" ");
      }
  
    }
  
  
  }
}
