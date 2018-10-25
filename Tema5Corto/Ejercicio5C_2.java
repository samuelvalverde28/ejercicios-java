public class Ejercicio5C_2{
  public static void main(String[] arg){
    
  System.out.print("Introduce la cantidad de numeros: ");
  int Cnumero = Integer.parseInt(System.console().readLine());
  
  System.out.print("Introduce el primer numero: ");
  int Pnumero = Integer.parseInt(System.console().readLine());
  
  for (int i = 1;i <= Cnumero;i++){
    
    System.out.print(Pnumero);
    Pnumero++;
    if (i != Cnumero){
      System.out.print(" - ");
      }
    
    }
  
  
  
  
  }
} 
