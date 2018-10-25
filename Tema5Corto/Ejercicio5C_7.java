public class Ejercicio5C_7{
  public static void main(String[] arg){
    
  System.out.print("Introduce un numero: ");
  int numero = Integer.parseInt(System.console().readLine());
  int auxc1 = numero;
  int auxc2 = numero;
  int auxc3 = numero;
  int auxc4 = numero;
  for (int i = 1;i <= numero;i++){
    
    
    for (int k = auxc1;k>1;k--){
      System.out.print(" ");
      }
    auxc1--;
    
    for (int j=1; j<=i;j++){
      System.out.print(i);
      }
    
    System.out.print("\n");
    
    }
    
    
  
  System.out.println();
  
  
  
  int auxn = numero;
  
  for (int i = 1;i <= numero;i++){
    
    for (int k = auxc2;k>1;k--){
      System.out.print(" ");
      }
    auxc2--;
    
    for (int j=1; j<=i;j++){
      System.out.print(auxn);
      }
    
    auxn--;
    
    System.out.print("\n");
    
    }
  
  
  System.out.println();
  
  
  
  for (int i = 1;i <= numero;i++){
    
    for (int k = auxc3;k>1;k--){
      System.out.print(" ");
      }
    auxc3--;

    
    int aux = 1;
    
    for (int j=1; j<=i;j++){
      System.out.print(aux);
      aux++;
      }
    
    System.out.print("\n");
    
    }
  
  
  
  
  
  System.out.println();
  
  
  
  for (int i = 1;i <= numero;i++){
    
    for (int k = auxc4;k>1;k--){
      System.out.print(" ");
      }
    auxc4--;
    
    
    int aux = numero;
    
    for (int j=1; j<=i;j++){
      System.out.print(aux);
      aux--;
      }
    
    System.out.print("\n");
    
    }
  
  
  
    
  }
}
