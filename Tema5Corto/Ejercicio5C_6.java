public class Ejercicio5C_6{
  public static void main(String[] arg){
    
  System.out.print("Introduce un numero: ");
  int numero = Integer.parseInt(System.console().readLine());
  
  for (int i = 1;i <= numero;i++){
    
    for (int j=1; j<=i;j++){
      System.out.print(i);
      }
    
    System.out.print("\n");
    
    }
    
    
  
  System.out.println();
  
  
  
  int auxn = numero;
  
  for (int i = 1;i <= numero;i++){
    
    
    
    for (int j=1; j<=i;j++){
      System.out.print(auxn);
      }
    
    auxn--;
    
    System.out.print("\n");
    
    }
  
  
  System.out.println();
  
  
  
  for (int i = 1;i <= numero;i++){
    
    int aux = 1;
    
    for (int j=1; j<=i;j++){
      System.out.print(aux);
      aux++;
      }
    
    System.out.print("\n");
    
    }
  
  
  
  
  
  System.out.println();
  
  
  
  for (int i = 1;i <= numero;i++){
    
    int aux = numero;
    
    for (int j=1; j<=i;j++){
      System.out.print(aux);
      aux--;
      }
    
    System.out.print("\n");
    
    }
  
  
  
    
  }
}
