public class Ejercicio5_19{
  public static void main(String[] arg){
    
  System.out.print("Introce la altura que tenga la piramide: ");
  int alturaintroducida = Integer.parseInt(System.console().readLine());
  
  System.out.print("Introce el caracter con el que se rellene: ");
  String caracter = System.console().readLine();
  int altura = 1;
  
  int blanco = alturaintroducida-1;
  int blancoaux = 1;
  
  int lineaaux = 1;
  int linea = 1;
  
  while (altura <= alturaintroducida){ //altura
    
    
    for (blancoaux = 1;blancoaux <= blanco;blancoaux++){
      System.out.print(" ");
      
      }
    
    // while (blancoaux <= blanco){ //espacios
    // System.out.print(" ");
    // blancoaux++;
    // }
    
    for (lineaaux = 1;lineaaux <= linea;lineaaux++){
      System.out.print(caracter);
      
      }
    
    // while (lineaaux <= linea){ //caracter
    //  System.out.print(caracter);
    //  lineaaux++;
    //  }
    
    
    
    System.out.println();
    blanco--;
    altura++;
    linea +=2;
    
    }
 
 
  
  
  }
} 
