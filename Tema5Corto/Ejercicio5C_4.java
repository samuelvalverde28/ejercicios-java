public class Ejercicio5C_4{
  public static void main(String[] arg){
    
  System.out.print("Introduce el numero mas alto: ");
  int alto = Integer.parseInt(System.console().readLine());
  
  System.out.print("Introduce el numero mas bajo: ");
  int bajo = Integer.parseInt(System.console().readLine());
  
  System.out.print("Introduce el salto: ");
  int salto = Integer.parseInt(System.console().readLine());
  
  while(alto > bajo){
    
    System.out.print(alto);
    alto-=salto;
    if (alto > bajo){
      System.out.print(" - ");
      }
    
    }
  
  
  
  
  }
}
