public class Ejercicio5_24{
  public static void main(String[] arg){
    
  System.out.print("Introce la altura que tenga la piramide: ");
  int alturaintroducida = Integer.parseInt(System.console().readLine());
  
  int aux = alturaintroducida;
  alturaintroducida = 1;
  
  int blanco = aux-1;

   
  int numero = 1;
  
  
  while (alturaintroducida <= aux){ //altura
    
    
    for (numero = 1;numero <= blanco;numero++){ //espacio
      System.out.print(" ");
      
      }
    
   
    for (numero = 1;numero < alturaintroducida;numero++){
      System.out.print(numero);
      
      }
    
    
    
    for (numero = alturaintroducida;numero>0;numero--){
      System.out.print(numero);     
      
      }
    
    
    System.out.println();
    
    alturaintroducida++;
    blanco--;
    
    }
     
    }
    
  }
